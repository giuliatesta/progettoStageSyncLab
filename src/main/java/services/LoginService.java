package services;

import entity.Anagrafica;
import entity.CartellaClinica;
import entity.Login;
import entity.Login.Ruolo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Classe service per la gestione del login
 */
public class LoginService {

    /**
     * Controlla se l'utente ha un login già presente
     * @param codiceFiscale username utente
     * @param password  password utente
     * @return  true, se è presente e false se non lo è
     */
    public static boolean checkUsernameAndPassword(String codiceFiscale, String password) {
        Session session = getSession();
        assert session != null;
        session.beginTransaction();
        Query query = session.createQuery("from Login l where l.username = :codiceFiscale and l.password = :password");
        query.setParameter("codiceFiscale", codiceFiscale);
        query.setParameter("password", password);
        List logins = query.list();
        return logins.size() == 1 && logins.get(0) != null;
    }

    public static Session getSession() {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Login.class)
                .addAnnotatedClass(Anagrafica.class)
                .addAnnotatedClass(CartellaClinica.class)
                .buildSessionFactory();
        try {
            return factory.getCurrentSession();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Ruolo findRuolo(String codiceFiscale, String password) {
        Session session = getSession();
        assert session != null;
        session.beginTransaction();
        Query query = session.createQuery("select l.ruolo from Login l where l.username = :codiceFiscale and l.password = :password");
        query.setParameter("codiceFiscale", codiceFiscale);
        query.setParameter("password", password);
        List ruolo = query.list();
        if(ruolo.size() > 1) {
            return null;
        } else {
            return (Ruolo) ruolo.get(0);
        }
    }
}
