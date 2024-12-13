/*
 * Szabadon felhasználható
 */
package java_exercise_2;

/**
 *
 * @author dady
 */
public class MountainBike extends Bicycle {

    int suspensionType = 0;

    void chageSusType(int newValue) {
        suspensionType = newValue;
    }

    @Override
    void printStates() {
        System.out.println("cadence:" + cadence + ", speed:" + speed + ", gear:" + gear + ", suspension type:" + suspensionType);
    }

}
