package zeitschrift.service;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import zeitschrift.model.AboNummer;
import zeitschrift.model.Kunde;
import zeitschrift.model.Produkt;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AboServiceTest {

    @Test
    void aboAbschliessen_liefert_gültige_AboNummer() {

        Kunde kunde = standardKunde();
        Produkt produkt = standardProdukt();

        AboService aboService = new AboService();

        AboNummer aboNummer = aboService.aboAbschliessen(kunde, produkt);

        assertThat(aboNummer).isNotNull();
    }

    private Produkt standardProdukt() {

        Produkt produkt = new Produkt();

        produkt.setProduktNummer(1234L);
        produkt.setBezeichnung("Java Magazin");

        return produkt;
    }

    private Kunde standardKunde() {

        Kunde kunde = new Kunde();

        kunde.setVorname("Thomas");
        kunde.setNachname("Much");
        kunde.setKundennummer(2L);
        kunde.setSapKundennummer(11000002L);

        return kunde;
    }
}
