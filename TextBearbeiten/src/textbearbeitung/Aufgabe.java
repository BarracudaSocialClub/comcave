/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbearbeitung;

/**
 *
 * @author awiechens
 */
public class Aufgabe {
    
    public static void main(String[] args) {
        
        String satz = "Programmierer lieben Kaffee";
        String[] woerter = satz.split(" ");
        int zaehler = 1;
        for (String wort : woerter) {
            System.out.println(zaehler++ + ". Wort \'" + wort + "\' ist " + wort.length() + " Zeichen lang"); 
        }
    }    
}
