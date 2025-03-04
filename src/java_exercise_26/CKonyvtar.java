/*
 * Szabadon felhasználható
 */
package java_exercise_26;

/**
 *
 * A "super" használata. Lásd még: CSzakkonyvtar osztály.
 *
 * @author dady
 */
public class CKonyvtar {

    public String konyvtar_nev;
    public String fenntarto_nev;

    public CKonyvtar(String p_konyvtar, String p_fenntarto) {
        this.konyvtar_nev = p_konyvtar;
        this.fenntarto_nev = p_fenntarto;
    }

    public CKonyvtar(String p_konyvtar) {
        this(p_konyvtar, "!ismeretlen_fentarto_nev");
    }

    public CKonyvtar() {
        this("!ismeretlen_konyvtar_nev", "!ismeretlen_fentarto_nev");
    }

}
