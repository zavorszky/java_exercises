/*
 * Szabadon felhasználható
 */
package java_exercise_10;

/**
 *
 * Nagy Gusztáv: Java programozás 61. oldal 2) A nap sorszáma az évben.
 *
 * @author dady
 */
public class Java_exercise_10 {

    static int napokSzamaAHonapban(int p_ev, int p_honap) {
        int n = -100;

        switch (p_honap) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                n = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                n = 30;
                break;
            case 2:
                if (((p_ev % 4 == 0) && (!(p_ev % 100 == 0))) || (p_ev % 400 == 0)) {
                    n = 29;
                } else {
                    n = 28;
                }
        }
        return n;
    } // function...

    static int napSorszamaAzEvben(int p_ev, int p_honap, int p_nap) {
        // Paraméterek ellenőrzése...
        int n = napokSzamaAHonapban(p_ev, p_honap);
        if (n < 0) {
            // Hibás a hónap !
            return -1;
        }

        if ((p_nap < 1) || (p_nap > n)) {
            return -2;
        }

        int m = 0;
        int i = 0;
        boolean nincsHiba = true;
        while ((i < (p_honap - 1)) && nincsHiba) {
            i++;
            int p = napokSzamaAHonapban(p_ev, i);
            nincsHiba = (p > 0);
            if (nincsHiba) {
                m += p;
            } else {
                break;
            }
        }
        if (nincsHiba) {
            m += p_nap;
            return m;
        } else {
            return -3;
        }
    } // function...

    static void kiir(int p_ev, int p_honap, int p_nap) {
        System.out.println("(" + p_ev + ", " + p_honap + ", " + p_nap + ") ->\t" + napSorszamaAzEvben(p_ev, p_honap, p_nap));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ev = 2024;
        int honap = 12;
        int nap = 25;

        System.out.println("Paraméterek:");
        System.out.println("\tÉv:\t" + ev);
        System.out.println("\tHónap:\t" + honap);
        System.out.println("\tNap:\t" + nap);
        System.out.println("\t------------");
        System.out.println("\tA nap sorszáma az évben:\t" + napSorszamaAzEvben(ev, honap, nap));

        System.out.println("\n");
        kiir(ev, 1, 1);
        kiir(ev, 1, 2);

        System.out.println("\n...");
        kiir(ev, 1, 30);
        kiir(ev, 1, 31);
        kiir(ev, 1, 32);
        kiir(ev, 2, 1);
        kiir(ev, 2, 2);

        System.out.println("\n...");
        kiir(ev, 12, 30);
        kiir(ev, 12, 31);
        kiir(ev, 12, 32);

        System.out.println("\n");
        kiir(2000, 2, 27);
        kiir(2000, 2, 28);
        kiir(2000, 2, 29);
        kiir(2000, 2, 30);
        kiir(2001, 2, 27);
        kiir(2001, 2, 28);
        kiir(2001, 2, 29);
        kiir(2001, 2, 30);
    }
}
