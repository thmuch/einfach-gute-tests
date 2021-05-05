package zeitschrift.model;

public class Produkt {

    private long produktNummer;
    private String bezeichnung;

    public long getProduktNummer() {
        return produktNummer;
    }

    public void setProduktNummer(long produktNummer) {
        this.produktNummer = produktNummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
