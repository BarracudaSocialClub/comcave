package sammlungen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author awiechens
 */
public class Sammlungen_Archiv4 {

    public static void main(String[] args) {
        
        
        Set<String> namen = new TreeSet<>(); // Das besondere an TreeSet ist, dass jeder Eintrag nur einmal zugefügt werden kann
        namen.add("Justus");
        namen.add("Peter");
        namen.add("Bop");
        namen.add("Peter");
        namen.add("Justus");
        namen.add("30");
        namen.add("5");
        for (String name : namen) {
            System.out.println("Name ist " + name);
        }
        
        System.out.println("--------------------------------------------");
        
        Set <Integer> zahlen = new TreeSet<>();
        zahlen.add(17);
        zahlen.add(3);
        zahlen.add(5);
        zahlen.add(3);
        zahlen.add(17);
        for (Integer zahl : zahlen) {
            System.out.println("Zahl ist " + zahl); 
        }
        
        System.out.println("--------------------------------------------");
        
        Map<Integer, String> sammlung3 = new HashMap<>();
        sammlung3.put(0, "C");
        sammlung3.put(3, "D");
        sammlung3.put(1, "A");
        sammlung3.put(2, "B");
        sammlung3.put(4, "A");
        sammlung3.put(3, "?");
        for (String s : sammlung3.values()) {
            System.out.println("Wert: " + s);
        }
        Map<String, Kunde> meineKunden = new HashMap<>();
        meineKunden.put("ID 1", new Kunde("Justus", 20));   
        
        
        
        
//        Set<Kunde> alleKunden = new TreeSet<Kunde>();
//        
//        Kunde wichtig = new Kunde("Justus Jonas", -1000);
//        Kunde interessant = new Kunde("Peter Shaw", 0);
//        Kunde langweilig = new Kunde("Bob Andrews", 100);
//        
//        alleKunden.add(wichtig);
//        alleKunden.add(interessant);
//        alleKunden.add(langweilig);
//        
//        System.out.println("Ganz viel passiert...");
//        alleKunden.add(interessant);
//        
//        for (Kunde kunde : alleKunden) {
//            System.out.println("Lieber Kunde " + kunde.getName() + " bitte kauf mal wieder, dein aktueller Rechnungsbetrag ist " +kunde.getRechnungsBetrag());
//        }
        
        
    }    
}
