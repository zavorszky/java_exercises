/*
 * Szabadon felhasználható
 */
package java_exercise_7;

/**
 *
 * @author dady
 */
public class Fenyofa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LOMB_MERET = 4;

        final String SOK_SZOKOZ = "                   ";
        final String SOK_MINUSZ = "---------------------";
        //                         123456789.123456789.1

        if (SOK_SZOKOZ.length() < ((2 * LOMB_MERET) - 1)) {
            System.out.println("Hiba! SOK_SZOKOZ.length() < ((2*LOMB_MERET) - 1)");

        } else if (SOK_MINUSZ.length() < ((2 * LOMB_MERET) + 1)) {
            System.out.println("Hiba! SOK_MINUSZ.length() < ((2 * LOMB_MERET) + 1)");

        } else {
            final String KEZDO_LOMB_SZEL = SOK_SZOKOZ.substring(0, (LOMB_MERET - 1));
            final String KEZDO_KOZEP = " ";

            // Lomb
            String balSzel = KEZDO_LOMB_SZEL;
            String kozep = KEZDO_KOZEP;
            System.out.println(balSzel + "/" + kozep + "\\");

            for (int i = 2; i <= LOMB_MERET; i++) {
                balSzel = balSzel.substring(0, (balSzel.length() - 1));
                kozep += "  ";
                System.out.println(balSzel + "/" + kozep + "\\");
            }
            // Lomb alja
            System.out.println(SOK_MINUSZ.substring(0, ((2 * LOMB_MERET) + 1)));
            // Láb
            final String LAB_SZEL = SOK_SZOKOZ.substring(0, (LOMB_MERET - 1));
            for (int i = 1; i <= 3; i++) {
                System.out.println(LAB_SZEL + "\" \"");
            }
        }
    }

}
