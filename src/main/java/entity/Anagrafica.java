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
    private String numeroTelefono;

    @Column(name = "specializzazione")
    private String specializzazione;

    @Column(name = "ospedale")
    private String ospedale;

    @Column(name = "note")
    private String note;

    public Anagrafica(String codiceFiscale, String nome, String cognome, String email, String numeroTelefono) {
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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public String getOspedale() {
        return ospedale;
    }

    public void setOspedale(String ospedale) {
        this.ospedale = ospedale;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
