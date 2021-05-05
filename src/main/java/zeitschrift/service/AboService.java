package zeitschrift.service;

import zeitschrift.model.AboNummer;
import zeitschrift.model.Abonnement;
import zeitschrift.model.Kunde;
import zeitschrift.model.Produkt;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AboService {

    private ConcurrentMap<AboNummer, Abonnement> datenbank = new ConcurrentHashMap<>();

    public AboNummer aboAbschliessen(Kunde kunde, Produkt produkt) {
//        return 0L;
//        return 10000000L;
//        return kunde.getSapKundennummer(); // Bug ;-)
        AboNummer aboNummer = new AboNummer(10000000L);

        datenbank.put(aboNummer, new Abonnement(aboNummer, produkt, kunde));

        return aboNummer;
    }

    public Abonnement aboDetails(AboNummer aboNummer) {
        return datenbank.get(aboNummer);
    }
}
