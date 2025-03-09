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

        System.out.println("\n--3--");
        System.out.println("The class of the \"myAnimal\" instance:" + myAnimal.getClass().getName());
        System.out.println("The class of the \"myCat\" instance   :" + myAnimal.getClass().getName());

        try {
            Animal myDog = myAnimal.getClass().newInstance();
            System.out.println("\nmyDog...");
            myDog.hide();
            myDog.override();
        } catch (Exception e) {
            System.out.println("Error in \"newInstance()\" or \"hide()\" or \"override()\".");
            System.out.println("Error message:" + e.getMessage());
        }

        System.out.println("\n--4--");
        //Help: https://www.geeksforgeeks.org/class-forname-method-in-java-with-examples/

        Class txt4a = String.class;
        System.out.println("txt4a...");
        System.out.println("\t" + txt4a.toString());
        System.out.println("\t" + txt4a.getClass().getName());

        try {

            Class txt4b = Class.forName("java.lang.String");
            //Class txt4b = Class.forName("String"); // NEM JÓ
            System.out.println("txt4b...");
            System.out.println("\t" + txt4b.toString());
            System.out.println("\t" + txt4b.getClass().getName());
        } catch (Exception e) {
            System.out.println("Error in \'Class.forName(\"String\")\' : " + e);
        }

        System.out.println("I don't understand what it's good for yet.\n"
                + "I can't give an example.");
    }

}
