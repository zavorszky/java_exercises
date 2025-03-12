/*
 * Szabadon felhasználható
 */
package java_exercise_28;

/**
 *
 * Nagy Gusztáv: Java programozás 128. oldal
 * 
 * @author dady
 */
public class Java_exercise_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ElektromosAuto astraElectric = new ElektromosAuto(5, "litium-ion");
        Csonak egyParEvezosCsonak = new Csonak(4, 2);
        PSZH pszh = new PSZH(6);

        System.out.println("Astra Electric:");
        System.out.println("\t" + astraElectric.toString());
        System.out.println();
        System.out.println("Egy pár evezős csónak:");
        System.out.println("\t" + egyParEvezosCsonak.toString());
        System.out.println();
        System.out.println("PSZH:");
        System.out.println("\t" + pszh.toString());
    }

}
