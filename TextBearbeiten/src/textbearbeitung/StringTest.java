
package textbearbeitung;

import com.sun.xml.internal.stream.Entity;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author awiechens
 */
public class StringTest {

   
    public static void main(String[] args) {
        
        String hi = "Hallo"; // hi ist die Referenz, die aktuell auf den Bereich im Speicher zeigt, der "Hallo" enthält
        String wo = new String("Welt");
        // StringPool
        String hallo = "Hallo"; // KEIN neuer Speicherbereich, sondern eine zweite Referenz, der auf Bereich im Speicher zeigt, der "Hallo" enthält
        String objHallo  = new String("Hallo");
        
        String woNeu = "Welt";
        
        String hiSpace = "Hallo ";
        hallo = hallo + " ";
        
        
        
        if (hi == hallo) {
            System.out.println("hi == hallo: Zwei String-Referenzen ein String im Pool");
        } else {
            System.out.println("hi == hallo: Zwei String-Referenzen die auf was ganz verschiedenes hinweisen");
        }
        
        if (hi == objHallo) {
            System.out.println("hi == objHallo: Zwei String-Referenzen ein String im Pool");
        } else {
            System.out.println("hi == objHallo: Zwei String-Referenzen die auf was ganz verschiedenes hinweisen");
        }
        
        if (wo == woNeu) {
            System.out.println("wo == woNeu: Zwei String-Referenzen ein String im Pool");
        } else {
            System.out.println("wo == woNeu: Zwei String-Referenzen die auf was ganz verschiedenes hinweisen");
        }
        
        int[] vieleIs = new int[3];
        vieleIs[1] = 4711;
        vieleIs = null;
        for (int i = 0; i < 100; i++) {
            int[] nochMehrIs = new int[3];
            nochMehrIs = null;
        }
        
        System.out.println("xxx" + hiSpace + "xxx" + hallo + "xxx");
        
         if (hiSpace == hallo) {
            System.out.println("hiSpace == hallo: Zwei String-Referenzen ein String im Pool");
        } else {
            System.out.println("hiSpace == hallo: Zwei String-Referenzen die auf was ganz verschiedenes hinweisen");
        }
         
        String naturalHiSpace = "Hallo ";
                
        if (hiSpace == naturalHiSpace) {
            System.out.println("hiSpace == naturalHiSpace: Zwei String-Referenzen ein String im Pool");
        } else {
            System.out.println("hiSpace == naturalHiSpace: Zwei String-Referenzen die auf was ganz verschiedenes hinweisen");
        }
        
        // .... Nachtragen
        
        String name = "Justus";
        Scanner eingabe = new Scanner(System.in); 
        System.out.println("Welcher Name ?");
        String eingegeben = eingabe.nextLine();
        if(name == eingegeben) {
            System.out.println("Diesen Namen kenne ich schon!");
        }else {
            System.out.println("Neuer Name");
        }
        if(name.equals(eingegeben)) {
            System.out.println("Hallo mal wieder! Diesen Namen kenne ich schon!");
        }
        
        // Zahlen
        int[] zahlen1 = {1, 2, 3, 4};
        int[] zahlen2 = {1, 2, 3, 4};
        if (zahlen1 == zahlen2) { // TESTEN
            System.out.println("zahlen1 und zahlen2 sind identisch");
        }
        if (zahlen1.equals(zahlen2)) { // TESTEN
            System.out.println("zahlen1 und zahlen2 haben den selben INHALT");
        }
        if (zahlen1.equals(name)) { // :Auch Vergleich des Inhalts verschiedener Typen ist möglich...
            System.out.println("zahlen1 und zahlen2 haben den selben INHALT");
        }
        if (Arrays.equals(zahlen1 , zahlen2)) { // :Inhalte der beiden Arrays werden miteinander verglichen...
            System.out.println("Gleiche Zahlen");
        }
        
        zahlen1=zahlen2; // zahlen1 verweist jetzt auch auf Speicheradresse (wo die Inhalte abgelegt sind..) von zahlen2
        if (zahlen1 == zahlen2) { // Es wird der Verweis auf die Speicheradressen verglichen...
            System.out.println("foo");
        }
        zahlen2[0] = 13;
        System.out.println("Erste Stelle des zahlen1-Arrays: " + zahlen1[0]);
    }
    
}
