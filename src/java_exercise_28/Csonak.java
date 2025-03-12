/*
 * Szabadon felhasználható
 */
package java_exercise_28;

/**
 *
 * @author dady
 */
public class Csonak extends Jarmu {

    public int evezolapatok_szama;

    @Override
    public String motorTipus() {
        return "emberi erő";
    }

    public Csonak(int p_utasok_szama, int p_evezolapatok_szama) {
        super(false, true, false, p_utasok_szama);
        this.evezolapatok_szama = p_evezolapatok_szama;
    }

    public int getEvezolapatokSzama() {
        return this.evezolapatok_szama;
    }

    @Override
    public String toString() {
        return super.toString() + "; csónak; erőforrás:" + this.motorTipus() + "; evezőlapátok száma:" + this.getEvezolapatokSzama();
    }
}
