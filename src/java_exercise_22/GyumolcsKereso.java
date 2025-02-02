/*
 * Szabadon felhasználható
 */
package java_exercise_22;

/**
 *
 * @author dady
 */
public class GyumolcsKereso {

    String[] gyumolcsok;
    String betuk;

    String legJobbGyumolcs = "";
    int legJobbGyumolcsIndex = -1;
    int legJobbTalalat = 0;

    public GyumolcsKereso(String[] p_gyumolcsok, String p_betuk) {
        elokeszites(p_gyumolcsok, p_betuk);
    }

    public void elokeszites(String[] p_gyumolcsok, String p_betuk) {
        this.gyumolcsok = p_gyumolcsok;
        this.betuk = p_betuk;
    }

    private int betuszam(String gyumolcs) {
        int n = 0;
        for (int i = 0; i < gyumolcs.length(); i++) {
            char c = gyumolcs.charAt(i);
            int keresesEredmenye = this.betuk.indexOf(c);
            if (keresesEredmenye > 0) {
                n++;
            }
        }
        return n;
    }

    public void kereses() {
        int aktualisBsz;
        for (int i = 0; i < this.gyumolcsok.length; i++) {
            aktualisBsz = betuszam(gyumolcsok[i]);
            if (aktualisBsz > this.legJobbTalalat) {
                this.legJobbGyumolcs = gyumolcsok[i];
                this.legJobbGyumolcsIndex = i;
                this.legJobbTalalat = aktualisBsz;
            }
        }
    }

}
