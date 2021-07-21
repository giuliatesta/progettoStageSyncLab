package services;

import entity.Anagrafica;
import entity.CartellaClinica;
import entity.Login;
import entity.Login.Ruolo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoginService { ;

    public static boolean checkUsernameAndPassword(String codiceFiscale, String password) {
        Session session = getSession();
        Login login = new Login(codiceFiscale, password);
        session.beginTransaction();
        return session.contains(login);
    }

    public static Session getSession() {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Login.class)
                .buildSessionFactory();
        try {
            return factory.getCurrentSession();
        } finally {
            factory.close();
        }
    }


    public static Ruolo findRuolo(String codiceFiscale, String password) {
        Session session = getSession();
        Login login = new Login(codiceFiscale, password);
        return null;
    }
}
