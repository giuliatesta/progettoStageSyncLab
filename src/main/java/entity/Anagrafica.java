package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anagrafica")
public class Anagrafica {

    @Id // Primary key
    @Column(name = "codice_fiscale")
    private String codiceFiscale;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "mail")
    private String email;

    @Column(name = "telefono")
    private int numeroTelefono;

    @Column(name = "specializzazione")
    private String specializzazione;

    @Column(name = "ospedale")
    private String ospedale;

    @Column(name = "note")
    private String note;

    public Anagrafica(String codiceFiscale, String nome, String cognome, String email, int numeroTelefono) {
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    public Anagrafica() {

    }

    @Override
    public String toString() {
        return "entity.Anagrafica{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", specializzazione='" + specializzazione + '\'' +
                ", ospedale='" + ospedale + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
