package zeitschrift.model;

public class Abonnement {

    private final AboNummer aboNummer;
    private final Produkt produkt;
    private final Kunde kunde;

    public Abonnement(AboNummer aboNummer, Produkt produkt, Kunde kunde) {
        this.aboNummer = aboNummer;
        this.produkt = produkt;
        this.kunde = kunde;
    }

    public AboNummer getAboNummer() {
        return aboNummer;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public Kunde getKunde() {
        return kunde;
    }
}
