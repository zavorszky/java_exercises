/*
 * Szabadon felhasználható
 */
package java_exercise_7;

/**
 *
 * @author dady
 */
public class MasodfokuEgyenlet {

    double a = 0;
    double b = 0;
    double c = 0;
    String egyenlet = "a*x² + b*x + c = 0";

    void setA(double p_a) {
        a = p_a;
    }

    void setB(double p_b) {
        b = p_b;
    }

    void setC(double p_c) {
        c = p_c;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double diszkriminans() {
        return ((b * b) - (4 * a * c));
    }

    double x1() {
        double d = diszkriminans();
        if (d < 0) {
            return Double.MAX_VALUE;
        } else {
            return ((-1 * b) + Math.sqrt(d)) / (2 * a);
        }
    }

    double x2() {
        double d = diszkriminans();
        if (d < 0) {
            return Double.MAX_VALUE;
        } else {
            return ((-1 * b) - Math.sqrt(d)) / (2 * a);
        }
    }

}
