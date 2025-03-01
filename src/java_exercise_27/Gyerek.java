/*
 * Szabadon felhasználható
 */
package java_exercise_27;

/**
 *
 * @author dady
 */
public class Gyerek extends Szulo {

    public boolean aVariable; // Hides aVariable in Szulo

    public void aMetod() { // Override aMetod in Szulo
        aVariable = false;
        super.aMetod();
        System.out.println("aVariable (Gyerek):" + aVariable);
        System.out.println("aVariable (Szulo) :" + super.aVariable);

    }
}
