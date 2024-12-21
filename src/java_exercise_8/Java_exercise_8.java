/*
 * Szabadon felhasználható
 */
package java_exercise_8;

/**
 *
 * Nagy Gusztáv: Java programozás 48. oldal
 *
 * @author dady
 */
public class Java_exercise_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strSource = "Copy this string until you encounter the letter 'g'.";

        System.out.println("--1--");

        StringBuffer strTarget = new StringBuffer();

        int i = 0;
        char c = strSource.charAt(i);

        while (c != 'g') {
            strTarget.append(c);
            c = strSource.charAt(++i);
        }
        System.out.println("Forrás:\t" + strSource);
        System.out.println("Cél:\t" + strTarget);

        //
        System.out.println("\n--2--");

        StringBuffer strTarget2 = new StringBuffer();

        i = 0;
        c = strSource.charAt(i);
        do {
            strTarget2.append(c);
            c = strSource.charAt(++i);
        } while (c != 'g');

        System.out.println("Cél2:\t" + strTarget2);
    }

}
