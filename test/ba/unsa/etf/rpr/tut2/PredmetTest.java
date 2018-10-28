package ba.unsa.etf.rpr.tut2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    Predmet predmet = new Predmet("Logicki dizajn", "LD", 20);
    @Test
    void dajSifru() {
        assertEquals("LD", predmet.dajSifru());
    }

    @Test
    void dajNaziv() {
        assertEquals("Logicki dizajn", predmet.dajNaziv());
    }
}