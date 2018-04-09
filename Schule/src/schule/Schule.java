
package schule;

import java.time.*; // Nach Möglichleit sind Wildcards beim Klassenimport nicht zu verwenden
import java.util.Scanner;

/**
 *
 * @author awiechens
 */
public class Schule {

    
    public static void main(String[] args) {
        
//        java.util.Date heute = new java.util.Date();
//        heute.setHours(0);
        System.out.println("Heute ist: " + LocalDate.now());
        System.out.println("Es ist: " + LocalDateTime.now());
        
        LocalDate heute = LocalDate.now();
        LocalDate morgen = heute.plusDays(1);
        System.out.println("Morgen ist: " + morgen);
        
        Scanner eingabe = new Scanner(System.in);
//        System.out.println("Tag?");
//        String tag = eingabe.next();
        System.out.println("Datum? yyy-mm-dd");
        String datum = eingabe.next();
        LocalDate ld = LocalDate.now();
    }
    
}
