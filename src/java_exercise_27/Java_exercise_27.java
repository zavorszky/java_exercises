/*
 * Szabadon felhasználható
 */
package java_exercise_27;

/**
 *
 * Nagy Gusztáv: Java programozás 121. oldal
 *
 * @author dady
 */
public class Java_exercise_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--1--");
        Cat myCat = new Cat();
        Animal myAnimal = (Animal) myCat;
        System.out.println("Animal...");
        myAnimal.hide();
        myAnimal.override();
        System.out.println("\nCat...");
        myCat.hide();
        myCat.override();
        Animal myAnimal2 = new Animal();
        System.out.println("\nReal Animal...");
        myAnimal2.hide();
        myAnimal2.override();

        System.out.println("\n--2--");
        Gyerek gy = new Gyerek();
        gy.aMetod();
    }

}
