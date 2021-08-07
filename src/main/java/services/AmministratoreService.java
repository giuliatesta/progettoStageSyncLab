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
        session.beginTransaction();
        Query query = session.createQuery("from Anagrafica a where a.codiceFiscale = :codiceFiscale");
        query.setParameter("codiceFiscale", codiceFiscale);
        List a = query.list();
        return a.isEmpty();
    }

    public static boolean aggiungiMedico(String nome, String cognome, String codiceFiscale, String email, String telefono, String ospedale, String specializzazione) {
        Anagrafica medico = new Anagrafica(codiceFiscale, nome, cognome, email, telefono);
        if("" != ospedale && ospedale != null) {
            medico.setOspedale(ospedale);
        } else if("" != specializzazione && specializzazione != null) {
            medico.setSpecializzazione(specializzazione);
        }

        try {
            Session session = getSession();
            session.beginTransaction();
            session.save(medico);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static Login createLogin(String codiceFiscale) {
        Session session = getSession();
        session.beginTransaction();
        Login login = new Login(codiceFiscale, RandomString.make(), MEDICO);
        session.save(login);
        return login;
    }
}
