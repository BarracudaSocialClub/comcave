
package de.metropolis.maschinen;

import metropolis.Flieger;

/**
 *
 * @author awiechens
 */
public class Flugzeug extends Flugmaschinen implements Flieger {
    
    private double gewicht;
    
    @Override
    public void starten() {
        System.out.println("Ich heb' ab!");
    }
    
    @Override
    public void fliegen() {
        System.out.println("Ich mach' Dreck!");
    }
    
    @Override
    public void landen() {
        System.out.println("ACHTUNG!!");
    }
}
