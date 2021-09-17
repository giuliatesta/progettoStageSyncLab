package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe entity per la tabella anagrafica del database
 */
@Entity
@Table(name = "anagrafica")
public class Anagrafica {

    @Id // Primary key
    @Column(name = "codice_fiscale")
    private String codice_fiscale;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "mail")
    private String email;

    @Column(name = "telefono")
    private String numeroTelefono;

    @Column(name = "specializzazione")
    private String specializzazione;

    @Column(name = "ospedale")
    private String ospedale;

    @Column(name = "note")
    private String note;

    public Anagrafica(String codice_fiscale, String nome, String cognome, String email, String numeroTelefono) {
        this.codice_fiscale = codice_fiscale;
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
                "codiceFiscale='" + codice_fiscale + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", specializzazione='" + specializzazione + '\'' +
                ", ospedale='" + ospedale + '\'' +
                ", note='" + note + '\'' +
                '}';
    }


    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public void setOspedale(String ospedale) {
        this.ospedale = ospedale;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
