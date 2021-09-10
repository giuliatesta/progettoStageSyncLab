import entity.Anagrafica;
import entity.CartellaClinica;
import entity.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static entity.Login.Ruolo.*;

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
            Anagrafica anagrafica2 = new Anagrafica("TSTFCN03F57G388K", "Francesca", "Testa", "francesca.testa@gmail.com", "11");
            Login login2 = new Login("TSTFCN03F57G388K", "FRANCESCA03!", MEDICO);
            Anagrafica anagrafica3 = new Anagrafica("SLVLSN73H51F205E", "Alessandra", "Salvaggio", "salvaggio.alessandra@gmail.com", "12");
            Login login3 = new Login("SLVLSN73H51F205E", "ALESSANDRA73!", PAZIENTE);

            session.beginTransaction();
            //session.save(anagrafica3);
            session.save(login3);
            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
