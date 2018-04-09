
package de.metropolis.lebewesen;

import metropolis.Flieger;

/**
 *  singleton design pattern
 * @author awiechens
 */
public class Superman implements Flieger {
    
    private String identitaet = "Clark Kent";

    @Override
    public void starten() {
        System.out.println("Ich mach' mich auf, die Welt zu retten!");
    }

    @Override
    public void fliegen() {
        System.out.println("Unterwegs, die Welt zu retten!");
    }

    @Override
    public void landen() {
        System.out.println("Ich bin da, um die Welt zu retten!");
    }
    
}
