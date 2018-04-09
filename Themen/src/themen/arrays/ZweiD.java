/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themen.arrays;

/**
 *
 * @author awiechens
 */
public class ZweiD {
    
    public static void main(String[] args) {
        
        
        // Array: Sammlung gleichartiger Variablen; Arrays haben eine feste Größe
        int anzahlGeraderZahlen = 5;
        int[] sammlung;
        sammlung = new int[anzahlGeraderZahlen]; // Initialisierung ei es Arrays: Schlüsselwort: new
        int counter = 0;
        for (int k = 0; k < 30; k++) {
            if (k%2==0) {
                System.out.println("K: " + k);
                sammlung[counter]=k; // Zugriff auf die einzellnen Elemente des Arrays mit dem Index; Kleinster Index: 0
                counter++;
            }
            if (counter==anzahlGeraderZahlen) {
                break; // Beendet die Schleife
            }
        }
        for (int k = 0; k < sammlung.length ; k++) {
            System.out.print(" " + sammlung[k] + " ");
        }
        System.out.println("");
        
        
        int[][] feld1 = {new int[2], new int[4], new int[3], new int[16]};
        int[][] feld2 = new int[3][3];
        int[][] feld3 = new int[5][0];
        int[][] feld4 = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7, 8}, {33}, {3, 6, 9, 12}};
        feld1[0][0] = 1;
        int[] element = {2, 4, 6, 8};
        feld1[0] = element;
        
        System.out.println("\n ");
        
        System.out.println("Die 3 steckt in " + feld4[0][2]);
        System.out.println("Die 3 steckt in " + feld4[1][0]);
        for (int loc : feld4[3]) {
            System.out.println(loc + " ");
        }
        System.out.println(" ");
        
        int[][] feld8 = new int[3][3]; // Abkürzung für ...
        int[][] feld8_1 = new int[3][0];
        feld8_1[0] = new int[3];
        feld8_1[1] = new int[3];
        feld8_1[2] = new int[3];
        
    }
    
}
