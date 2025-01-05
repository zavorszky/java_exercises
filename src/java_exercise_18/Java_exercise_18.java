/*
 * Szabadon felhasználható
 */
package java_exercise_18;

/**
 *
 * Nagy Gusztáv: Java programozás 83
 *
 * @author dady
 */
public class Java_exercise_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 2) {
            float a = Float.valueOf(args[0]).floatValue();
            float b = Float.valueOf(args[1]).floatValue();
            System.out.println("a (1.) paraméter:\t" + a);
            System.out.println("b (2.) paraméter:\t" + b);
            System.out.println("");
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Hiba! A program két, szám argumentumot vár. A paraméterek száma:" + (args.length));
        }
    }

}
