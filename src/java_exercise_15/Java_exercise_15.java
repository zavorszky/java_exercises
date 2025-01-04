/*
 * Szabadon felhasználható
 */
package java_exercise_15;

import java.util.StringTokenizer;

/**
 *
 * Nagy Gusztáv: Java programozás 78. oldal
 *
 * @author dady
 */
public class Java_exercise_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String testString = "This is a test.";
        StringTokenizer st = new StringTokenizer(testString);

        System.out.println("Test string:\t" + testString);
        System.out.println("Tokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
