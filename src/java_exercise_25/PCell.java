/*
 * Szabadon felhasználható
 */
package java_exercise_25;

/**
 *
 * @author dady
 */
public class PCell {

    public boolean status;

    public PCell() {
        this.status = false;
    }

    public boolean get_status() {
        return this.status;
    }

    public void turn_status() {
        this.status = !this.status;
    }
}
