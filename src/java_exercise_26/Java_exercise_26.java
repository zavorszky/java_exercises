/*
 * Szabadon felhasználható
 */
package java_exercise_26;

/**
 *
 * Nagy Gusztáv: Java programozás 118. oldal (gyakorlat 11.11/2) (A kapcsolódó
 * osuzályok nevének első betűje (C, D...) az összetartozó osztályokat kapcsolja
 * egybe, más jelentése nincs.)
 *
 * @author dady
 */
public class Java_exercise_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("--1--");
        String s11 = "Hello";
        int i = 0;
        int j = s11.length() - 1;
        String s12 = Blablagramma.betu_csere(s11, i, j);
        System.out.println("Eredeti szöveg:    \t" + s11);
        System.out.println("Csere után (i=" + i + ", j=" + j + "):\t" + s12);

        System.out.println("\n--2--");
        String kevert_szo;
        String[] szavak = {"A", "AB", "ABC", "0123456789"};
        for (int k = 0; k < szavak.length; k++) {
            kevert_szo = Blablagramma.betu_keveres(szavak[k]);
            System.out.println("Eredeti szöveg:\t" + szavak[k]);
            System.out.println("Keverés után  :\t" + kevert_szo);
        }

        System.out.println("\n--3--");
        CSzakkonyvtar szk = new CSzakkonyvtar("BME könyvtár", "BME gazdasági főosztály", "Műszaki szakkönyvtár");
        System.out.println("Könyvtár adatok:");
        System.out.println("\tKönyvtár név:     " + szk.konyvtar_nev);
        System.out.println("\tKönyvtár fentartó:" + szk.fenntarto_nev);
        System.out.println("\tSzakterület:      " + szk.szakterulet_nev);

        System.out.println("\n--4--");

        System.out.println("Egy telefon létrehozása...");
        DTelefon tel;
        try {
            tel = new DTelefon("Xiaomi Redmi Note 13", "123456789012345");
        } catch (Exception e) {
            System.out.println("Hiba a telefon létrehozásakor:" + e.getMessage());
            return;
        }
        try {
            tel.addMessage("Hello 1.");
            tel.addMessage("Hello 2.");
            tel.addMessage("Hello 3.");
        } catch (Exception e) {
            System.out.println("Hiba egy üzenet beírásakor:" + e.getMessage());
            return;
        }

        System.out.println("A telefon adatai:");
        tel.showMessages();

        System.out.println("\nA " + tel.telefon_nev + " telefon klónozása...");
        DTelefon klon_tel;
        try {
            klon_tel = tel.clone("123456789011111");
        } catch (Exception e) {
            System.out.println("Hiba! Nem sikerült a telefon klónt létrehozni. (" + e.getMessage() + ")");
            return;
        }
        System.out.println("A klónozott telefon adatai:");

        klon_tel.showMessages();

        System.out.println("\n--5--");
        System.out.println("Create a stack...");
        EStack stck1 = new EStack("First stack");
        stck1.push("First element");
        stck1.push("Second element");
        stck1.showStack();

        System.out.println("\nClone stack \"" + stck1.stack_name + "\"...");
        EStack stck2 = stck1.clone("Second stack");
        stck2.showStack();

        System.out.println("\nPut an element on the stack \"" + stck2.stack_name + "\"...");
        stck2.push("Third element");
        stck2.showStack();
        stck1.showStack();

    }

}
