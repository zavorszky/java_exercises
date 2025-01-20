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
        for (String element:array_1) {
            System.out.println(element.toLowerCase());
        }
        
    }

}
