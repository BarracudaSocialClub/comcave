/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themen.arrays;

import java.util.Scanner;

/**
 *
 * @author awiechens
 */
public class Beispiel {
    
    public static void main(String[] args) {
        
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Wieviele Produkte?");
        int benutzerEingabe = eingabe.nextInt();
        int produktAnzahl = 6;
        if(benutzerEingabe>=6) {
            produktAnzahl = benutzerEingabe;
        }
        
        String[] sorten = new String[produktAnzahl];
        int ids[] = new int[produktAnzahl];
        ids[3] = 333;
        ids[2] = 222;
        ids[5] = 222;
        for (int k = 0; k < ids.length; k++) {
            System.out.println("An der Stelle " + k + " befindet sich das Element " + ids[k]); 
        }
        for (int k = 0; k < sorten.length; k++) {
            System.out.println("An der Stelle " + k + " befindet sich das Element " + sorten[k]); 
        }
        
        for(String sorte : sorten) {
            int k=0;
            System.out.println("An der Stelle " + k + " befindet sich das Element " + sorte);
            k++;
        }
        ids[1] = (int) 3.1415F;
        char[] groessen = {'k', 'm', 'g'}; // NUR bei einer Definition
        System.out.println("Länge des groessen-Arrays: " + groessen.length);
        System.out.print("\nDiese Größen gibt es bei uns: " );
        for (char groesse : groessen) {
            System.out.print(" " + groesse);
        }
        String []kunden = new String[10]; // Syntax in Ordnung, exakt gleichwertig zu String[] kunden =...
        String kunden1[] = new String[10];
        String[] kunden2 = new String[10];
        // []String kunden3 = new String[10]; // geht nicht...
        String [] kunden4 = new String[10];
        String kunden5 [] = new String[10];
        String kunden6                                       [] = new String[10];
        
        
        
    }
    
}
