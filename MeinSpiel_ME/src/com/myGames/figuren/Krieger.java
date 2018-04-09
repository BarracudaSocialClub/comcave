package com.myGames.figuren;

public class Krieger extends GespielterCharakter{
    
    protected int koerperkraft;
    
    public Krieger(String spieler){
        super(spieler);
    }
    
    public Krieger(String spieler , int koerperkraft ){
        this(spieler);
        this.koerperkraft = koerperkraft;
    }
    
    @Override
    public final void verwundetWerden( int schaden ){
        // final: Methode kann nicht überschrieben werden
        System.out.println("\n              ----- Krieger().verwundetWerden() @Override");
        super.verwundetWerden( schaden );
        this.lebensPunkte += this.koerperkraft;
        System.out.println("\nHUUUAAA\n" + this.lebensPunkte);
    }
    
    /* Wichtig für die Zertifizierung!!!
     * public: die methode ist sichtbar im gesamten Projekt
     * protected: die Methode ist sichtbar im gesamten Package und in erbenden Klassen
     * "package friendly": wenn kein Modifier angegeben ist; sichtbar im gesamten Package
     * private: sichtbar nur in der Klasse selbst
    */
}
