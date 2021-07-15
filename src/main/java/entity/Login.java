package entity;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class Login {
    private enum RuoloType {
        AMMINISTRATORE, PAZIENTE, MEDICO
    }

    @Id
    @JoinColumn(name = "username")
    private String username;

    @Column(name = "psw")
    private String password;

    @Column(name = "ruolo")
    private RuoloType ruolo;

    public Login() {

    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
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
