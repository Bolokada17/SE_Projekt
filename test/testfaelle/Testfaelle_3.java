package testfaelle;

import einfachefunktion.MeineKlasse;
import einfachefunktion.MeineXexception;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class Testfaelle_3 {
    private MeineKlasse meineKlasse;

    private int param_x;
    private int param_y;
    private int result;

    public Testfaelle_3(int param_x, int param_y, int result){
        this.param_x  = param_x;
        this.param_y = param_y;
        this.result = result;
    }

    @Before
    public void setUpClass(){
        meineKlasse = new MeineKlasse();
    }
    //Parameter definieren
    @Parameters
    public static Collection<Object[]> param(){
        return Arrays.asList(
                new Object[]{1,3,3},
                new Object[]{2,3,9},
                new Object[]{3,3,18},
                new Object[]{4,3,30},
                new Object[]{5,3,45},
                new Object[]{6,3,63}
        );
    }

    @Test
    public void test3() throws MeineXexception{
        int actual = meineKlasse.berechne(param_x, param_y);
        assertEquals(result, actual);
    }
}
