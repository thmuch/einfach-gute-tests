package zeitschrift.model;

public class Kunde {

    private String vorname;
    private String nachname;

    private long kundennummer;
    private long sapKundennummer;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public long getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(long kundennummer) {
        this.kundennummer = kundennummer;
    }

    public long getSapKundennummer() {
        return sapKundennummer;
    }

    public void setSapKundennummer(long sapKundennummer) {
        this.sapKundennummer = sapKundennummer;
    }
}
