import javax.persistence.*;

@Entity
@Table(name = "cartella_clinica")
public class CartellaClinica {

    private enum SexType {
        FEMALE, MALE, OTHER
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCartella;

    @JoinColumn(name = "id_paziente")
    private String idPaziente;

    @Column(name = "eta")
    private int eta;

    @Column(name = "sesso")
    private SexType sesso;

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

    public CartellaClinica(String idPaziente) {
        this.idPaziente = idPaziente;
    }

}
