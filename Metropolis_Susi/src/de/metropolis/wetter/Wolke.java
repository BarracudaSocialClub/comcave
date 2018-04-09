
package de.metropolis.wetter;

import metropolis.Flieger;

/**
 *
 * @author awiechens
 */
public abstract class Wolke implements Flieger{
    
    protected int hoehe;
    
    public Wolke() {
        System.out.println("Eine Wolke bildet sich.");
    }
        
    @Override
    public void fliegen() {
        System.out.println("Die Wolke bewegt sich");
    }

    public void setHoehe(int hohe) {
        this.hoehe = hohe;
    }
    
    public abstract void dasIstDieGefahr() ;
    
}
