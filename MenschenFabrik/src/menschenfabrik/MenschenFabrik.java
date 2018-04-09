/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menschenfabrik;

import java.util.Scanner;
import menschenfabrik.gender.Frau;
import menschenfabrik.gender.Mann;
import menschenfabrik.gender.Metro;
import menschenfabrik.gender.Trans;
import menschenfabrik.programmteile.Texte;

/**
 *
 * @author awiechens
 */
public class MenschenFabrik {

    
    static int count = 0;
    static Texte texte = new Texte();
    
    public static void main(String[] args) {
        
        Scanner eingabe = new Scanner(System.in);
        System.out.println(texte.AUSWAHL);
        System.out.print("Ihre Wahl für einen Menschen: ");
        String typ = eingabe.nextLine();
        new MenschenFabrik().baueMenschen(typ); // >> vorher Funktion baueMenschen() static, Susanne empfiehlt die Verwendung der objektorientierten Sprache wie hier verwendet
        
    }
        
        
    private String baueMenschen(String myMensch) {
        
        switch (myMensch){
            case "1":
                Mensch mann = new Mann();
                mann.setGender(mann.getClass().getSimpleName());                
                System.out.println(mann.getGender());                
                break;
                
            case "2":
                Mensch frau = new Frau();
                frau.setGender(frau.getClass().getSimpleName());                
                System.out.println(frau.getGender()); 
                break;
                
            case "3":
                Mensch metro = new Metro();
                break;
                
            case "4":
                Mensch trans = new Trans();
                break;
        }
        
        System.out.println("Ihr Mensch wurde erstellt");
        
        return myMensch;
    }
    
}
