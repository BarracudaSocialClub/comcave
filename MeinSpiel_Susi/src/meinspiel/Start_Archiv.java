
package meinspiel;

import com.myGames.figuren.Charakter;
import com.myGames.figuren.Hexer;
import com.myGames.figuren.GespielterCharakter;
import com.myGames.figuren.Krieger;
import com.myGames.waffen.Schwert;
import ki.Oger;


public class Start_Archiv {

    public static void main(String[] args) {
        int schwertZahl = Schwert.sovieleSchwerter();
        System.out.println("Aktuelle Anzahl von Schwertern: " + schwertZahl);
        
        Oger hauDrauf = new Oger();
        Krieger ichRetteDieWelt = new Krieger("Justus Jonas");
        System.out.println("Oger: "+hauDrauf);
        System.out.println("Krieger: "+ichRetteDieWelt);
        hauDrauf.verwunden(ichRetteDieWelt);
        ichRetteDieWelt.verwunden(hauDrauf); 
        System.out.println(hauDrauf);
        System.out.println("Krieger: "+ichRetteDieWelt);
        
        Charakter figur = new Krieger("Peter Shaw");
        Object nurSo = new Krieger("Bob Andrews");
        Charakter refFuerNurSo = (Charakter)nurSo;
        System.out.println("Objekt:" + nurSo.toString());
        //nurSo.verwunden(hauDrauf);
        System.out.println("Das selbe Objekt mit neuer Referenz: " + refFuerNurSo);
        refFuerNurSo.verwunden(hauDrauf); 
        System.out.println(hauDrauf);
        
        if (ichRetteDieWelt.istNochDabei()) {
            ichRetteDieWelt.verwunden(hauDrauf);
        }
        
        Schwert exK = new Schwert();
        exK.gebeSchwertAnNeuenBesitzer(ichRetteDieWelt);
        exK.gebeSchwertAnNeuenBesitzer(hauDrauf);
        
        Schwert eins = new Schwert();
        Schwert zwei = new Schwert();
        Schwert drei = new Schwert();
        
        schwertZahl = Schwert.sovieleSchwerter(); // statische Methoden werden über Klassenname aufgerufen
        System.out.println("Aktuelle Anzahl von Schwertern: " + schwertZahl);
        
        System.out.println("Auch ne Zahl..." + drei.sovieleSchwerter()); // statische Inventar kann auch über die Objekte aufgerufen werden, 
        // ist aber in der Praxis zu vermeiden, da es den Code sehr unübersichtlich macht und daher zu unerwarteteten Folgen kommen kann. 
        // Allerdings werden hierzu Fragen in der Prüfung gestellt...
        
    }
    
}
