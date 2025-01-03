/*
 * Szabadon felhasználható
 */
package java_exercise_13;

/**
 *
 * @author dady
 */
public class Java_exercise_13 {

    /**
     * 
     * Nagy Gusztáv: Java programozás 71. oldal
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("--1--");
        Character a = new Character('a');
        Character a2 = new Character('a');
        Character b = new Character('b');

        int difference = a.compareTo(b);

        if (difference == 0) {
            System.out.println("Az a valtozó tartalma megegyezik b-ével.");
        } else if (difference < 0) {
            System.out.println("Az a valtozó lartalma kisebb a b-énél.");
        } else if (difference > 0) {
            System.out.println("Az a valtozó lartalma nagyobb a b-énél.");
        }

        System.out.println("Az a változó tartalma " + ((a.equals(a2)) ? "megegyezik" : "nem egyezik meg") + " a2-ével.");

        System.out.println("Az " + a.toString() + " betű " + (Character.isUpperCase(a.charValue()) ? "NAGYBETŰ" : "kisbetű."));

        System.out.println("\n--2--");
        /*
        A palindromszám vagy számpalindrom olyan számot (szűken értelmezve tízes
        számrendszerbeli természetes számot) jelent, amelynek számjegyeit fordított
        sorrendben írva az eredeti számot kapjuk vissza. Ilyen szimmetrikus szám
        például a 16461.
         */
        // String palindromeSzoveg = "Dot saw I was Tod";
        String palindromeSzoveg = "Rád rohan a hordár";
        int paliHossz = palindromeSzoveg.length();
        StringBuilder forditottSzoveg = new StringBuilder(paliHossz);
        for (int i = (paliHossz - 1); i >= 0; i--) {
            forditottSzoveg.append(palindromeSzoveg.charAt(i));
        }
        System.out.println("Palindrome szöveg:\t" + palindromeSzoveg);
        System.out.println("Fordított szöveg:\t" + forditottSzoveg);
    }

}
