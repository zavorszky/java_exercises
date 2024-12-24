/*
 * Szabadon felhasználható
 */
package java_exercise_9;

/**
 *
 * @author dady
 */
public class LNKO {

    int a = -1;
    int b = -1;
    boolean elokeszitve = false;
    StringBuffer hibauzenet = new StringBuffer("");

    void elokeszites(int p_a, int p_b) {
        do {
            if (p_a <= 0) {
                hibauzenet.append("Hiba! A p_a argumentum ").append(Integer.toString(p_a)).append(" <= 0");
                break;
            }
            if (p_b <= 0) {
                hibauzenet.append("Hiba! A p_b argumentum ").append(Integer.toString(p_b)).append(" <= 0");
                break;
            }
            a = p_a;
            b = p_b;
            elokeszitve = true;
            break;
        } while (true);
    }

    int getA() {
        return a;
    }

    int getB() {
        return b;
    }
    
    boolean getElokeszitve() {
        return elokeszitve;
    }
    
    StringBuffer getHibauzenet(){
        return hibauzenet;
    }

    int lnkoErtek() {
        if (a == b) {
            return a;
        }

        int a1 = a;
        int b1 = b;

        int fek=1;
        while (a1 != b1) {
            
            if (fek >= 100) {
                a1 = -2;
                break;
            }
            
            if (a1 > b1) {
                a1 = a1 - b1;
            } else {
                b1 = b1 - a1;
            }
        }
        return a1;
    }
}
