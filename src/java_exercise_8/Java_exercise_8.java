/*
 * Szabadon felhasználható
 */
package java_exercise_8;

/**
 *
 * Nagy Gusztáv: Java programozás 48. oldal
 *
 * @author dady
 */
public class Java_exercise_8 {

    public static enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    static int numDaysInTheMonth(int p_year, int p_month) {
        int n = 0;

        switch (p_month) {
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
                if (((p_year % 4 == 0) && (!(p_year % 100 == 0))) || (p_year % 400 == 0)) {
                    n = 29;
                } else {
                    n = 28;
                }
        }

        return n;
    }

    static int numDaysInTheMonth2(int p_year, Month p_month) {
        int n = 0;

        switch (p_month) {
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                n = 31;
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                n = 30;
                break;
            case FEB:
                if (((p_year % 4 == 0) && (!(p_year % 100 == 0))) || (p_year % 400 == 0)) {
                    n = 29;
                } else {
                    n = 28;
                }
        }

        return n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strSource = "Copy this string until you encounter the letter 'g'.";

        // --------------------------
        System.out.println("--1--");

        StringBuffer strTarget = new StringBuffer();

        int i = 0;
        char c = strSource.charAt(i);

        while (c != 'g') {
            strTarget.append(c);
            c = strSource.charAt(++i);
        }
        System.out.println("Forrás:\t" + strSource);
        System.out.println("Cél:\t" + strTarget);

        // --------------------------
        System.out.println("\n--2--");

        StringBuffer strTarget2 = new StringBuffer();

        i = 0;
        c = strSource.charAt(i);
        do {
            strTarget2.append(c);
            c = strSource.charAt(++i);
        } while (c != 'g');

        System.out.println("Cél2:\t" + strTarget2);

        // --------------------------
        System.out.println("\n--3--");

        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};

        for (int element : arrayOfInts) {
            System.out.print(element + " ");
        }
        System.out.println();

        // --------------------------
        System.out.println("\n--4--");

        int year = 2000;
        int month = 2;
        System.out.println("év:" + year + ", hónap:" + month + ": napok száma=" + numDaysInTheMonth(year, month));

        Month month2 = Month.FEB;
        System.out.println("év:" + year + ", hónap:" + month2 + ": napok száma=" + numDaysInTheMonth2(year, month2));

        // --------------------------
        System.out.println("\n--5--");

        int[][] array2DOfInts = {
            {32, 87, 3, 589},
            {12, 1076, 2000, 8},
            {622, 127, 77, 955}};

        int searchFor = 12;

        int ii = -1;
        int jj = -1;
        boolean ll = false;
        xxx:
        for (ii = 0; ii < array2DOfInts.length; ii++) {
            for (jj = 0; jj < array2DOfInts[ii].length; jj++) {
                if (array2DOfInts[ii][jj] == searchFor) {
                    ll = true;
                    // Kiugrás egyszerre több (for) blokkból.
                    break xxx;
                }
            }
        }
        if (ll) {
            System.out.println("Megvan a " + searchFor + " érték. ii=" + ii + ", jj=" + jj);
        } else {
            System.out.println("A(z) " + searchFor + " érték nincs a mátrixban.");
        }

    }

}
