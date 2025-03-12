/*
 * Szabadon felhasználható
 */
package java_exercise_28;

/**
 *
 * @author dady
 */
public class PSZH extends Jarmu {

    @Override
    public String motorTipus() {
        return " Csepel D 414.44 dízelmotor";
    }

    public PSZH(int p_utasok_szama) {
        super(true, true, false, p_utasok_szama);
    }

    public String fegyverzet() {
        return "14,5 mm-es KPVT géppuska";
    }

    @Override
    public String toString() {
        return super.toString() + "; páncélozott szállító harcjármű; fegyverzet:" + this.fegyverzet();
    }
}
