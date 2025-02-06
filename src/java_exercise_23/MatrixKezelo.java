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

    public static int[][] getEgysegmatrix(int p_meret) {

        if (p_meret < 1) {
            System.out.println("Figyelem, az egységmátrix mérete nem lehet 1-nél kisebb.");
            int[][] szellemMatrix = {
                {}
            };
            return szellemMatrix;
        }
        int[][] valaszMatrix = new int[p_meret][];
        for (int i = 0; i < p_meret; i++) {
            valaszMatrix[i] = new int[p_meret];
            for (int j = 0; j < p_meret; j++) {
                valaszMatrix[i][j] = (i == j ? 1 : 0);
            }
        }
        return valaszMatrix;
    }

    public static int[][] getTriangulumMatrix(boolean p_also, int p_meret, int p_atloElem, int p_haromszogElem) {
        if (p_meret < 1) {
            System.out.println("Figyelem, a triangulummátrix mérete nem lehet 1-nél kisebb.");
            int[][] szellemMatrix = {
                {}
            };
            return szellemMatrix;
        }
        int[][] valaszMatrix = new int[p_meret][];
        for (int i = 0; i < p_meret; i++) {
            valaszMatrix[i] = new int[p_meret];
            for (int j = 0; j < p_meret; j++) {
                if (i > j) {
                    valaszMatrix[i][j] = (p_also ? p_haromszogElem : 0);
                } else if (i < j) {
                    valaszMatrix[i][j] = (p_also ? 0 : p_haromszogElem);
                } else {
                    valaszMatrix[i][j] = p_atloElem;
                }
            }
        }
        return valaszMatrix;
    }

}
