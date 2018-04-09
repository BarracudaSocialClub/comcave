/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diebohne; // Das ist das Vezeichnis, in dem sich diese Datei befindet
/**
 * Diese Klasse hat die Aufgabe, meine Cafe-Anwendung zu strukturieren
 * @author awiechens
 */

public class DieBohne {
        
        /**
         * Dokumentationskommentar endet mit * /
         * @param args Hier landen die Befehlszeilenargumente
         */
    
        // Kommentarende am Ende der Zeile
        /* Kommentar endet mit dem Zeichen >> */
    
    public static void main(String[] args) { // Schroeter: "Die Main-Methode regelt den Lebenszyklus der Anwendung"
        // int: Ganzzahlen im positiven und negativen Bereich
        int anzahlDerBestelltenKaffees; // Variablendeklaration: Typ und Name;  Konvention: erste Buchstabe klein!!!
        anzahlDerBestelltenKaffees = 10+17*2; // Initialisierung: Erste Zuweisung
        // double: Fließkommastellen
        double gesamtPreis = anzahlDerBestelltenKaffees * 2.11;
        
        // Datentyp String (eigentlich eine Klasse...)
        String nameMeinesCafes = "Die Bohne"; // Immer mit doppeltem Hochkommata
        
        System.out.println("Mein neues Cafe heißt " + nameMeinesCafes); // Abkürzung: sout und tab-Taste
        System.out.println("Was ich heute schon an Kaffe hatte: " + anzahlDerBestelltenKaffees);
        
        System.out.println("\nDann muss ich: " + gesamtPreis + " € bezahlen"); 
        System.out.printf("Dann muss ich: %.2f € bezahlen.%n",gesamtPreis);
        System.out.println("Dann muss ich: "+((double) ((int) (gesamtPreis*100))/100)+ " € bezahlen"); 
        System.out.println("Dann muss ich: "+((double) ((int) (Math.round(gesamtPreis*100)))/100)+ " € bezahlen.\n"); 
        
        int id1 = 111;
        int id2 = 222;
        // int id3 = 033; // Die viorangestellte o verändert den Datentyp
        int id3 = 333;
        
        // andere Ganzzahlen, immer sowohl positiv als auch negativ
        byte kurzZahl = 22;
        short auchNeKurzzahl = 44;
        
        // andere Fließkommazahl
        float kleinereFliesskommaZahl = 11.6f; // Mit einem f am Ende wird ein float und kein double erzeugt
        
        System.out.println("Die gewählte id ist: " + id3);
        
        
        
        
    }
    
}
