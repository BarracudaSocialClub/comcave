package com.myGames.figuren;

public class GespielterCharakter extends Charakter{
    
    protected String wirdGespieltVon;
    
    public GespielterCharakter( String spielerName ){
        // Konstruktor der Super-Klasse
        super(); // Da kein Konstruktor ohne Parameter vorhanden ist!
        this.wirdGespieltVon = spielerName;
    }
    
    public GespielterCharakter( int lebensPunkte , int schadensRate , String spielerName ){
        // Konstruktoraufruf der beerbten Klasse
        this.lebensPunkte = lebensPunkte;
        this.schadensRate = schadensRate;
    }
    
    public String zeigeSpielerName(){
        return this.wirdGespieltVon;
    }
    
    public void anzeigeDesSpielers(){
        System.out.println("\n              ----- GespielterCharakter().anzeigeDesSpielers() -----");
        System.out.println("Der Charakter wird gespielt von: " + wirdGespieltVon);
        System.out.println("lebensPunkte: " + this.lebensPunkte + " / schadensRate: " + this.schadensRate);
        System.out.println("-----");
    }
    
    @Override
    public String toString(){
        System.out.println("\n              ----- GespielterCharakter().toString() @Override -----");
        return "Der Charakter wird gespielt von: "+wirdGespieltVon+" / Lebenspunkte: "+lebensPunkte+" / Schadensrate: "+schadensRate;
    }
}
