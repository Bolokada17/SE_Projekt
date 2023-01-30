package einfachefunktion;

/**
 * Klasse mit 2 Methoden:
 * - int berechne(int x, int y):
 * liefert die Summe (i = 1 bis x) von i*y
 * wirft die Exception MeineXexception, falss x <= 0 ist
 *
 * - Boolean istTeiler(int x, int y):
 *
 * true, falls y ganzzahliger Teiler von x ist
 * false, falls nicht
 */
public class MeineKlasse {
    public int berechne(int x, int y) throws MeineXexception{
        if (x <= 0) {
            throw new MeineXexception("x ist <= 0 !");
        }
        int result = 0;
        for(int i = 1; i <= x; i++){
            result = result + i*y;
        }
        return result;
    }
    public Boolean istTeiler(int x, int y){
        return 0 == (x % y);
    }
}
