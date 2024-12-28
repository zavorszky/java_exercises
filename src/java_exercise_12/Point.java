/*
 * Szabadon felhasználható
 */
package java_exercise_12;

/**
 *
 * @author dady
 */
public class Point {

    public double x = 0;
    public double y = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    private static double negyzet(double x) {
        return x * x;
    }
    
    public double tavolsag(double x, double y) {
        return Math.sqrt(negyzet(x- this.x) + negyzet(y - this.y));
    }
    
    public double tavolsag(Point p) {
        return Math.sqrt(negyzet(p.x- this.x) + negyzet(p.y - this.y));
    }
}
