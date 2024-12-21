/*
 * Szabadon felhasználható
 */
package java_exercise_6;

/**
 *
 * Nagy Gusztáv: Java programozás 39. oldal
 * 
 * @author dady
 */
public class Java_exercise_6 {

    static final int VISIBLE = 1;    // '0000000000000000 0000000000000001' 32 bit
    static final int DRAGGABLE = 2;  // '0000000000000000 0000000000000010' 32 bit
    static final int SELECTABLE = 4; // '0000000000000000 0000000000000100' 32 bit
    static final int EDITABLE = 8;   // '0000000000000000 0000000000001000' 32 bit

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int flags = 0;

        flags = flags | VISIBLE;
        flags = flags | DRAGGABLE;

        if ((flags & VISIBLE) == VISIBLE) {
            System.out.println("VISIBLE ∈ falgs");
        }
        if ((flags & DRAGGABLE) == DRAGGABLE) {
            System.out.println("DRAGGABLE ∈ falgs");
        }
        if (((flags & VISIBLE) == VISIBLE) && ((flags & DRAGGABLE) == DRAGGABLE)) {
            System.out.println("falgs are Visible and Draggable.");
        }

    }

}
