/*
 * Szabadon felhasználható
 */
package java_exercise_26;

import java.util.Random;

/**
 *
 * Betűk keverése.
 *
 * @author dady
 */
public class Blablagramma {

    private static void sb_betu_csere(StringBuffer sb, int i, int j) {

        if (i != j) {

            char ch_i = sb.charAt(i);

            sb.setCharAt(i, sb.charAt(j));

            sb.setCharAt(j, ch_i);
        }
    }

    /*
    Betű csere, az i-dik és j-edik betű cseréje
     */
    public static String betu_csere(String s, int i, int j) {
        StringBuffer sb = new StringBuffer(s);
        sb_betu_csere(sb, i, j);
        return sb.toString();
    }

    public static String betu_keveres(String s) {
        int n0 = s.length();

        if (n0 <= 1) {
            return new String(s);
        }

        StringBuffer sb = new StringBuffer(s);
        Random rn_generator = new Random();

        int i, j;

        if (n0 == 2) {
            i = rn_generator.nextInt(2);
            //System.out.println("i="+i);
            if (i == 0) {
                sb_betu_csere(sb, 0, 1);
            }
            return sb.toString();
        }

        for (int n = 0; n < n0; n++) {

            i = rn_generator.nextInt(n0);
            do {
                j = rn_generator.nextInt(n0);
            } while (i == j);
            //System.out.println("n, i, j=" + n + "," + i + "," + j);
            sb_betu_csere(sb, i, j);
        }
        return sb.toString();
    }
}
