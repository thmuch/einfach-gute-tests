package zeitschrift.service;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import zeitschrift.model.AboNummer;
import zeitschrift.model.Abonnement;
import zeitschrift.model.Kunde;
import zeitschrift.model.Produkt;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AboServiceTest {

    @Test
    void aboAbschliessen_liefert_gültige_AboNummer() {

        // Given (Arrange)

        Kunde kunde = standardKunde();
        Produkt produkt = standardProdukt();

        AboService aboService = new AboService();

        // When (Act)

        AboNummer aboNummer = aboService.aboAbschliessen(kunde, produkt);

        // Then (Assert)

        assertThat(aboNummer).isNotNull();
    }

    @Test
    void aboDetails_liefert_gespeicherte_Daten_zur_AboNummer() {

        // Given

        Kunde kunde = standardKunde();
        Produkt produkt = standardProdukt();

        AboService aboService = new AboService();

        AboNummer aboNummer = aboService.aboAbschliessen(kunde, produkt);

        // When

        Abonnement abonnement = aboService.aboDetails(aboNummer);

        // Then

        assertThat(abonnement.getAboNummer()).isEqualTo(aboNummer);
        assertThat(abonnement.getProdukt()).isEqualTo(produkt);
        assertThat(abonnement.getKunde()).isEqualTo(kunde);
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
