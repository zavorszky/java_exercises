/*
 * Szabadon felhasználható
 */
package java_exercise_7;

/**
 *
 * Nagy Gusztáv: Java programozás 47. oldal
 * 
 * @author dady
 */
public class Java_exercise_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Gomb gomb = new Gomb();
        gomb.setRadius(5);

        System.out.println("Gömb térfogatának kiszámítása");
        System.out.println("Sugár (r):\t" + gomb.getRadius() + "[cm]");
        System.out.println("Térfogat (V):\t" + gomb.volume() + "[cm³]");

        MasodfokuEgyenlet mfe = new MasodfokuEgyenlet();
        mfe.setA(1);
        mfe.setB(-5);
        mfe.setC(6);

        System.out.println("\n");
        System.out.println("Másodfokú egyenlet megoldása.");
        System.out.println(mfe.egyenlet);
        System.out.println("Paraméterek:");
        System.out.println("\ta=" + mfe.getA());
        System.out.println("\tb=" + mfe.getB());
        System.out.println("\tc=" + mfe.getC());
        double d = mfe.diszkriminans();
        if (d < 0) {
            System.out.println("Nincs valós gyök.");
        } else if (d == 0) {
            System.out.println("(gy valős gyök van, x=" + mfe.x1());
        } else {
            System.out.println("Két valős gyök van:");
            System.out.println("\tx₁=" + mfe.x1());
            System.out.println("\tx₂=" + mfe.x2());
        }

        MasodfokuEgyenletV2 mfeV2 = new MasodfokuEgyenletV2();
        mfeV2.setABC(1, -5, 6);

        System.out.println("\n");
        System.out.println("Másodfokú egyenlet megoldása. V2 változat");
        System.out.println(mfe.egyenlet);
        System.out.println("Paraméterek:");
        System.out.println("\ta=" + mfe.getA());
        System.out.println("\tb=" + mfe.getB());
        System.out.println("\tc=" + mfe.getC());
        if (mfe.diszkriminans() < 0) {
            System.out.println("Nincs valós gyök.");
        } else if (mfe.diszkriminans() == 0) {
            System.out.println("(gy valős gyök van, x=" + mfe.x1());
        } else {
            System.out.println("Két valős gyök van:");
            System.out.println("\tx₁=" + mfe.x1());
            System.out.println("\tx₂=" + mfe.x2());
        }

    }

}
