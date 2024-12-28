/*
 * Szabadon felhasználható
 */
package java_exercise_11;

/**
 *
 * Nagy Gusztáv: Java programozás 61. oldal
 * 
 * 2345 = 1000*2 + 100*3 + 10*4 + 5
 *      = 10( 100*2 + 10*3             + 4 ) + 5
 *      = 10( 10[ 10*2            + 3] + 4 ) + 5
 *      = 10( 10[ 10{ 2}          + 3] + 4 ) + 5
 *      = 10( 10[ 10{ 10*0 + 2}   + 3] + 4 ) + 5
 * 
 * b0 = b1*c  +r1 (c=10)
 * b1 = b2*c  +r2
 * ...
 * b(n) = 0*c +r(n+1)
 * 
 * @author dady
 */
public class Java_exercise_11 {

    static int szamjegyekOsszege10(int p_n) {
        final int C = 10;

        int m = 0;
        int r;
        int b = p_n;
        if (b < 0) {
            b = (-1) * b;
        }
        do {
            r = b % C;
            b = b / C;

            m += r;

        } while (b > 0);

        return m;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1958;
        System.out.println("A(z) " + n + " szám jegyeinek összege:" + szamjegyekOsszege10(n));
    }

}
