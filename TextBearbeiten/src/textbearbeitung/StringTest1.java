
package textbearbeitung;

import com.sun.xml.internal.stream.Entity;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author awiechens
 */
public class StringTest1 {

   
    public static void main(String[] args) {
        
        String hi = "Hallo";
        String begruessung = hi.concat(" Welt!");
        System.out.println("In hi: " + hi);
        System.out.println("In begruessung: " + begruessung);
        String wichtiges = hi.toUpperCase();
        System.out.println("In wichtiges: " + wichtiges);
        String unwichtiges = hi.toLowerCase();
        System.out.println("In unwichtiges: " + unwichtiges);
        String neuesHi = hi.replace('l', 'x');
        System.out.println("In neuesHi: " + neuesHi);
        hi = hi.replace('a', 'o');
        System.out.println("In hi: " + hi);
        
        // AUFGABE:
        // String: Programmierer lieben Kaffee
        // Ziel: wie viele Buchstaben haben die Wörter in dem Satz oben?
        // Ähnlich: 1. Wort hat 15 Buchstaben, 2. Wort hat ...
        
        
        
    }
    
}
