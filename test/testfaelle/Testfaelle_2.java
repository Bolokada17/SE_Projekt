package testfaelle;

import einfachefunktion.MeineKlasse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Testfaelle_2 {
   private MeineKlasse meineKlasse2;


    public Testfaelle_2(){}

    @Before
    public void setUpClass(){
        meineKlasse2 = new MeineKlasse();
    }
    @Test
    public void istTeiler2a(){
        boolean actual = meineKlasse2.istTeiler(4,2);
        assertTrue(actual);
    }
    @Test
    public void istTeiler2b(){
        boolean actual = meineKlasse2.istTeiler(4, 3);
        assertFalse(actual);
    }


}
