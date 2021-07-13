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

    public Login(String username, String password, RuoloType ruolo) {
        this.username = username;
        this.password = password;
        this.ruolo = ruolo;
    }

}
