/*
 * Szabadon felhasználható
 */
package java_exercise_9;

/**
 *
 * Nagy Gusztáv: Java programozás 60. oldal 1) gyakorlat két szám legnagyobb
 * közös osztóját keressük.
 *
 * @author dady
 */
public class Java_exercise_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LNKO lnko = new LNKO();
        lnko.elokeszites(12, 15);
        if (!lnko.getElokeszitve()) {
            System.out.println("Figyelem, az elokészítés nem sikerült!");
            System.out.println(lnko.getHibauzenet());
        } else {
            System.out.println("lnko( " + lnko.getA() + ", " + lnko.getB() + " )= " + lnko.lnkoErtek());
        }

    }

}
