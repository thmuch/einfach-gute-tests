package zeitschrift.service;

import zeitschrift.model.AboNummer;
import zeitschrift.model.Kunde;
import zeitschrift.model.Produkt;

public class AboService {

    public AboNummer aboAbschliessen(Kunde kunde, Produkt produkt) {
//        return 0L;
//        return 10000000L;
//        return kunde.getSapKundennummer(); // Bug ;-)
        return new AboNummer(10000000L);
    }
}
