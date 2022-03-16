package zeitschriftenverlag;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AboServiceTest {

    @Test
//    @DisplayName("aboAbschliessen gibt gueltige AboNummer zurück")
    void aboAbschliessen_gibt_gueltige_AboNummer_zurück() {

        // Given (Arrange)

        AboService aboService = new AboService();

        Kunde kunde = standardKunde();
        Produkt produkt = standardProdukt();

        // When (Act)

        AboNummer aboNummer = aboService.aboAbschliessen(kunde, produkt);

        // Then (Assert)

//        assertTrue(aboNummer >= 10000000L);
//        assertTrue(aboNummer <= 19999999L);
//        assertThat(aboNummer.achtstellig()).isGreaterThanOrEqualTo(10000000L);
//        assertThat(aboNummer.achtstellig()).isLessThanOrEqualTo(19999999L);

        assertThat(aboNummer).isNotNull();
    }

    private Kunde standardKunde() {

        // TODO: Test Data Builder? evtl. kombioniert mit Object Mother
        Kunde kunde = new Kunde();

        kunde.setKundennummer(12000000L);
        kunde.setName("Thomas");
        return kunde;
    }


    private Produkt standardProdukt() {

        Produkt produkt = new Produkt();

        produkt.setProduktNummer(98765L);
        produkt.setBeschreibung("Java Magazin");

        return produkt;
    }
}