/*
 * Szabadon felhasználható
 */
package java_exercise_26;

/**
 *
 * Nagy Gusztáv: Java programozás 118. oldal (gyakorlat 11.11/2)
 *
 * @author dady
 */
public class Java_exercise_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("--1--");
        String s11 = "Hello";
        int i = 0;
        int j = s11.length() - 1;
        String s12 = Blablagramma.betu_csere(s11, i, j);
        System.out.println("Eredeti szöveg:    \t" + s11);
        System.out.println("Csere után (i=" + i + ", j=" + j + "):\t" + s12);

        System.out.println("\n--2--");
        String kevert_szo;
        String[] szavak = {"A", "AB", "ABC", "0123456789"};
        for (int k = 0; k < szavak.length; k++) {
            kevert_szo = Blablagramma.betu_keveres(szavak[k]);
            System.out.println("\nEredeti szöveg:\t" + szavak[k]);
            System.out.println("Keverés után  :\t" + kevert_szo);
        }
    }

}
