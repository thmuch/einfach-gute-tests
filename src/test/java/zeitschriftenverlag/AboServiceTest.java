package zeitschriftenverlag;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AboServiceTest {

    @Test
//    @DisplayName("aboAbschliessen gibt gueltige AboNummer zurueck")
    void aboAbschliessen_gibt_gueltige_AboNummer_zurueck() {

        // Given (Arrange)

        Kunde kunde = standardKunde(); // .mitSchuhgroesse(38).build();
        Produkt produkt = standardProdukt();

        AboService aboService = new AboService();

        // When (Act)

        AboNummer aboNummer = aboService.aboAbschliessen(kunde, produkt);

        // Then (Assert)

//        assertTrue(aboNummer >= 10000000L);
//        assertTrue(aboNummer <= 19999999L);
//        assertThat(aboNummer.achtstellig()).isGreaterThanOrEqualTo(10000000L);
//        assertThat(aboNummer.achtstellig()).isLessThanOrEqualTo(19999999L);
        assertThat(aboNummer).isNotNull();
    }

    private Produkt standardProdukt() {

        // TODO: Test Data Builder kombiniert mit Object Mother Pattern
        Produkt produkt = new Produkt();

        produkt.setProduktNummer(98765L);
        produkt.setBeschreibung("Java Magazine");

        return produkt;
    }

    private Kunde standardKunde() {
        Kunde kunde = new Kunde();

        kunde.setKundennummer(12340000L);
        kunde.setName("Thomas");

        return kunde;
    }
}