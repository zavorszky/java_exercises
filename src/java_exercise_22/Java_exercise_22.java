/*
 * Szabadon felhasználható
 */
package java_exercise_22;

/**
 *
 * Nagy Gusztáv: Java programozás 98. oldal
 *
 * @author dady
 */
public class Java_exercise_22 {

    public static String gyumToStr(String[] p_gyum) {
        StringBuffer valaszStr = new StringBuffer(p_gyum.length);
        int i = -1;
        for (String gy : p_gyum) {
            i++;
            valaszStr.append(((i == 0) ? "" : ", ") + gy);
        }
        return valaszStr.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] gyumolcsok = {
            "alma",
            "körte",
            "meggy",
            "sárga barack",
            "fekete ribizli",
            "kék szilva"
        };

        String maganhangzok = "aáeéiíoóöőuúüű";

        /*---------------------------------------*/
        System.out.println("Gyümölcsök:\n" + gyumToStr(gyumolcsok));
        GyumolcsKereso gyk = new GyumolcsKereso(gyumolcsok, maganhangzok);
        gyk.kereses();
        System.out.println("A leg jobb gyümölcs:" + gyk.legJobbGyumolcs + " (találat=" + gyk.legJobbTalalat + ")");

    }

}
