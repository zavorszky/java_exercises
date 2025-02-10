/*
 * Szabadon felhasználható
 */
package java_exercise_24;

/*
Hiteltörlesztés – Hitelezés és a hitelek visszafizetése
(Számítás az "Érintő - Elektronikus Matematikai Lapok" Weblap alapján: https://ematlap.hu/tanora-szakkor-2021-7/1159-hitelek-es-jaradekok)

ÉVES RÉSZLETFIZETÉS
-------------------
Felvettünk 20 000 000 Ft hitelt 20 évre, évi 7%-os kamatra. A törlesztés mindig
az év végén történik, a kamatszámítás után, minden évben azonos összegekkel (ezt nevezzük
annuitásnak). Mennyi legyen ez az összeg, hogy a hitelünk a 20 év alatt visszafizetésre
kerüljön?

A tartozásunk az alábbi folyamatképlet szerint alakul:

( ... (((20 000 000*1,07-x)*1,07 - x)*1,07 - x) ...)*1,07 - x = 0

20 000 000*1,07^20 - x*1,07^19 - x*1,07^18 - x*1,07^17 - ... - x*1,07 - x = 0

20 000 000*1,07^20 - x(1,07^19 + 1,07^18 + ... 1,07 + 1) = 0

20 000 000*1,0^20 = x(1,07^19 + 1,07^18 + ... 1,07 + 1)

Az egyenlet jobb oldalán egy mérteni sor van:
  S(n) = a1 + a1*q + a1*q^2 + ... + a1*q^(n-1) Figyelem! n darab összeadandó!
  S(n) = a1*((q^n - 1) / (q - 1))
  ---
  a1 -> x
  q  -> 1,07
  n  -> 20

Ezek után:
S(20) = x*[(1,07^20 - 1) / (1,07 - 1)]

20 000 000*1,07^20 = x*[(1,07^20 - 1))/(1,07 - 1)]

(20 000 000*1,07^20)/[(1,07^20 - 1)/(1,07 - 1)] = x

x ~ 1 887 895

HAVI RÉSZLETFIZETÉS
--------------------
A futamidő 12 szeresére nő: 20 év  -> 240 hónap
A kamat 1/12 -ére csökken : 7% évi -> 0,583 havi

(20 000 000*1,00583^240)/[(1,00583^2240 - 1)/(1,00583 - 1)] = x

x ~ 155 012 havonta (1 860 144 évente)

BANKI HAVI RÉSZLETFIZETÉS
-------------------------
A bankok a hitelekre ezt a számítást az annuitás meghatározására használják, de
a tényleges elszámolás ennél prózaibb módon történik. A hónap elején fennálló tőketartozás
éves kamatát kiszámítják, ezt 360-nal osztják ('), majd megszorozzák az adott hónapban
levő napok számával, így megkapják azt az összeget, amelyet az adós kamatként fog
megfizetni az adott hónapra. A havi törlesztőrészlet fennmaradó összege a tőketartozást
csökkenti.
(Tehát a részletünk attól is függ melyik hónapban számolják ki, ezért a havi részlet
kiszámításakor mindíg pontosan tudnunk kell hogy az milyen naptári napra esik!)
 */
/**
 *
 * @author dady
 */
public class Bank {

    public static double evesReszlet(double p_hitel, double p_evesKamat, int p_futamidoEv) {
        double kamat2 = 1 + (p_evesKamat / 100);
        // 1) return (p_hitel * Math.pow(kamat2, p_futamidoEv)) / ((Math.pow(kamat2, p_futamidoEv ) - 1) / (kamat2 - 1));
        double szamlalo = Math.pow(kamat2, p_futamidoEv);
        double nevezo = (Math.pow(kamat2, p_futamidoEv) - 1) / (kamat2 - 1);
        return p_hitel * (szamlalo / nevezo);
    }

    public static double haviReszlet(double p_hitel, double p_evesKamat, int p_futamidoEv) {
        double kamat1 = p_evesKamat / 12;
        int futamidoHonap = p_futamidoEv * 12;
        return Bank.evesReszlet(p_hitel, kamat1, futamidoHonap);
    }
}
