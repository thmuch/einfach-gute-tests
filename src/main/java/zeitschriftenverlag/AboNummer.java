package zeitschriftenverlag;

public record AboNummer(long achtstellig) {

    public AboNummer {
        if (achtstellig < 10000000L || achtstellig > 19999999L) {
            throw new IllegalArgumentException("AboNummer nicht im gültigen Bereich: " + achtstellig);
        }
    }
}
