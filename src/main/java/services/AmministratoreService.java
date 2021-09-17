package services;


import entity.Anagrafica;
import entity.CartellaClinica;
import entity.Login;
import entity.Login.Ruolo;
import net.bytebuddy.utility.RandomString;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

import static services.LoginService.getSession;

/**
 * Classe service per la gestione delle operazioni di amministrazione
 */
public class AmministratoreService {

    /**
     * Verifica che il codice fiscale inserito è presente nel database
     * @param codiceFiscale codice fiscale inserito
     * @return true se è presente , false se non è presente
     */
    public static boolean isCodiceFiscalePresentInDB(String codiceFiscale) {
        Session session = getSession();
        assert session != null;
        session.beginTransaction();
        Query query = session.createQuery(String.format("from Anagrafica a where a.codice_fiscale = %s", codiceFiscale));
        query.setParameter("codiceFiscale", codiceFiscale);
        List a = query.list();
        return a.isEmpty();
    }

    public static boolean addUtente (String nome, String cognome, String codiceFiscale, String email, String telefono, String ospedale, String specializzazione) {
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

    /**
     * Rimuove dal db l'anagrafica dell'utente dato il suo codice fiscale
     * @param codiceFiscale  codice fiscale dell'utente
     * @return true se è andata a buon fine
     */
    public static boolean removeUtente(String codiceFiscale) {
        Anagrafica utente = findAnagraficaUtenteByCodiceFiscale(codiceFiscale);
        Login loginUtente = findLoginUtenteByCodiceFiscale(codiceFiscale);
        try {
            Session session =getSession();
            assert session != null;
            session.beginTransaction();
            session.remove(utente);
            session.remove(loginUtente);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Cerca il login dell'utente dato il suo codice fiscale
     * @param codiceFiscale codice fiscale dell'utente
     * @return    login dell'utente
     */
    private static Login findLoginUtenteByCodiceFiscale(String codiceFiscale) {
        try {
            Session session =getSession();
            assert session != null;
            session.beginTransaction();
            Query query = session.createQuery("from Login l where l.username = :codiceFiscale");
            query.setParameter("codiceFiscale", codiceFiscale);
            List utente = query.list();
            if(utente.size() == 1){
                return (Login) utente.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Cerca l'anagrafica dell'utente dato il suo codice fiscale
     * @param codiceFiscale codice fiscale dell'utente
     * @return    anagrafica dell'utente
     */
    public static Anagrafica findAnagraficaUtenteByCodiceFiscale(String codiceFiscale) {
        try {
            Session session =getSession();
            assert session != null;
            session.beginTransaction();
            Query query = session.createQuery("from Anagrafica a where a.codice_fiscale = :codiceFiscale");
            query.setParameter("codiceFiscale", codiceFiscale);
            List utente = query.list();
            if(utente.size() == 1){
                return (Anagrafica) utente.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Cerca la cartella clinica dell'utente dato il suo codice fiscale
     * @param codiceFiscale codice fiscale dell'utente
     * @return    cartella clinica dell'utente
     */
    public static CartellaClinica findCartellaClinicaUtenteByCodiceFiscale(String codiceFiscale) {
        try {
            Session session =getSession();
            assert session != null;
            session.beginTransaction();
            Query query = session.createQuery("from CartellaClinica cc where cc.idPaziente = :codiceFiscale");
            query.setParameter("codiceFiscale", codiceFiscale);
            List utente = query.list();
            if(utente.size() == 1){
                return (CartellaClinica) utente.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * Crea e salva un nuovo login per un nuovo utente dato il suo codice fiscale
     * @param codiceFiscale     codice fiscale dell'utente da usare come username
     * @param ruolo     ruolo del nuovo utente
     * @return nuovo login per l'utente
     */
    public static Login createAndSaveNewLogin(String codiceFiscale, Ruolo ruolo) {
        Session session = getSession();
        assert session != null;
        session.beginTransaction();
        Login login = new Login(codiceFiscale, RandomString.make(), ruolo);
        session.save(login);
        session.getTransaction().commit();
        return login;
    }

    /**
     * Salva la nuova cartella clinica nel db
     * @param cartellaClinica   cartella clinica da salvare
     */
    public static void saveNewCartellaClinica(CartellaClinica cartellaClinica) {
        Session session = getSession();
        assert session != null;
        session.beginTransaction();
        session.save(cartellaClinica);
        session.getTransaction().commit();

    }
}
