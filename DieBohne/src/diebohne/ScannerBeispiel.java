/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diebohne;

import java.util.Scanner;


/**
 *
 * @author awiechens
 */
public class ScannerBeispiel {
    
    public static void main(String[] args) {
        
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Hallo! Willkommen in der Bohne! Wie heißt du?");
        String kundenName = eingabe.nextLine();
        System.out.println("Schön, dass du da bist " + kundenName);
        String sorte1 = "Latte Macchiato";
        String sorte2 = "Milchkaffee";
        String sorte3 = "Cappuchino";
        String sorte4 = "Coffee to go far away";
        
        int id1 = 111;
        int id2 = 222;
        int id3 = 333;
        int id4 = 444;
        
        double preis1 = 4.11;
        double preis2 = 2.12;
        double preis3 = 5;
        double preis4 = 10;
        
        
        System.out.println("Unser Kaffee " + sorte1 + " wird bestellt mit der id: " + id1 + " und kostet: " + preis1 +" €");
        System.out.println("Unser Kaffee " + sorte2 + " wird bestellt mit der id: " + id2 + " und kostet: " + preis2 +" €");
        System.out.println("Unser Kaffee " + sorte3 + " wird bestellt mit der id: " + id3 + " und kostet: " + preis3 +" €");
        System.out.println("Unser Kaffee " + sorte4 + " wird bestellt mit der id: " + id4 + " und kostet: " + preis4 +" €");
        
        System.out.println("Welche Sorte soll es sein?");
        int gewaelteSorte = eingabe.nextInt();
        System.out.println("Gewählt wurde: " + gewaelteSorte);
        
        // Wahrheitswerte als Datentyp
        boolean eingabeKorrekt = true;
        eingabeKorrekt = 3<4;
        eingabeKorrekt = gewaelteSorte==111;
        System.out.println("War die eingegebene ID 111? " + gewaelteSorte);
        
    }
    
}
