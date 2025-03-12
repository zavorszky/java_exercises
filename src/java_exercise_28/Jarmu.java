/*
 * Szabadon felhasználható
 */
package java_exercise_28;

/**
 *
 * @author dady
 */
abstract class Jarmu {

    public boolean szarazfoldi;
    public boolean vizi;
    public boolean legi;
    public int utasok_szama;

    public Jarmu(boolean p_szarazfoldi, boolean p_vizi, boolean p_legi, int p_utasok_szama) {
        this.szarazfoldi = p_szarazfoldi;
        this.vizi = p_vizi;
        this.legi = p_legi;
        this.utasok_szama = p_utasok_szama;
    }

    public boolean getSzarazfoldi() {
        return this.szarazfoldi;
    }

    public boolean getVizi() {
        return this.vizi;
    }

    public boolean getLegi() {
        return this.legi;
    }

    public int getUtasokSzama() {
        return this.utasok_szama;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        Boolean l = false;
        if (this.szarazfoldi) {
            s.append("szárazföldi");
            l = true;
        }
        if (this.vizi) {
            if (l) {
                s.append(", ");
            } else {
                l = true;
            }
            s.append("vizi");
        }

        if (this.legi) {
            if (l) {
                s.append(", ");
            }
            s.append("légi");
        }

        return "Jármű: " + s.toString() + "; erőforrás:" + this.motorTipus();
    }

    abstract String motorTipus();
}
