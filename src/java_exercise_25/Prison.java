/*
 * Szabadon felhasználható
 */
package java_exercise_25;

/**
 *
 * @author dady
 */
public class Prison {

    public PCell[] pcells;

    public Prison(int n) {
        this.pcells = new PCell[n];
        for (int i = 0; i < this.pcells.length; i++) {
            this.pcells[i] = new PCell();
        }
    }

    public int number_of_prison_cells() {
        return this.pcells.length;
    }

    public int number_of_prison_cells_opened() {
        int n = 0;
        for (PCell pcel : this.pcells) {
            if (pcel.status) {
                n++;
            }
        }
        return n;
    }

    public void turn_cell_status(int cell_num) throws Exception {
        try {
            this.pcells[cell_num - 1].status = !this.pcells[cell_num - 1].status;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("HIBA! Nincs ilyen számú cella:" + cell_num);
        } catch (Exception e) {
            throw new Exception("HIBA! Nem kezelt hiba a " + cell_num + " cellánál:" + e.getMessage());
        }
    }

}
