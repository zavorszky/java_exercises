/*
 * Szabadon felhasználható
 */
package java_exercise_5;

/**
 *
 * Rendezés.
 *
 * Nagy Gusztáv: Java programozás 34. oldal
 *
 * @author dady
 */
public class Java_exercise_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};

        for (int i = arrayOfInts.length; --i >= 0;) {
            for (int j = 0; j < i; j++) {
                if (arrayOfInts[j] > arrayOfInts[j + 1]) {
                    int temp = arrayOfInts[j];
                    arrayOfInts[j] = arrayOfInts[j + 1];
                    arrayOfInts[j + 1] = temp;

                } //if
            } //for
        } //for

        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
        }
        System.out.println();
    }
}
