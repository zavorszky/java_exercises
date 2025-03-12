/*
 * Szabadon felhasználható
 */
package java_exercise_28;

/**
 *
 * @author dady
 */
public class ElektromosAuto extends Jarmu {

    public String akkumulátor_tipus;

    @Override
    public String motorTipus() {
        return "villany";
    }

    public ElektromosAuto(int p_utasok_szama, String p_akkumulátor_tipus) {
        super(true, false, false, p_utasok_szama);
        this.akkumulátor_tipus = p_akkumulátor_tipus;
    }

    public String getAkkumulatosTipus() {
        return this.akkumulátor_tipus;
    }

    @Override
    public String toString() {
        return super.toString() + "; e-auto; erőforrás:" + this.motorTipus() + "; akkumulátor típus:" + this.getAkkumulatosTipus();
    }

}
