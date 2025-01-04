/*
 * Szabadon felhasználható
 */
package java_exercise_16;

import java.util.StringTokenizer;

/**
 *
 * Nagy Gusztáv: Java programozás 80. oldal (gyakorlat 8.5)
 * 
 * @author dady
 */
public class Java_exercise_16 {

    public static String szovegFordito(String s) {
        int n = s.length();

        StringBuilder forditottSzoveg = new StringBuilder(n);
        for (int j = (n - 1); j >= 0; j--) {
            forditottSzoveg.append(s.charAt(j));
        }
        return forditottSzoveg.toString();
    }

    public static String szavankentFordito(String s) {
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            sb.append(szovegFordito(st.nextToken())).append("_");
        }
        return sb.toString();
    }

    public static String g_torlo(String s) {
        int n = s.length();
        char c;

        StringBuffer sb = new StringBuffer(n);

        for (int i = 0; i < n; i++) {
            c = s.charAt(i);
            if (c != 'g') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Indul a görög aludni";

        System.out.println("Alap szöveg:" + szoveg);
        System.out.println("--1--");
        System.out.println("Fordított szöveg:" + szovegFordito(szoveg));

        System.out.println("--2--");
        System.out.println("Szavanként fordított szöveg:" + szavankentFordito(szoveg));

        System.out.println("--3--");
        System.out.println("A szöveg 'g' nélkül:" + g_torlo(szoveg));
    }

}
