package entity;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login {
    public enum Ruolo {
        AMMINISTRATORE, PAZIENTE, MEDICO
    }

    @Id
    @JoinColumn(name = "username")
    private String username;

    @Column(name = "psw")
    private String password;

    @Column(name = "ruolo")
    private Ruolo ruolo;

    public Login() {

    }

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

    @Override
    public String toString() {
        return "entity.Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ruolo=" + ruolo +
                '}';
    }
}
