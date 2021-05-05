package zeitschrift.service;

import org.junit.jupiter.api.Test;
import zeitschrift.model.Kunde;
import zeitschrift.model.Produkt;

import static org.assertj.core.api.Assertions.assertThat;

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

        assertThat(aboNummer).isGreaterThanOrEqualTo(10000000L);
        assertThat(aboNummer).isLessThanOrEqualTo(19999999L);
    }
}