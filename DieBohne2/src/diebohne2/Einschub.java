/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diebohne2;

import java.util.Scanner;

/**
 *
 * @author awiechens
 */
public class Einschub {
    
    public static void main(String[] args) {
        
        
        
        // Wenn j später noch verwendet werden soll, kann j außerhalb der Schleife deklariert werden
        int j = 0;
        // Schleifen
        for (j=0; j < 6; j++) {
            System.out.println("Gezählt: " + j);
            for (int k = 0; k < 15 && j>0; k++) {
                if (k%j==0) {
                    System.out.println(k + " ist durch " + j + " teilbar");
                }
            }
        }
        System.out.println("Welchen Wert hat k jetzt?" + j);
        // Schritt1: int i=0
        // Schritt2: i<6 false -> true
        // Schritt3: System.out.println("Gezählt: " + i);
        // Schritt4: j++
        // Schritt5: i<6 false -> true
        // Schritt6: System.out.println("Gezählt: " + i);
        // Schritt7: j++
        // Schritt8: i<6 false -> true
        // Schritt9: System.out.println("Gezählt: " + i);
        // Schritt10: j++
        // usw.
        
        // Bedingte Schleife: Kopfgesteuerte, Fußgesteuerte
        // Kopfgesteuert:
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zahl eingegeben! ");
        int gelesen = eingabe.nextInt();
        // while: während eine Bedingung wahr ist
        while (gelesen<6) {
            System.out.println("Eingegeben wurde: " + gelesen);
            gelesen = eingabe.nextInt();
        }
        // Schritt1: ist gelesen<6, dann Schleifendurchlauf
        // Schritt2: System.out.println("Eingegeben wurde: " + gelesen);
        // Schritt3: Einlesen einer neuen Zahl
        // Schritt4: Prüfen, ob die neue Zahl gelesen<6 ist, dann Schleifendurchlauf
        // Schritt5: System.out.println("Eingegeben wurde: " + gelesen);
        // usw.
        
        // Bedingt, fußgesteuerte Schleife: do-while Schleife
        int fGelesen = 0;
        do {
            System.out.println("Bitte Zahl eingegeben! ");
            fGelesen = eingabe.nextInt();
            System.out.println("Gelesen wurde " + fGelesen);
        }
        while (fGelesen>10) ; // Semikolon schließt fußgesteuerte Schleife ab
        // Schritt1: führe ersten Schleifendurchlauf aus
        // Schritt2: Prüfe Bedingung fGelesen>10
        // Schritt3: Falls Bedingung wahr ist, nächster Schleifendurchlauf
        
        
        
    }
    
}
