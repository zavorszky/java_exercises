/*
 * Szabadon felhasználható
 */
package java_exercise_23;

/**
 *
 * Nagy Gusztáv: Java programozás 98. oldal (gyakorlat 10.6/3)
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

    }

}
