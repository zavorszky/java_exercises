/*
 * Szabadon felhasználható
 */
package java_exercise_23;

/**
 *
 * @author dady
 */
public class MatrixKezelo {

    int[][] matrix;
    int matrixMeret;
    boolean negyzetesMatrix;
    boolean sortalanMatrix;

    public MatrixKezelo(int[][] p_matrix) {
        this.matrix = p_matrix;

        this.matrixMeret = p_matrix.length;

        if (this.matrixMeret == 0) {
            this.sortalanMatrix = true;
            this.negyzetesMatrix = false;
        } else {
            int m = -1;
            for (int i = 0; i < this.matrixMeret; i++) {
                m = p_matrix[i].length;
                if (m != this.matrixMeret) {
                    break;
                }
            }
            this.sortalanMatrix = false;
            this.negyzetesMatrix = (m == this.matrixMeret);
        }
    }

    public void transzponalas() {
        if ((!this.sortalanMatrix) && this.negyzetesMatrix) {
            for (int i = 0; i < (this.matrixMeret - 1); i++) {
                for (int j = i + 1; j < this.matrixMeret; j++) {
                    if (i != j) {
                        int cella = this.matrix[i][j];
                        this.matrix[i][j] = this.matrix[j][i];
                        this.matrix[j][i] = cella;
                    }
                }
            }
        }
    }

}
