package zeitschrift.service;

import org.junit.jupiter.api.Test;
import zeitschrift.model.Kunde;
import zeitschrift.model.Produkt;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AboServiceTest {

    @Test
    void aboAbschliessen() {

        Kunde kunde = new Kunde();

        kunde.setVorname("Thomas");
        kunde.setNachname("Much");
        kunde.setKundennummer(2L);
        kunde.setSapKundennummer(11000002L);

        Produkt produkt = new Produkt();

        produkt.setProduktNummer(1234L);
        produkt.setBezeichnung("Java Magazin");

        AboService aboService = new AboService();

        long aboNummer = aboService.aboAbschliessen(kunde, produkt);

        assertTrue(aboNummer >= 10000000L);
        assertTrue(aboNummer <= 19999999L);
    }
}