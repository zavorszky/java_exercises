/*
 * Szabadon felhasználható
 */
package java_exercise_2;

/**
 * Bicikli demó
 * 
 * Nagy Gusztáv: Java programozás 20. oldal
 * 
 * @author dady
 */
public class Java_exercise_2 {
    public static void main(String[] args) {
        
        Bicycle bike1 = new Bicycle();
        
        bike1.changeCadence(50); // Sebesség fokozat ?
        bike1.speedUp(10); // Sebesség
        bike1.changeGear(2); // Felszerelés
        bike1.printStates();

        MountainBike mBike1 = new MountainBike();
        mBike1.changeCadence(51);
        mBike1.speedUp(11);
        mBike1.changeGear(21);
        mBike1.chageSusType(1);
        mBike1.printStates();
        
    }
}
