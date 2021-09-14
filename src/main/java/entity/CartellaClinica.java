package entity;

import javax.persistence.*;

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
        this.idPaziente = idPaziente;
    }

    public CartellaClinica(int idCartella, String idPaziente) {
        this.idCartella = idCartella;
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

    public int getIdCartella() {
        return idCartella;
    }

    public String getIdPaziente() {
        return idPaziente;
    }


    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDimensioneVita() {
        return dimensioneVita;
    }

    public void setDimensioneVita(double dimensioneVita) {
        this.dimensioneVita = dimensioneVita;
    }

    public int getFrequenzaCardiacaMinima() {
        return frequenzaCardiacaMinima;
    }

    public void setFrequenzaCardiacaMinima(int frequenzaCardiacaMinima) {
        this.frequenzaCardiacaMinima = frequenzaCardiacaMinima;
    }

    public int getFrequenzaCardiacaMassima() {
        return frequenzaCardiacaMassima;
    }

    public void setFrequenzaCardiacaMassima(int frequenzaCardiacaMassima) {
        this.frequenzaCardiacaMassima = frequenzaCardiacaMassima;
    }

    public int getPressioneMinima() {
        return pressioneMinima;
    }

    public void setPressioneMinima(int pressioneMinima) {
        this.pressioneMinima = pressioneMinima;
    }

    public int getPressioneMassima() {
        return pressioneMassima;
    }

    public void setPressioneMassima(int pressioneMassima) {
        this.pressioneMassima = pressioneMassima;
    }

    public int getColesteroloMinimo() {
        return colesteroloMinimo;
    }

    public void setColesteroloMinimo(int colesteroloMinimo) {
        this.colesteroloMinimo = colesteroloMinimo;
    }

    public int getColesteroloMassimo() {
        return colesteroloMassimo;
    }

    public void setColesteroloMassimo(int colesteroloMassimo) {
        this.colesteroloMassimo = colesteroloMassimo;
    }

    public boolean isDiabete() {
        return diabete;
    }

    public void setDiabete(boolean diabete) {
        this.diabete = diabete;
    }

    public boolean isFumo() {
        return fumo;
    }

    public void setFumo(boolean fumo) {
        this.fumo = fumo;
    }

    public String getAnamnesi() {
        return anamnesi;
    }

    public void setAnamnesi(String anamnesi) {
        this.anamnesi = anamnesi;
    }

    public String getTerapia() {
        return terapia;
    }

    public void setTerapia(String terapia) {
        this.terapia = terapia;
    }

    public String getEsami() {
        return esami;
    }

    public void setEsami(String esami) {
        this.esami = esami;
    }
}
