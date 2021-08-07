
import entity.Anagrafica;
import entity.CartellaClinica;
import entity.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static entity.Login.Ruolo.AMMINISTRATORE;

public class Main {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                                    .addAnnotatedClass(Anagrafica.class)
                                                    .addAnnotatedClass(CartellaClinica.class)
                                                    .addAnnotatedClass(Login.class)
                                                    .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Anagrafica anagrafica = new Anagrafica("TSTGLI98E52G388W", "Giulia", "Testa", "giuliatestax@gmail.com", "3423398354");
            Login login = new Login("TSTGLI98E52G388W", "GIULIA98!", AMMINISTRATORE);
            session.beginTransaction();
            session.save(login);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
