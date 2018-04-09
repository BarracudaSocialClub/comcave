/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themen.operatoren;

/**
 *
 * @author awiechens
 */
public class Grundlagen {
    
    public static void main(String[] args) {
        
        // Operatoren
        String str = "hallo" + "welt"; // Große Ausnahme, alle anderen Operatoren nur für primitive Datentypen
        
        // +, -, /, *
        int i = 3+4;
         
        // &: Logische Verknüpfung: und
        boolean b1 = true;
        boolean b2 = false;
        boolean verknuepft = b1 & b2; // verknuepft ist nur wahr, wenn beide Operanden true sind
        verknuepft = b1 && b2; // Abkürzung; b2 wird nur überprüft oder ausgeführt, wenn b1 true ist
         
        // |: Logische Verknüpfung: oder
        verknuepft = b1 | b2; // verknuepft ist wahr, wenn b1 oder b2 wahr ist oder beide
        verknuepft = b1 || b2; // Abkürzung: b2 wird nur überprüft oder ausgeführt, wenn b1 false ist
        
        // ^: Logische Verknüpfung: entweder oder (exklusives oder)
        verknuepft = b1^b2; // verknuepft ist wahr, wenn b1 oder b2 wahr ist aber nicht beide
        
        // !: Logische Verknüpfung: nicht
        verknuepft = !b1; // verknuepft ist wahr, wenn b1 false ist
         
        // Modulo-Operator: Restklassen Operator: Gibt den Rest einer ganzzahligen Division aus
        int zahl1 = 16;
        int zahl2 = 5;
        int mod = zahl1%zahl2; //ergibt: 1
        
        
    }
    
}
