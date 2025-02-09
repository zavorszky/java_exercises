/*
 * Szabadon felhasználható
 */
package java_exercise_24;

/*
Hiteltörlesztés – Hitelezés és a hitelek visszafizetése
(Számítás az "Érintő - Elektronikus Matematikai Lapok" Weblap alapján)

Felvettünk 20 000 000 Ft hitelt 20 évre, évi 7%-os kamatra. A törlesztés mindig
az év végén történik, a kamatszámítás után, minden évben azonos összegekkel (ezt nevezzük
annuitásnak). Mennyi legyen ez az összeg, hogy a hitelünk a 20 év alatt visszafizetésre
kerüljön?

A tartozásunk az alábbi folyamatképlet szerint alakul:

( ... (((20 000 000*1,07-x)*1,07 - x)*1,07 - x) ...)*1,07 - x = 0

20 000 000*1,07^20 - x*1,07^19 - x*1,07^18 - x*1,07^17 - ... - x*1,07 - x = 0

20 000 000*1,07^20 - x(1,07^19 + 1,07^18 + ... 1,07 + 1) = 0

20 000 000*1,0^20 = x(1,07^19 + 1,07^18 + ... 1,07 + 1

Az egyenlet jobb oldalán egy mérteni sor van:
  S(n) = a1 + a1*q + a1*q^2 + ... + a1*q^(n-1)
  S(n) = a1*(q^n - 1) / (q - 1)
  ---
  a1 -> 20 000 000
  q  -> 1,07
  n  -> 20

Ezek után:

20 000 000*1,07^20 = x*(1,07^20-1)/(1,07-1)

(20 000 000*1,07^20)/[(1,07^20-1)/(1,07-1)] = x

x ~ 1 887 895

 */
/**
 *
 * @author dady
 */
public class Bank {

    public static double evesReszlet(double p_hitel, double p_evesKamat, int p_futamidoEv) {
        double kamat2 = 1 + (p_evesKamat / 100);
        return (p_hitel * Math.pow(kamat2, p_futamidoEv)) / ((Math.pow(kamat2, (p_futamidoEv - 1))) / (kamat2 - 1));
    }
}
