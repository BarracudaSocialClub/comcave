package sammlungen;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author awiechens
 */
public class Sammlungen_Archiv {

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
        
        sammlung1.add(3.1415); // Eigentlich wird ein Objekt erwartet und kein primitiver Datentyp. Im Hintergrund wird der Wrappertyp Double verwendet
        // Wrapper-Klassen...
        // Wrapper: Double >> der priimitive Datentyp double wird mit einem Objekt ummantelt
        Double wrapperPi = new Double(3.1415);
        System.out.println("Der Wert von wrapperPi ist: " + wrapperPi.doubleValue());
        double pi = wrapperPi.doubleValue();
        wrapperPi = new Double("3.1415");
        System.out.println("Der Wert von wrapperPi ist: " + wrapperPi.doubleValue());
        // Möglichkeiten der Zuordnung durch AUTOBOXING
        wrapperPi = 3.1415; // Autoboxing
        wrapperPi = new Double("3.1415");
        pi = wrapperPi;
        double quadrat = wrapperPi * wrapperPi;
        // Wrapper zu float
        Float f = new Float(2.34);
        // Wrapper zu int
        Integer zahl = new Integer("456");
        // zahl = new Integer((int) 'a');
        int zahlInt = 0345; // die 0 kennzeichnet das Oktalsystem, ein 0x würde das Hexadezimalsystem kennzeichnen
        System.out.println("Neue Zahl ist " + ++zahl);
        System.out.println("Neue Zahl ist " + ++zahlInt);
        zahl = new Integer('a');
        System.out.println(zahl);
        zahl = new Integer(1234);
        System.out.println(zahl);
        zahl = new Integer(01234);
        System.out.println(zahl);
        zahl = new Integer(0x1234);
        System.out.println(zahl);
        // Wrapper zu char
        Character c1 = new Character('x');
        System.out.println("Der neue Buchstabe ist " + ++c1);
        
        
        
    }
    
}
