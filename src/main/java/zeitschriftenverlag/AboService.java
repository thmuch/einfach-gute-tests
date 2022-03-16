package zeitschriftenverlag;

public class AboService {

    public AboNummer aboAbschliessen(Kunde kunde, Produkt produkt) {
//        return 0L;
//        return 10000000L;
//        return kunde.getKundennummer(); // Uuupps, ein Bug ;-)
        return new AboNummer(10000000L);
    }
}
