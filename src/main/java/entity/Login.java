package entity;

import javax.persistence.*;
import java.security.SecureRandom;
import java.util.stream.Collectors;

/**
 * Classe entity per la tabella login del db
 */
@Entity
@Table(name = "login")
public class Login {

    public enum Ruolo {
        AMMINISTRATORE, PAZIENTE, MEDICO
    }

    @Id
    @JoinColumn(name = "codice_fiscale")
    private String username;

    @Column(name = "psw")
    private String password;

    @Column(name = "ruolo")
    private Ruolo ruolo;

    public Login(String username, String password, Ruolo ruolo) {
        this.username = username;
        this.password = password;
        this.ruolo = ruolo;
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
        ruolo = null;
    }

    public Login() {
    }

    @Override
    public String toString() {
        return "entity.Login{" +
                "username ='" + username + '\'' +
                ", password ='" + password + '\'' +
                ", ruolo =" + ruolo +
                '}';
    }

    public static String createPassword() {
        SecureRandom random = new SecureRandom();
        return random.ints(8)
                .mapToObj(i -> String.valueOf((char)i))
                .collect(Collectors.joining());
    }
}
