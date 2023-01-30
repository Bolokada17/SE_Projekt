package testfaelle;

import einfachefunktion.MeineKlasse;
import einfachefunktion.MeineXexception;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 ************ Testspezifikation***************
 * 1. Für die Funktion berechne() der Klasse MeineKlasse sollen folgende Testfälle erstellt werden:
 *      1.a) berechne(3,4) liefert 24
 *      1.b) berechne(1,6) liefert 6
 *      1.c) berechne(0,4) wirft Exception
 *
 * 2. Für die Funktion istTeiler() der Klasse MeineKlasse sollen folgende Testfälle erstellt werden:
 *      2.a) istTeiler(4,2) liefert true
 *      2.b) istTeiler(4,3) liefert false
 *
 * 3. Für die Funktion berechne() der Klasse MeineKlasse sollen folgende Testfälle erstellt werden:
 *      3.a) berechne(1,3) liefert 3
 *      3.b) berechne(2,3) liefert 9
 *      3.c) berechne(3,3) liefert 10
 *      3.d) berechne(4,3) liefert 30
 *      3.e) berechne(5,3) liefert 45
 *      3.f) berechne(6,3) liefert 63
 *
 * 4. Es soll die TestSuite AlleTestfaelle mit allen erstellten Testfällen erzeugt werden.
 */
public class Testfaelle_1 {
    private MeineKlasse meineKlasse;

    public Testfaelle_1(){}

    @Before
    public void setUpClass(){
        meineKlasse = new MeineKlasse();
    }
    @Test
    public void test1a() throws MeineXexception {
        int actual = meineKlasse.berechne(3, 4);
        assertEquals(24, actual);
    }

    @Test
    public void test1b() throws MeineXexception {
        int actual = meineKlasse.berechne(1, 6);
        assertEquals(6, actual);
    }
    @Test(expected = MeineXexception.class)
    public void test1c() throws MeineXexception {
        meineKlasse.berechne(0, 4);
    }


}
