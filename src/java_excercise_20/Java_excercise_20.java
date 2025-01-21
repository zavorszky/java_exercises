/*
 * Szabadon felhasználható
 */
package java_excercise_20;

/**
 *
 * Nagy Gusztáv: Java programozás 94. oldal
 *
 * @author dady
 */
public class Java_excercise_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--1--");
        String[] array_1 = {
            "String-1",
            "String-2",
            "String-3"};

        for (int i = 0; i < array_1.length; i++) {
            System.out.println("array_1[" + i + "]=\t" + array_1[i].toLowerCase());
        }

        System.out.println("--1a--");
        for (String element : array_1) {
            System.out.println(element.toLowerCase());
        }

        System.out.println("\n--2--");
        Integer[] egeszTomb2 = new Integer[10];
        // A tömb létrejött, 10 Integer objektumot képes tárolni.
        // De ha megpróbáljuk kiolvasni valamelyik elemét, akkor NULL pointer
        // higát kapunk.
        for (int i = 0; i < egeszTomb2.length; i++) {
            egeszTomb2[i] = new Integer(i);
        }
        for (Integer i2 : egeszTomb2) {
            System.out.print(i2 + " ");
        }
        System.out.println("");

        System.out.println("\n--3--");
        String[][] matrix = {
            {
                "M00", "M01", "M02"
            },
            {
                "M10", "M11", "M12", "M13"
            },
            {
                "M20", "M21"
            }
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][0] + ": ");
            for (int j = 1; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nHuh! Ez mi ez?");
        System.out.println("\nInkább így:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
