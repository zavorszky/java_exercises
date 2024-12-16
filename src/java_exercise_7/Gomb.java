/*
 * Szabadon felhasználható
 */
package java_exercise_7;

/**
 *
 * @author dady
 */
public class Gomb {

    double radius = -1;

    void setRadius(double p_radius) {
        if (p_radius >= 0) {
            radius = p_radius;
        }
    }
    
    double getRadius(){
        return radius;
    }

    double volume() {
        return radius < 0 ? -1 : ((4 * radius * radius * radius * (Math.PI)) / 3);
    }

}
