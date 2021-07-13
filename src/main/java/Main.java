
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Anagrafica.class)
                .addAnnotatedClass(CartellaClinica.class).addAnnotatedClass(Login.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Anagrafica paziente = new Anagrafica("codiceFiscale", "Nome", "Cognome", "email@gmail.com", 111);

            session.beginTransaction();

            session.save(paziente);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
