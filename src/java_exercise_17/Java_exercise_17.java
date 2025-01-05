/*
 * Szabadon felhasználható
 */
package java_exercise_17;

/**
 *
 * Nagy Gusztáv: Java programozás 81
 *
 * @author dady
 */
public class Java_exercise_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Float float_1a = new Float(14.78f - 13.78f);
        Float float_1b = Float.valueOf("1.0");
        Double double_1 = new Double(1.0);

        System.out.println("float_1a:\t" + float_1a);
        System.out.println("float_1b:\t" + float_1b);
        System.out.println("double_1:\t" + double_1);

        int difference = float_1a.compareTo(float_1b);

        if (difference == 0) {
            System.out.println("float_1a = float_1b");
        } else if (difference < 0) {
            System.out.println("float_1a < float_1b");
        } else {
            System.out.println("float_1a > float_1b");
        }

        System.out.println("float_1a " + (float_1a.equals(double_1) ? "=" : "!=") + " double_1");
    }

}
