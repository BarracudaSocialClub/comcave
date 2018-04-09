package com.myGames.figuren;

/**
 *
 * @author awiechens
 */
public class GespielterCharakter extends Charakter{ // Wichtig; Klassen erben, NICHT Objekte
    protected String wirdGespieltVon; // Alle Felder, die zur Vererbung freigegeben werden sollen, sind als protected anzulegen
    
    public GespielterCharakter(String spielerName) {
        // Konstruktoraufruf der beerbten Klasse (Superklasse)
        super(); // Konsruktor der super-Klasse
        wirdGespieltVon = spielerName;        
    }
    
    public GespielterCharakter(int lebensPunkte, int schadensRate) {
        // automatischer Konstruktoraufruf der beerbten Klasse (Superklasse)
        this.lebensPunkte = lebensPunkte;
        this.schadensRate = schadensRate;
    }
    
    public String zeigeSpielerNamen() {
        return wirdGespieltVon;
    }    
    
    public void anzeigeDesSpielers() {
        System.out.println("**********************");
        System.out.println("Der Charakter wird gespielt von: " + wirdGespieltVon);
        System.out.println("Aktuelle Lebenspunkte: " + lebensPunkte); // geht auch: super.getLebensPunkte() statt lebensPunkte, bzw. geht ausschließlich, wenn lebensPunkte private ist
        System.out.println("Die Schadensrate beträgt: " + this.schadensRate);
        System.out.println("**********************");
    }

    @Override
    public String toString() {
        return "Spieler: " +wirdGespieltVon + " | Lebenspunkte: " + lebensPunkte + " | Schadensrate: " + schadensRate; 
    }
    
    
}
