
package com.myGames.figuren;

/**
 *
 * @author awiechens
 */
public class Krieger extends GespielterCharakter{
    
    protected int koerperkraft;
    
    public Krieger(String spieler) {
        super(spieler);
    }    
    
    public Krieger(String spieler, int koerperkraft) {
        this(spieler);
        this.koerperkraft = koerperkraft;
    }
        
    @Override
    public void ververwundetWerden(int schaden) {
        super.ververwundetWerden(schaden); 
        this.lebensPunkte+=this.koerperkraft;
        System.out.println("WUUUUUUUUUUUUUUAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHRRRRRRRRRRRRRRRR");
    }
}
