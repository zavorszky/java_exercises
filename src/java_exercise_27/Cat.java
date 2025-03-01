/*
 * Szabadon felhasználható
 */
package java_exercise_27;

/**
 *
 * @author dady
 */
public class Cat extends Animal {

    public static void hide() {
        System.out.println("The hide() STATIC metod in Cat.");
    }

    public void override() {
        System.out.println("The override() INSTANCE metod in Cat.");
    }
}
