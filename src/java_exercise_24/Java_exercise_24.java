/*
 * Szabadon felhasználható
 */
package java_exercise_24;

import java.text.NumberFormat;

/**
 *
 * Nagy Gusztáv: Java programozás 105. oldal
 *
 * @author dady
 */
public class Java_exercise_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hitel; // loan amount
        double evesKamat; // rate
        int futamidoEv;

        NumberFormat numFormatter = NumberFormat.getNumberInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        hitel = 20000000.0;
        evesKamat = 7.0;
        futamidoEv = 20;
        System.out.println("Hitel [Ft]:    \t" + numFormatter.format(hitel));
        System.out.println("Éves kamat [%]:\t" + percentFormatter.format(evesKamat / 100));
        System.out.println("Futamidő [év]: \t" + numFormatter.format(futamidoEv));
        System.out.println("------------");
        System.out.println("Évenként az év végén fizetendő részlet:" + numFormatter.format(Bank.evesReszlet(hitel, evesKamat, futamidoEv)));

    }

}
