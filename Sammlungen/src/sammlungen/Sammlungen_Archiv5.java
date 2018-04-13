package sammlungen;

import java.time.LocalDate;

/**
 *
 * @author awiechens
 */
public class Sammlungen_Archiv5 {

    public static void main(String[] args) {
        
        Customer kunde1 = new Customer("Justus", "Jonas", LocalDate.parse("1990-02-17"));
        Customer kunde2 = new Customer("Justus", "Jonas", LocalDate.parse("1990-02-17"));
        //Customer kunde2 = new Customer("Justus", "Jonas", LocalDate.of(1990, 2, 17), 0);
        if(kunde1==kunde2) {
            System.out.println("==: Die beiden Kunden sind gleich");
        }
        else {
            System.out.println("==: Die beiden sind verschieden");
        }
        System.out.println("Kunde1: " + kunde1);
        System.out.println("Kunde2: " + kunde2);
        if (kunde1.equals(kunde2)) {
            System.out.println("Equals: Die beiden Kunden sind gleich");
        } else {
            System.out.println("Equals: Die beiden Kunden sind doch ziemlich verschieden");
        }
        if (kunde1.toString().equals(kunde2.toString())) {
            System.out.println("Equals mit Inhalten: Die beiden Kunden sind gleich");
        } else {
            System.out.println("Equals mit Inhalten: Die beiden Kunden sind doch ziemlich verschieden");
        }
        
        // Equals-Vergleich vor Überschreiben der equals-Methode in der Klasse Customer
    }    
    
}
