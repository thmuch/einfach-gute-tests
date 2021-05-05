package zeitschrift.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zeitschrift.model.Kunde;
import zeitschrift.model.Produkt;

import static org.assertj.core.api.Assertions.assertThat;

class AboServiceTest {

    private Kunde kunde;
    private Produkt produkt;

    @BeforeEach
    void setup() {

        kunde = new Kunde();

        kunde.setVorname("Thomas");
        kunde.setNachname("Much");
        kunde.setKundennummer(2L);
        kunde.setSapKundennummer(11000002L);

        produkt = new Produkt();

        produkt.setProduktNummer(1234L);
        produkt.setBezeichnung("Java Magazin");
    }

    @Test
    void aboAbschliessen() {

        AboService aboService = new AboService();

        long aboNummer = aboService.aboAbschliessen(kunde, produkt);

        assertThat(aboNummer).isGreaterThanOrEqualTo(10000000L);
        assertThat(aboNummer).isLessThanOrEqualTo(19999999L);
    }
}