package sammlungen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author awiechens
 */
public class Sammlungen_Archiv3 {

    public static void main(String[] args) {
        
        List sammlung2 = new ArrayList();
        sammlung2.add("Hallo");
        sammlung2.add("Welt");
        sammlung2.add(3.1415);
        sammlung2.add(new Scanner(System.in));
        Scanner eingabe = new Scanner(System.in);
        sammlung2.add(eingabe);        
        sammlung2.add(3,Math.E);
        System.out.println("Anzahl der Elemente in sammlung2 " + sammlung2.size());
        for (int i = 0; i < sammlung2.size(); i++) {
            System.out.println("Das Element mit dem Index " +i+ " ist: " +sammlung2.get(i));            
        }
        sammlung2.remove(sammlung2.size()-1);
        for (int i = 0; i < sammlung2.size(); i++) {
            System.out.println("Das Element mit dem Index " +i+ " ist nun: " +sammlung2.get(i));            
        }
        for (int i = 0; i < sammlung2.size(); i++) {
            if (sammlung2.get(i).equals("Welt")) {
                sammlung2.remove(i);
            }                     
        }
        for (int i = 0; i < sammlung2.size(); i++) {
            System.out.println("Das Element mit dem Index " +i+ " ist nun nach dem Löschvorgang: " +sammlung2.get(i));            
        }
        int i = sammlung2.indexOf("Hallo");
        System.out.println("Das Element \"Hallo\" befindet sich an der Stelle " + i);
        int j = sammlung2.indexOf("XXX");
        System.out.println("Das Element \"XXX\" befindet sich an der Stelle " + j);
        
        Kunde wichtig = new Kunde("Justus Jonas", -1000);
        Kunde interessant = new Kunde("Peter Shaw", 0);
        Kunde langweilig = new Kunde("Bob Andrews", 100);
        Stammkunde gaehn = new Stammkunde(10, "Walther", -10);
        
//        List alleKunden = new ArrayList();
//        alleKunden.add(wichtig);
//        alleKunden.add(interessant);
//        alleKunden.add(langweilig);
//        alleKunden.add("Hans im Glück"); // Wollte ich eigentlich nicht...
//        alleKunden.add(new Kunde("Hans im Glück", 0));
        
        // GENERICS
        List<Kunde> alleKunden = new ArrayList<Kunde>(); // <Kunde> legt fest, dass nur Objekte vom Typ Kunde in die Liste aufgenommen werden können
        alleKunden.add(wichtig);
        alleKunden.add(interessant);
        alleKunden.add(langweilig);
        alleKunden.add(gaehn);
        // alleKunden.add("Hans im Glück"); // geht nicht mehr, da nur Elemente vom Typ Kunde erlaubt sind
        alleKunden.add(new Kunde("Hans im Glück", 0));
        for (Kunde kunde : alleKunden) {
            System.out.println("Kundenguthaben ist " + -kunde.getRechnungsBetrag());
        }
        // Übung: Verwendung des Constructors: public ArrayList (int, initialCapacity)
        
    }    
}
