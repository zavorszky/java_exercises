/*
 * Szabadon felhasználható
 */
package java_exercise_21;

/**
 *
 * Tömb fordító
 *
 * @author dady
 */
public class TombFord {

    int[] tomb;

    public TombFord(int[] p_tomb) {
        tomb = p_tomb;
    }

    public void ford() {
        int elem;
        int n = this.tomb.length;
        int i = 0;
        int j = n - i - 1;
        while (i <= j) {
            elem = this.tomb[i];
            this.tomb[i] = this.tomb[j];
            this.tomb[j] = elem;
            //
            i++;
            j = n - i - 1;
        }
    }

    public static void parcsre(int[] p_tomb) {
        int elem;
        int n = p_tomb.length;
        int i = 0;
        int j = i + 1;
        while (i < (n - 1)) {
            elem = p_tomb[i];
            p_tomb[i] = p_tomb[j];
            p_tomb[j] = elem;
            //
            i = i + 2;
            j = i + 1;
        }

    }

}
