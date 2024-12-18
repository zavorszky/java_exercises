/*
 * Szabadon felhasználható
 */
package java_exercise_7;

/**
 *
 * @author dady
 */
public class MasodfokuEgyenletV2 {

    double a = 0;
    double b = 0;
    double c = 0;
    double d = 0;
    String egyenlet = "a*x² + b*x + c = 0";

    void setABC(double p_a, double p_b, double p_c) {
        a = p_a;
        b = p_b;
        c = p_c;
        d = ((b * b) - (4 * a * c));
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
        return d;
    }

    double x1() {
        if (d < 0) {
            return Double.MAX_VALUE;
        } else {
            return ((-1 * b) + Math.sqrt(d)) / (2 * a);
        }
    }

    double x2() {
        if (d < 0) {
            return Double.MAX_VALUE;
        } else {
            return ((-1 * b) - Math.sqrt(d)) / (2 * a);
        }
    }

}
