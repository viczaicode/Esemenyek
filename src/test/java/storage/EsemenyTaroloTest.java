//kesz

package storage;

import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EsemenyTaroloTest {

    private EsemenyTarolo tarolo;

    @BeforeEach
    void setUp() {
        tarolo = new EsemenyTarolo();
    }

    @Test
    void esemenyHozzaadasEsLekerdezes() {
        Tanora t = new Tanora(
                "Matekora",
                LocalDateTime.of(2025, 5, 10, 8, 0),
                "101",
                "Taknyos Imre"
        );

        tarolo.hozzaadEsemeny(t);

        System.out.println(tarolo.getOsszesEsemeny());

    }


    @Test
    void konferenciaNegativResztvevoDobKivetelt() {
        assertThrows(IllegalArgumentException.class, () ->
                new Konferencia(
                        "FÉLÉVI OSZTÁLYZÓ",
                        LocalDateTime.now(),
                        "B TORNATEREM",
                        -5
                )
        );
    }

    @Test
    void datumSzerintiSzures() {
        Tanora t = new Tanora(
                "nyelvtan",
                LocalDateTime.of(2025, 5, 10, 8, 0),
                "107",
                "Hurka Zsigmond"
        );

        tarolo.hozzaadEsemeny(t);

        List<Esemeny> eredmeny =
                tarolo.getEsemenyekDatumSzerint(LocalDate.of(2025, 5, 10));

        assertEquals(1, eredmeny.size());
    }


}