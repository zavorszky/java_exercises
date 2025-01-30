/*
 * Szabadon felhasználható
 */
package java_exercise_21;

/**
 *
 * Nagy Gusztáv: Java programozás 98. oldal
 *
 * @author dady
 */
public class Java_exercise_21 {

    public static void tombkiiro(int[] p_tomb) {
        for (int i = 0; i < p_tomb.length; i++) {
            System.out.print(p_tomb[i] + " ");
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("--1--");
        int[] szamok = {1, 2, 3, 4, 5};

        System.out.print("Eredeti számsor:\t");
        tombkiiro(szamok);
        TombFord tombfordito = new TombFord(szamok);
        tombfordito.ford();
        System.out.print("Fordított számsor:\t");
        tombkiiro(szamok);

        System.out.println("\n--2--");
        int[] szamok2 = {3, 4, 5, 6};

        System.out.print("Eredeti számsor:\t");
        tombkiiro(szamok2);
        TombFord tombfordito2 = new TombFord(szamok2);
        tombfordito2.ford();
        System.out.print("Fordított számsor:\t");
        tombkiiro(szamok2);

        System.out.println("\n--3--");
        int[] szamok3 = {7};

        System.out.print("Eredeti számsor:\t");
        tombkiiro(szamok3);
        TombFord tombfordito3 = new TombFord(szamok3);
        tombfordito3.ford();
        System.out.print("Fordított számsor:\t");
        tombkiiro(szamok3);
        
        System.out.println("\n--4--");
        int[] szamok4 = {};
        
        System.out.print("Eredeti számsor:\t");
        tombkiiro(szamok4);
        System.out.println("A számsor mérete: "+szamok4.length);
        
        /* --------------------------------------*/
        
        System.out.println("\n--5--");
        System.out.print("Eredeti számsor:\t");
        tombkiiro(szamok);
        TombFord.parcsre(szamok);
        System.out.print("Párcserék  után:\t");
        tombkiiro(szamok);
        
        System.out.println("\n--6--");
        System.out.print("Eredeti számsor:\t");
        tombkiiro(szamok2);
        TombFord.parcsre(szamok2);
        System.out.print("Párcserék  után:\t");
        tombkiiro(szamok2);
        
        System.out.println("\n--7--");
        System.out.print("Eredeti számsor:\t");
        tombkiiro(szamok3);
        TombFord.parcsre(szamok3);
        System.out.print("Párcserék  után:\t");
        tombkiiro(szamok3);
        
    }

}
