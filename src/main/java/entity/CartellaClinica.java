package entity;

import javax.persistence.*;

/**
 * Classe entity per la tabella della cartella clinica
 */
@Entity
@Table(name = "cartella_clinica")
public class CartellaClinica {

    private static int number = 0;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCartella;

    @JoinColumn(name = "id_paziente")
    private String idPaziente;

    @Column(name = "eta")
    private int eta;

    @Column(name = "sesso")
    private String sesso;

    @Column(name = "altezza")
    private double altezza;

    @Column(name = "peso")
    private double peso;

    @Column(name = "dimensione_vita")
    private double dimensioneVita;

    @Column(name = "freq_cardiaca_min")
    private int frequenzaCardiacaMinima;

    @Column(name = "freq_cardiaca_max")
    private int frequenzaCardiacaMassima;

    @Column(name = "pressione_min")
    private int pressioneMinima;

    @Column(name = "pressione_max")
    private int pressioneMassima;

    @Column(name = "colesterolo_min")
    private int colesteroloMinimo;

    @Column(name = "colesterolo_max")
    private int colesteroloMassimo;

    @Column(name = "diabete")
    private boolean diabete;

    @Column(name = "fumo")
    private boolean fumo;

    @Column(name = "anamnesi")
    private String anamnesi;

    @Column(name = "terapia")
    private String terapia;

    @Column(name = "esami")
    private String esami;

    public CartellaClinica() {
    }

    public CartellaClinica(String idPaziente) {
        idCartella = createIdCartella();
        this.idPaziente = idPaziente;
    }

    @Override
    public String toString() {
        return "entity.CartellaClinica{" +
                "idCartella=" + idCartella +
                ", idPaziente='" + idPaziente + '\'' +
                ", eta=" + eta +
                ", sesso=" + sesso +
                ", altezza=" + altezza +
                ", peso=" + peso +
                ", dimensioneVita=" + dimensioneVita +
                ", frequenzaCardiacaMinima=" + frequenzaCardiacaMinima +
                ", frequenzaCardiacaMassima=" + frequenzaCardiacaMassima +
                ", pressioneMinima=" + pressioneMinima +
                ", pressioneMassima=" + pressioneMassima +
                ", colesteroloMinimo=" + colesteroloMinimo +
                ", colesteroloMassimo=" + colesteroloMassimo +
                ", diabete=" + diabete +
                ", fumo=" + fumo +
                ", anamnesi='" + anamnesi + '\'' +
                ", terapia='" + terapia + '\'' +
                ", esami='" + esami + '\'' +
                '}';
    }

    public static int createIdCartella() {
        number++;
        return number;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDimensioneVita(double dimensioneVita) {
        this.dimensioneVita = dimensioneVita;
    }

    public void setFrequenzaCardiacaMinima(int frequenzaCardiacaMinima) {
        this.frequenzaCardiacaMinima = frequenzaCardiacaMinima;
    }

    public void setFrequenzaCardiacaMassima(int frequenzaCardiacaMassima) {
        this.frequenzaCardiacaMassima = frequenzaCardiacaMassima;
    }

    public void setColesteroloMinimo(int colesteroloMinimo) {
        this.colesteroloMinimo = colesteroloMinimo;
    }

    public void setDiabete(boolean diabete) {
        this.diabete = diabete;
    }

    public void setFumo(boolean fumo) {
        this.fumo = fumo;
    }

    public void setAnamnesi(String anamnesi) {
        this.anamnesi = anamnesi;
    }
}
