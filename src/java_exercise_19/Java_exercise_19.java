/*
 * Szabadon felhasználható
 */
package java_exercise_19;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
// import java.text.DecimalFormat;

/**
 *
 * Nagy Gusztáv: Java programozás 84. oldal
 *
 * @author dady
 */
public class Java_exercise_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("--1--");
        double d1 = 858.48;
        String s1 = Double.toString(d1);

        int dotIndex = s1.indexOf('.');
        System.out.println("Number (1):" + d1);
        System.out.println("Egész rész:\t" + s1.substring(0, dotIndex) + " (" + s1.substring(0, dotIndex).length() + ")");
        System.out.println("Tört rész:\t" + s1.substring(dotIndex + 1) + " (" + s1.substring(dotIndex + 1).length() + ")");

        System.out.println("\n--2--");
        // import java.text.NumberFormat;
        Double amount = new Double(345987.246); // amount -> összeg
        NumberFormat numberFormatter;
        String amountOut;
        numberFormatter = NumberFormat.getNumberInstance();
        amountOut = numberFormatter.format(amount);
        System.out.println("Eredeti szám (amount).....:\t" + amount.toString());
        System.out.println("Formázott szám (amountOut):\t" + amountOut);

        System.out.println("\n--3--");
        Double currency = new Double(9876543.21); // currency -> valuta
        NumberFormat currencyFormatter;
        String currencyOut;
        currencyFormatter = NumberFormat.getCurrencyInstance();
        currencyOut = currencyFormatter.format(currency);
        System.out.println("Eredeti szám (currency).....:\t" + currency.toString());
        System.out.println("Formázott szám (currencyOut):\t" + currencyOut);

        System.out.println("\n--4--");
        Double percent = new Double(0.756); // percent -> százalék
        NumberFormat percentFormatter;
        String percentOut;
        percentFormatter = NumberFormat.getPercentInstance();
        percentOut = percentFormatter.format(percent);
        System.out.println("Eredeti szám (percent).....:\t" + percent.toString());
        System.out.println("Formázott szám (percentOut):\t" + percentOut);

        System.out.println("\n--5--");
        Calendar c = Calendar.getInstance();
        // 1958.01.27
        c.set(Calendar.YEAR, 1958);
        c.set(Calendar.MONTH, 0); // Bizony így!!!
        c.set(Calendar.DATE, 27);
        String s = String.format("Duke's Birthday: %1$tm, %1$te, %1$tY (month, day, year)", c);
        System.out.println(s);

        System.out.println("\n--6--");
        Double amount2 = new Double(123456.78);
        String pattern = "###,###.###";
        DecimalFormat myDecimalFormatter = new DecimalFormat(pattern);
        String amountOut2 = myDecimalFormatter.format(amount2);
        System.out.println("Eredeti szám (amount2).....:\t" + amount2.toString());
        System.out.println("Minta (pattern)............:\t" + pattern);
        System.out.println("Formázott szám (amountOut2):\t" + amountOut2);
    }

}
