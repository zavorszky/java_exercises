/*
 * Szabadon felhasználható
 */
package java_exercise_26;

/**
 *
 * A "clone" használata.
 *
 * @author dady
 */
public class DTelefon implements Cloneable {

    static int IMEI_LENGTH = 15;
    static int MAX_NUMBER_OF_MESSAGES = 10;

    public String telefon_nev;
    public String imei;
    public int last_message_index;
    public StringBuffer[] uzenetek;

    public DTelefon(String p_telefon_nev, String p_imei) throws Exception {
        this.telefon_nev = p_telefon_nev;

        // IMEI ellenőrzés
        if (p_imei.length() != IMEI_LENGTH) {
            throw new Exception("Hiba: a telefon IMEI száma pontosan " + IMEI_LENGTH + " hosszú lehet. Jelenlegi hossz=" + p_imei.length());
        }

        this.imei = p_imei;

        // Üzenetek tömb létrehozása
        uzenetek = new StringBuffer[MAX_NUMBER_OF_MESSAGES];
        for (int i = 0; i < (MAX_NUMBER_OF_MESSAGES - 1); i++) {
            this.uzenetek[i] = new StringBuffer();
        }

        // Az utoljára beírt uzenet indexe
        this.last_message_index = -1;
    }

    protected DTelefon clone(String p_imei) throws Exception {

        try {
            DTelefon t = (DTelefon) super.clone();
            if ((p_imei.length() == 0) || (p_imei.length() != IMEI_LENGTH)) {
                throw new Exception("Hiba: a telefon IMEI száma pontosan " + IMEI_LENGTH + " hosszú lehet. Jelenlegi hossz=" + p_imei.length());
            }
            t.imei = p_imei;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void addMessage(String p_uzenet) throws Exception {
        if (last_message_index >= MAX_NUMBER_OF_MESSAGES - 1) {
            throw new Exception("Hiba: Az üzenetek tárhelye betelt.");
        }
        this.last_message_index++;
        this.uzenetek[last_message_index].append(p_uzenet);
    }

    public void showMessages() {
        System.out.println("A telefon neve      :" + this.telefon_nev);
        System.out.println("A telefon IMEI száma:" + this.imei);
        System.out.println("Üzenetek:");
        for (int i = 0; i <= this.last_message_index; i++) {
            System.out.println("\t" + (i + 1) + ". " + this.uzenetek[i]);
        }
    }

}
