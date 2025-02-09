/*
 * Szabadon felhasználható
 */
package java_exercise_23;

/**
 *
 * Nagy Gusztáv: Java programozás 98. oldal (gyakorlat 10.6)
 *
 * @author dady
 */
public class Java_exercise_23 {

    public static void showMatrix(int[][] p_matrix) {
        int n = p_matrix.length;
        for (int i = 0; i < n; i++) {
            int m = p_matrix[i].length;
            for (int j = 0; j < m; j++) {
                System.out.print(p_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 3, 4, 1},
            {1, 1, 2, 1},
            {2, 2, 1, 2},
            {2, 3, 1, 1}
        };

        System.out.println("Kiinduló mátrix:");
        showMatrix(matrix);
        MatrixKezelo mk = new MatrixKezelo(matrix);
        if (mk.sortalanMatrix) {
            System.out.println("A mátrixnak nincsenek sorai.");
        } else if (!mk.negyzetesMatrix) {
            System.out.println("A mátrix nem négyzetes.");
        } else {
            System.out.println("Taranszponálás után a mátrix:");
            mk.transzponalas();
            showMatrix(matrix);
        }

        System.out.println("\n--2--");
        int[][] matrix2 = {
            {2, 3, 4, 1},
            {1, 1, 2, 1},
            {2, 2, 1, 2}
        };
        showMatrix(matrix2);
        MatrixKezelo mk2 = new MatrixKezelo(matrix2);
        if (mk2.sortalanMatrix) {
            System.out.println("A mátrixnak nincsenek sorai.");
        } else if (!mk2.negyzetesMatrix) {
            System.out.println("A mátrix nem négyzetes.");
        } else {
            System.out.println("Taranszponálás után a mátrix:");
            mk2.transzponalas();
            showMatrix(matrix2);
        }

        System.out.println("\n--3--");
        int[][] matrix3 = {
            {}
        };
        showMatrix(matrix3);
        MatrixKezelo mk3 = new MatrixKezelo(matrix3);
        if (mk3.sortalanMatrix) {
            System.out.println("A mátrixnak nincsenek sorai.");
        } else if (!mk3.negyzetesMatrix) {
            System.out.println("A mátrix nem négyzetes.");
        } else {
            System.out.println("Taranszponálás után a mátrix:");
            mk3.transzponalas();
            showMatrix(matrix3);
        }

        System.out.println("\n--4--");
        int[][] matrix4 = {};
        showMatrix(matrix4);
        MatrixKezelo mk4 = new MatrixKezelo(matrix4);
        if (mk4.sortalanMatrix) {
            System.out.println("A mátrixnak nincsenek sorai.");
        } else if (!mk4.negyzetesMatrix) {
            System.out.println("A mátrix nem négyzetes.");
        } else {
            System.out.println("Taranszponálás után a mátrix:");
            mk4.transzponalas();
            showMatrix(matrix4);
        }

        System.out.println("\n--5--");
        int n5 = 5;
        int[][] matrix5 = MatrixKezelo.getEgysegmatrix(n5);
        System.out.println("Egy " + n5 + " méretű egységmátrix készítésa.");
        System.out.println("Íme:");
        showMatrix(matrix5);

        System.out.println("\n--6--");
        int n6 = 1;
        int[][] matrix6 = MatrixKezelo.getEgysegmatrix(n6);
        System.out.println("Egy " + n6 + " méretű egységmátrix készítésa.");
        System.out.println("Íme:");
        showMatrix(matrix6);

        System.out.println("\n--7--");
        int n7 = 0;
        int[][] matrix7 = MatrixKezelo.getEgysegmatrix(n7);
        System.out.println("Egy " + n7 + " méretű egységmátrix készítésa.");
        System.out.println("Íme:");
        showMatrix(matrix7);

        System.out.println("\n--8--");
        boolean alsoTriangulumMatrix8 = true;
        int n8 = 8;
        int atloElem = 1;
        int haromszogElem = 2;
        int[][] matrix8 = MatrixKezelo.getTriangulumMatrix(alsoTriangulumMatrix8, n8, atloElem, haromszogElem);
        System.out.println("Egy " + n8 + " méretű " + (alsoTriangulumMatrix8 ? "also" : "felso") + " triangulummátrix készítésa.");
        System.out.println("Átló elem:\t" + atloElem);
        System.out.println("Háromszög elem:\t" + haromszogElem);
        System.out.println("Íme:");
        showMatrix(matrix8);

        System.out.println("\n--9--");
        alsoTriangulumMatrix8 = false;
        int[][] matrix9 = MatrixKezelo.getTriangulumMatrix(alsoTriangulumMatrix8, n8, atloElem, haromszogElem);
        System.out.println("Egy " + n8 + " méretű " + (alsoTriangulumMatrix8 ? "also" : "felso") + " triangulummátrix készítésa.");
        System.out.println("Átló elem:\t" + atloElem);
        System.out.println("Háromszög elem:\t" + haromszogElem);
        System.out.println("Íme:");
        showMatrix(matrix9);

    }

}
