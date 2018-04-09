/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menschenfabrik;

import java.util.Scanner;
import menschenfabrik.komponenten.Arm;
import menschenfabrik.komponenten.Bein;
import menschenfabrik.komponenten.Haare;
import menschenfabrik.komponenten.Kopf;
import menschenfabrik.komponenten.Torso;
import menschenfabrik.programmteile.Texte;

/**
 *
 * @author awiechens
 */
public class Mensch {
    private final int standardIq = 100;    
    private final String standardGender = "Mann";
    private final String standardName = "Peter";
       
    private int iq = standardIq;
    private String gender = standardGender;
    

    public Mensch() {
        gestalteKoerper();
        
    }
    

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    private void gestalteKoerper() {
        
        Torso torso = new Torso();
        Kopf kopf = new Kopf();
        System.out.println("Ihr Mensch beinhaltet bereits Torso und Kopf.");
        System.out.println("Wollen sie weitere Körperteile hinzufügen (Wählen sie mit 'j' für Ja oder 'n' für Nein)?");
        Scanner eingabe = new Scanner(System.in);
        String wahl = eingabe.nextLine();
        if (wahl.equals("j")){
            System.out.println("Wollen sie Haare hinzufügen (Wählen sie mit 'j' für Ja oder 'n' für Nein)?");
            String haarwahl = eingabe.nextLine();
            if (haarwahl.equals("j")) { 
                Haare haare = new Haare();
            }
            System.out.println("Wollen sie Arme hinzufügen (Wählen sie mit '1' für ein Arm, '2' für zwei Arme oder '0' für Nein)?");
            int armwahl = eingabe.nextInt();
            if (armwahl==1) { 
                Arm arm1 = new Arm();
            } else if (armwahl==2) { 
                Arm arm1 = new Arm();
                Arm arm2 = new Arm();
            }
            System.out.println("Wollen sie Beine hinzufügen (Wählen sie mit '1' für ein Bein, '2' für zwei Beine oder '0' für Nein)?");
            int beinwahl = eingabe.nextInt();
            if (beinwahl==1) { 
                Bein bein1 = new Bein();
            } else if (beinwahl==2) { 
                Bein bein1 = new Bein();
                Bein bein2 = new Bein();
            }
        }
    }
}
