/*
 * Szabadon felhasználható
 */
package java_exercise_12;

/**
 *
 * Nagy Gusztáv: Java programozás 62. oldal
 *
 * @author dady
 */
public class Java_exercise_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("--1--");
        double rectangleWidth = 100;
        double rectangleHeight = 50;
        double rectangleRectangleArea = new Rectangle(100, 50).area();
        System.out.println("Egy téglalap területe:" + rectangleRectangleArea + ", ha szélessége:" + rectangleWidth + ", magassága:" + rectangleHeight);

        System.out.println("\n--2--");
        Rectangle r = new Rectangle((new Point(10, 10)), 20, 5);
        Point[] pontok = {new Point(1, 2),
            new Point(12, 12),
            new Point(35, 12),
            new Point(15, 13),
            new Point(30, 15),
            new Point(29, 14)
        };

        System.out.println("A téglalap: " + r.toString());
        for (Point p : pontok) {
            if ((p.x >= (r.origin.x + r.width)) || (p.x <= r.origin.x) || (p.y >= (r.origin.y + r.height)) || (p.y <= r.origin.y)) {
                System.out.println("A " + p.toString() + " pont nincs a téglalapban.");
            } else {
                System.out.println("A " + p.toString() + " pont a téglalapban van.");
            }
        }

        System.out.println("\n--3--");
        Point legkozelebbiCsucspont;
        double legkozelebbiTavolsag;
        double aktualis_tavolsag;
        for (Point p : pontok) {
            legkozelebbiCsucspont = new Point(-1, -1);
            legkozelebbiTavolsag = Double.MAX_VALUE;
            aktualis_tavolsag = -1;
            for (Point csucspont : r.csucspontok()) {
                aktualis_tavolsag = p.tavolsag(csucspont);
                if (aktualis_tavolsag < legkozelebbiTavolsag) {
                    legkozelebbiTavolsag = aktualis_tavolsag;
                    legkozelebbiCsucspont.x = r.origin.x;
                    legkozelebbiCsucspont.y = r.origin.y;
                }
            }
            System.out.println("A " + p.toString() + " pont a " + legkozelebbiCsucspont.toString() + " csúcsponthoz van a legközelebb. Táv:" + legkozelebbiTavolsag);
        }

    }
}
