package sammlungen;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author awiechens
 */
public class Sammlungen {

    public static void main(String[] args) {
        
        
        Object[] objs = new Object[3];
        System.out.println("Objs hat ajktuell " + objs.length + " Elemente"); // zum Vergleich zur ArrayList...
        Collection sammlung1 = new ArrayList();
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        sammlung1.add("Hallo");
        sammlung1.add(objs);
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        sammlung1.add("Hallo");
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        sammlung1.add(objs);
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        
        for (Object object : sammlung1) {
            System.out.println("Element in der Sammlung: " + object); // Hier zu sehen: Es werden die Referenzen hinzugefügt, nicht das Objekt!!!
        }
        
        boolean b1 = sammlung1.contains("hallo");
        System.out.println("Ist hallo in der Sammlung? " + b1);
        boolean b2 = sammlung1.contains("Hallo");
        System.out.println("Ist Hallo in der Sammlung? " + b2);
        boolean b3 = sammlung1.contains(objs);
        System.out.println("Ist das Objekt in der Sammlung? " + b3);
        Object[] objsVergleich = new Object[3];
        boolean b4 = sammlung1.contains(objsVergleich);
        System.out.println("Ist das andere Objekt in der Sammlung? " + b4);
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        sammlung1.remove(objs);
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        for (Object object : sammlung1) {
            System.out.println("Element in der Sammlung1 " + object);
        }
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        sammlung1.remove(objs);
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        for (Object object : sammlung1) {
            System.out.println("Element in der Sammlung1 " + object);
        }
        System.out.println("Sammlung1 hat aktuell " + sammlung1.size() + " Elemente");
        // Es wird immmer mit jedem Aufruf remove() nur eine Referenz aus der Collection gelöscht !!!
        sammlung1.add(3);
         
    }    
}
