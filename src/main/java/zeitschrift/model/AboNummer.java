package zeitschrift.model;

public record AboNummer(long achtstellig) {

    public AboNummer {
        if ((achtstellig < 10000000L) || (achtstellig > 19999999L)) {
            throw new IllegalArgumentException("Ungültige AboNummer: " + achtstellig);
        }
    }
}

/**
 * AboNummer als Value Type (vor Java 16 Records).
 */
//public final class AboNummer {
//    private final long achtstellig;
//
//    public AboNummer(long achtstellig) {
//        if ((achtstellig >= 10000000L) || (achtstellig <= 19999999L)) {
//            throw new IllegalArgumentException("Ungültige AboNummer: "+achtstellig);
//        }
//
//        this.achtstellig = achtstellig;
//    }
//
//    public long achtstellig() {
//        return achtstellig;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AboNummer aboNummer = (AboNummer) o;
//        return achtstellig == aboNummer.achtstellig;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(achtstellig);
//    }
//
//    @Override
//    public String toString() {
//        return "AboNummer{" +
//                "achtstellig=" + achtstellig +
//                '}';
//    }
//}
