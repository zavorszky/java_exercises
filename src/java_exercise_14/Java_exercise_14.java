/*
 * Szabadon felhasználható
 */
package java_exercise_14;

/**
 *
 * Nagy Gusztáv: Java programozás 74. oldal
 *
 * @author dady
 */
public class Java_exercise_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String FULL_FILE_NAME = "c:/home/mem/index.html";

        Filename fn = new Filename(FULL_FILE_NAME, '/', '.');

        System.out.println("Full file name:\t" + FULL_FILE_NAME);
        System.out.println("Path:\t" + fn.path());
        System.out.println("File name:\t" + fn.filename());
        System.out.println("Extension:\t" + fn.extension());
    }

}
