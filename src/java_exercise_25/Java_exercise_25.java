/*
 * Szabadon felhasználható
 */
package java_exercise_25;

/**
 *
 * Nagy Gusztáv: Java programozás 118. oldal (gyakorlat 11.11/1)
 *
 * @author dady
 */

/*
Prison(pcell[] pcells| int number_of_prison_cells(); number_of_prison_cells_opened())
Cell(status boolean|boolean get_status();void turn_status())
 */
public class Java_exercise_25 {


    /*
     * A cellák állapotának kiírása.
     */
    public static void showPrisonCellsStatus(Prison p) {
        for (int i = 0; i < p.number_of_prison_cells(); i++) {
            System.out.print((i + 1) + ":" + (p.pcells[i].status ? "nyitva" : "zárva") + " ");
            if (i == 9) {
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prison prison = new Prison(13);
        System.out.println("Elkészült a \"börtön\".");
        System.out.println("Celláinak száma:\t" + prison.number_of_prison_cells());
        System.out.println("Nitott cellák száma:\t" + prison.number_of_prison_cells_opened());

        System.out.println();
        System.out.println("A cellák állapota (nyitva/zárva):");
        showPrisonCellsStatus(prison);

        System.out.println();
        boolean sikeres_cella_status_allitas = true;
        int cell_num = 13;
        System.out.println("A " + cell_num + ". cella státuszának megfordítása.");
        try {
            prison.turn_cell_status(cell_num);
        } catch (ArrayIndexOutOfBoundsException e) {
            sikeres_cella_status_allitas = false;
            System.out.println(e.getMessage());
        } catch (Exception e) {
            sikeres_cella_status_allitas = false;
            System.out.println(e.getMessage());
        }
        if (!sikeres_cella_status_allitas) {
            return;
        }
        showPrisonCellsStatus(prison);

        System.out.println();
        Prison prison2 = new Prison(7);
        System.out.println("Elkészült a 2. \"börtön\".");
        System.out.println("Celláinak száma:\t" + prison2.number_of_prison_cells());
        System.out.println("Nitott cellák száma:\t" + prison2.number_of_prison_cells_opened());
        System.out.println();
        System.out.println("A cellák állapota (nyitva/zárva):");
        showPrisonCellsStatus(prison2);

        sikeres_cella_status_allitas = true;
        try {
            for (int i = 1; i <= prison2.number_of_prison_cells(); i++) {
                System.out.println();
                for (int j = i; j <= prison2.number_of_prison_cells(); j += i) {
                    prison2.turn_cell_status(j);
                }
                System.out.println(i + ". forgatás");
                showPrisonCellsStatus(prison2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            sikeres_cella_status_allitas = false;
            System.out.println(e.getMessage());
        } catch (Exception e) {
            sikeres_cella_status_allitas = false;
            System.out.println(e.getMessage());
        }

        if (!sikeres_cella_status_allitas) {
            return;
        }

        System.out.println();
        System.out.println("A csiki-csuki után " + prison2.number_of_prison_cells_opened() + " cella nyitva áll.");

    }

}
