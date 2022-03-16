package zeitschriftenverlag;

public class Produkt {

    private long produktNummer;
    private String beschreibung;

    public long getProduktNummer() {
        return produktNummer;
    }

    public void setProduktNummer(long produktNummer) {
        this.produktNummer = produktNummer;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
