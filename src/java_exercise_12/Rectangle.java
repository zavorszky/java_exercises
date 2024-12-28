/*
 * Szabadon felhasználható
 */
package java_exercise_12;

/**
 *
 * @author dady
 */
public class Rectangle {

    public double width = 0;
    public double height = 0;
    public Point origin;

    public Rectangle() {
        this.origin = new Point(0, 0);
    }

    public Rectangle(Point p) {
        this.origin = p;
    }

    // Konstruktor hívás konstruktorban!
    // Info: https://stackoverflow.com/questions/285177/how-do-i-call-one-constructor-from-another-in-java
    public Rectangle(double w, double h) {
        this(new Point(0, 0), w, h);
    }

    public Rectangle(Point p, double w, double h) {
        this.width = w;
        this.height = h;
        this.origin = p;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("[");
        for (Point p : this.csucspontok()) {
            s.append(p.toString());
        }
        s.append("]");
        return s.toString();
    }

    public void move(double x, double y) {
        this.origin.x = x;
        this.origin.y = y;
    }

    public double area() {
        return (this.width) * (this.height);
    }

    public Point[] csucspontok() {
        Point[] pontok = {new Point(this.origin.x, this.origin.y),
            new Point(this.origin.x + this.width, this.origin.y),
            new Point(this.origin.x + this.width, this.origin.y + this.height),
            new Point(this.origin.x, this.origin.y + this.height)
        };
        return pontok;
    }
}
