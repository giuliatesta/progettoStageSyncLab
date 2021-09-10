package services;


import entity.Anagrafica;
import entity.Login;
import net.bytebuddy.utility.RandomString;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

import static entity.Login.Ruolo.MEDICO;
import static services.LoginService.getSession;

public class AmministratoreService {

    public static boolean isCodiceFiscaleValid(String codiceFiscale) {
        Session session = getSession();
        assert session != null;
        session.beginTransaction();
        Query query = session.createQuery(String.format("from Anagrafica a where a.codice_fiscale = %s", codiceFiscale));
        query.setParameter("codiceFiscale", codiceFiscale);
        List a = query.list();
        return a.isEmpty();
    }

    public static boolean addMedico(String nome, String cognome, String codiceFiscale, String email, String telefono, String ospedale, String specializzazione) {
        Anagrafica medico = new Anagrafica(codiceFiscale, nome, cognome, email, telefono);
        if(!"".equals(ospedale) && ospedale != null) {
            medico.setOspedale(ospedale);
        } else if(!"".equals(specializzazione) && specializzazione != null) {
            medico.setSpecializzazione(specializzazione);
        }

        try {
            Session session = getSession();
            assert session != null;
            session.beginTransaction();
            session.save(medico);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean removeMedico(String codiceFiscale) {
        Anagrafica medico = findMedicoByCodiceFiscale(codiceFiscale);
        System.out.println("6");
        try {
            Session session =getSession();
            System.out.println("7");
            assert session != null;
            System.out.println("8");
            session.beginTransaction();
            System.out.println("9");
            session.remove(medico);
            System.out.println("10");
            session.getTransaction().commit();
            System.out.println("11");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Anagrafica findMedicoByCodiceFiscale(String codiceFiscale) {
        try {
            Session session =getSession();
            session.beginTransaction();
            System.out.println("1");
            assert session != null;
            System.out.println("2");
            Query query = session.createQuery("from Anagrafica a where a.codice_fiscale = :codiceFiscale");
            query.setParameter("codiceFiscale", codiceFiscale);
            System.out.println("4");
            List paziente = query.list();
            if(paziente.size() == 1){
                System.out.println("5");
                return (Anagrafica) paziente.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Login createAndSaveNewLogin(String codiceFiscale) {
        Session session = getSession();
        session.beginTransaction();
        Login login = new Login(codiceFiscale, RandomString.make(), MEDICO);
        session.save(login);
        return login;
    }
}
