/*
 * Szabadon felhasználható
 */
package java_exercise_26;

/**
 *
 * @author dady
 */
public class CSzakkonyvtar extends CKonyvtar {

    public String szakterulet_nev;

    public CSzakkonyvtar(String p_konyvtar_nev, String p_fenntarto_nev, String p_szakterulet_nev) {
        super(p_konyvtar_nev, p_fenntarto_nev);
        this.szakterulet_nev = p_szakterulet_nev;
    }

}
