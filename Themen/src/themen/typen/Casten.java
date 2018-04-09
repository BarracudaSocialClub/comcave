/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themen.typen;

/**
 *
 * @author awiechens
 */
public class Casten {
    
    public static void main(String[] args) {
        
        /* Zwischenbemerkung zu casten und umwandeln
        int test = (int) 3.9415; // Exlizit casten
        System.out.println("Test: " + test);
        float test2 = (float) 3.1415;
        System.out.println("Test: " + test2);
        double test3 = (double) 3; // Unnötig, da auch implizit möglich
        */
        
        // Experimentieren!
        System.out.println("Unser Kaffee wird in drei Größen angeboten: Klein, mittel & groß");
        char klein = 'k';
        char mittel = 'm';
        char gross = 'g';
        System.out.println("Welche Größe soll es sein? Bitte bestellen sie mit: k, m, g");
        System.out.println("Der Buchstabe k: " + (int) klein);
        System.out.println("Der Buchstabe m: " + (int) mittel);
        int zahl = mittel + gross;
        System.out.println("Errechnet wurde: " + (char) zahl);
        zahl = mittel/6; // Division von int / int ergibt int
        // zahl = -111; // Bitte aufpassen: Eigentlich KEINE negativen Zahlen in Buchstaben umwandeln.
        System.out.println("Errechnet wurde: " + (char) zahl + " oder als Zahl: " + (int)zahl);
              
        
    }
    
}
