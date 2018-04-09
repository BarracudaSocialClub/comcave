package meinspiel;

import com.myGames.figuren.Charakter;
import com.myGames.figuren.Hexer;
import com.myGames.figuren.GespielterCharakter;
import com.myGames.figuren.Krieger;
import ki.Oger;

public class Start {

    public static void main(String args[]) {

        /*
        Charakter eins = new Charakter();
        Charakter zwei = new Charakter( "Trump" );
        
        System.out.println("eins: " + eins );
        System.out.println("zwei: " + zwei + "\n");
        
        eins.verwunden(zwei);
        zwei.verwunden(eins);
        zwei.verwunden(zwei);
        eins.verwunden(eins);
        
        System.out.println("\nLebenspunkte Spieler 1: " + eins.getLebensPunkte());
        System.out.println("Lebenspunkte Spieler 2: " + zwei.getLebensPunkte());
        
        Charakter t = new Charakter( "Trump" );
        System.out.println("(Trump) Lebenspunkte: " + t.getLebensPunkte());
                
        GespielterCharakter justus = new GespielterCharakter( "Justus" );
        
        justus.anzeigeDesSpielers();
        
        Hexer lilly = new Hexer("Peter Shaw");
        lilly.verwunden(justus);
        
        lilly.anzeigeDesSpielers();
        
        justus.anzeigeDesSpielers();
        
        System.out.println("Das Objekt ist: "+justus.toString());
        System.out.println(justus); // ruft intern die toString-Methode auf
        
        Charakter c = new Charakter();
        String cAlsString = c.toString();
        System.out.println("123: " + cAlsString);
        System.out.println("123: " + c);
        
        String LillyAsString = lilly.toString();
        System.out.println(LillyAsString);
        
        // System.out.println("abc: " + Oger.getClass());
         */
        /**
         * * 2018-04-04 Oger hauDrauf = new Oger(); Krieger ichRetteDieWelt =
         * new Krieger("Justus");
         *
         * System.out.println("(1) Oger: " + hauDrauf); System.out.println("(1)
         * Krieger: " + ichRetteDieWelt);
         *
         * hauDrauf.verwunden(ichRetteDieWelt);
         * ichRetteDieWelt.verwunden(hauDrauf);
         *
         * System.out.println("(2) Oger: " + hauDrauf); System.out.println("(2)
         * Krieger: " + ichRetteDieWelt);
         *
         * Charakter figur = new Krieger("Peter Shaw"); Object nurSo = new
         * Krieger("Bob Andrews");
         *
         * Charakter refFuerNurSo = (Charakter) nurSo; // hier ändert sich nur
         * der Typ der Referenz
         *
         * System.out.println("refFuerNurSo : " + refFuerNurSo);
         * System.out.println("Object(figur): " + figur);
         * System.out.println("Object(nurSo): " + nurSo);
         *
         * //nurSo.verwunden(hauDrauf); // Die Referenz kann es nicht, das
         * Objekt schon System.out.println("Das selbe Objekt mit neuer Referenz:
         * " + refFuerNurSo); refFuerNurSo.verwunden(hauDrauf);
         * System.out.println("hauDrauf: " + hauDrauf); *
         */
        // Viele Objekte vom Typ gespielterCharakter in Array Helden[] herstellen, darunter sollten Hexen/Krieger sein
        // Die sollen Oger besiegen
        // Es sollte passieren: ClassCastException und Null-Pointer-Exception
        double tmp1;
        int tmp2;
        int hexer = 0;
        int krieger = 0;
        int spieler = 0;
        GespielterCharakter Held = null;
        int helden = 10;
        int heldenMax = helden;
        boolean beenden = false;

        GespielterCharakter Helden[] = new GespielterCharakter[heldenMax];
        for (int i = 0; i < heldenMax; i++) {

            tmp1 = (Math.random() * 3) + 1;
            tmp2 = (int) tmp1;
            System.out.println(i + " " + tmp2);

            switch (tmp2) {
                case 1: { // Hexer
                    hexer++;
                    Helden[i] = new Hexer("Hexer" + hexer);
                    break;
                }
                case 2: { // Krieger
                    krieger++;
                    Helden[i] = new Krieger("Krieger" + krieger , 10);
                    break;
                }
                case 3: { // Charakter
                    spieler++;
                    Helden[i] = new GespielterCharakter("Spieler" + spieler);
                    break;
                }
            }
        }

        System.out.println("\nÜbersicht (vor dem Duell)");
        for (GespielterCharakter i : Helden) {
            System.out.println(i);
        }

        Oger hauDrauf = new Oger(500, 50);
        System.out.println(hauDrauf);
        int lebensPunkteOger = hauDrauf.getLebensPunkte();

        /*        
        hauDrauf.verwunden(Helden[0]);
        Helden[0].verwunden(hauDrauf);
        
        lebensPunkteOger = hauDrauf.getLebensPunkte();
        System.out.println(hauDrauf);
        System.out.println("Oger: Lebenspunkte: " + lebensPunkteOger);
        
        System.out.println(Helden[0].zeigeSpielerName());
         */
        do {
            for (int i = 0; i < heldenMax; i++) {
                Held = Helden[i];
                if (Held.istNochDabei() == true) {
                    System.out.println("##### Duell: Oger: " + hauDrauf);
                    System.out.println("##### gegen: " + Held + " (" + (i + 1) + ")");

                    Held.verwunden(hauDrauf);
                    hauDrauf.verwunden(Held);

                    if (Held.getLebensPunkte() < 1) {
                        helden--;
                        System.out.println("verbleibende Helden: " + helden);
                    }
                    lebensPunkteOger = hauDrauf.getLebensPunkte();
                    System.out.println(lebensPunkteOger);

                } else {
                    System.out.println("Held(" + (i + 1) + "): " + Held + " ist schon ausgeschieden!");
                }

                if (lebensPunkteOger <= 0) {
                    System.out.println("Oger ist geschlagen!!!");
                    beenden = true;
                    break;
                }

                if (helden < 1) {
                    beenden = true;
                    break;
                }
            }
            if (beenden == true) {
                break;
            }
        } while (true);

        System.out.println("\nÜbersicht (nach dem Duell)");
        for (GespielterCharakter i : Helden) {
            System.out.println(i + " / noch dabei: " + i.istNochDabei());
        }

    }
}
