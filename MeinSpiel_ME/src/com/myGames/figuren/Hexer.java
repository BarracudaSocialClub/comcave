package com.myGames.figuren;

public final class Hexer extends GespielterCharakter{
    //final: Diese Klasse kann nicht beerbt werden
    // (neue) "public class SuperHexer extends Hexer" NICHT MÖGLICH
    
    private int zauberKraft = 25;
    
    public Hexer(String wirdGespieltVon){
        super(wirdGespieltVon); // holt sich den Konstruktor mit dem Parameter String
    }
    
    public Hexer(){
        super("NoN");
    }
    
    @Override
    public void verwunden(Charakter fremder){
        System.out.println("\n              ----- Hexer().verwunden() @Override");
        System.out.println("Zauberkraft: " + zauberKraft + " wird eingesetzt!");
        fremder.verwundetWerden(schadensRate+zauberKraft);
    }
    
}
