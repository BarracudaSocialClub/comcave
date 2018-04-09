package com.myGames.figuren;

/**
 *
 * @author awiechens
 */
public class Charakter {
    
    // Attribute
    protected int lebensPunkte; // mit '0' vorinitialisiert
    protected int schadensRate; // mit '0' vorinitialisiert
    protected boolean darfSpielen = true; // andernfalls mit 'false' vorinitialisiert
    
    // Konstruktoren
    public Charakter() {
        System.out.println("Das Objekt wird erstellt");
        // Ene zufällige Zahl soll erzeugt werden
        // Math.random
        double tmp = (Math.random()*100)+1; // Wertebereich zwischen 1 und 100.99999999999...
        lebensPunkte = (int) tmp; // Durch das casten wird die Nachkommastelle entfernt, so dass der Wertebereich zwischen 1 und 100 liegt
        tmp = (Math.random()*10)+1;
        schadensRate = (int) tmp;
    }
    
    public Charakter(int vipFaktor) {
        System.out.println("Ein VIP wird erzeugt");
        double tmp = (Math.random()*100)+1; 
        lebensPunkte = (int) tmp + vipFaktor;
        tmp = (Math.random()*10)+1;
        schadensRate = (int) tmp;
    }
    
    public Charakter(String name) {
        if (name.equals("Trump")) {
            int malus = -100;
            System.out.println("Ein Trump wird erzeugt");
            double tmp = (Math.random()*100)+1; 
            lebensPunkte = (int) tmp + malus;
            tmp = (Math.random()*10)+1;
            schadensRate = (int) tmp;
        } else {
            System.out.println("Das Objekt wird erstellt");
            double tmp = (Math.random()*100)+1;
            lebensPunkte = (int) tmp; 
            tmp = (Math.random()*10)+1;
            schadensRate = (int) tmp;
        }  
    }
    
    public Charakter(int vipFaktorLeben, int vipFaktorSchaden) {
        // Übung: i, j sollen lebenspunkte und schadensrate verbessern
        this(vipFaktorLeben);        
        this.schadensRate += vipFaktorSchaden;        
    }
    
        
    // Methoden
    public void ververwundetWerden(int schaden) {
        lebensPunkte = lebensPunkte - schaden; // abkürzende Schreibweise: lebenspunkte -= schaden;
        if (lebensPunkte <= 0) {
            darfSpielen = false;
            System.out.println("Das war's...");
        }
    }
    
    public void verwunden(Charakter fremder) {
        // Das Objekt selbst, also "ich" wird angesprochen über 'this'
        // this ist Referenz auf
//        System.out.println("****************** Zur Kontrolle *********************");
//        System.out.println("this: " + this);
//        System.out.println("fremder: " + fremder);
//        System.out.println("******************  Kontrolle Ende ********************");
        if (this != fremder) {
            fremder.ververwundetWerden(schadensRate);
        } else {
            System.out.println("Das mach' ich nicht !");
        }
        
    }
    
    public void geheiltWerden(int heilung) {
        lebensPunkte += heilung;
    }
    
    public int getLebensPunkte() {
        return lebensPunkte;
    }
    
    public int getSchadensRate() {
        return schadensRate;
    }
    
    public boolean istNochDabei() {
        return darfSpielen;
    }
    
}
