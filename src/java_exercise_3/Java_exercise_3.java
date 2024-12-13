/*
 * Szabadon felhasználható
 */
package java_exercise_3;

/**
 *
 * Nagy Gusztáv: Java programozás; 25. oldal
 *
 * @author dady
 */
public class Java_exercise_3 {

    static final int LOOP_LAST = 9;

    public static void main(String[] args) {
        System.out.println("-- 2 --");
        int sum = 0;
        for (int current = 1; current <= 10; current++) {
            sum += current;
        }
        System.out.println("Sum=" + sum);

        System.out.println("-- 2 --");
        byte largestByte = Byte.MAX_VALUE;
        short largestShort = Short.MAX_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;
        double largestDouble = Double.MAX_VALUE;
        char aChar = 'S';
        boolean aBoolean = true;

        System.out.println("The largest byte value is " + largestByte);
        System.out.println("The largest short value is " + largestShort);
        System.out.println("The largest integer value is " + largestInteger);
        System.out.println("The largest long value is " + largestLong);
        System.out.println("The largest double value is " + largestDouble);

        if (Character.isUpperCase(aChar)) {
            System.out.println("The character " + aChar + " is uppercase.");
        } else {
            System.out.println("The character " + aChar + " is lowercase.");
        }

        System.out.println("The value of boolean aBoolean is " + aBoolean);

        System.out.println("-- 3 --");
        // NetBeans javaslat:
        // int [] intArray;
        // intArray = new int[10];
        //
        // Eredeti
        int[] intArray = new int[10];

        for (int i = 0; i <= 9; i++) {
            intArray[i] = i;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println("intArray[" + i + "]=" + intArray[i]);
        }

        System.out.println("-- 4 --");
        final int loopFist = 0;
        for (int i = loopFist; i <= LOOP_LAST; i++) {
            System.out.println("intArray[" + i + "]=" + intArray[i]);
        }

    }
}
