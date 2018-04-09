
package de.metropolis.maschinen;

import de.metropolis.lebewesen.Superman;
import metropolis.Flieger;


public class Hubschrauber extends Flugmaschine implements Flieger{
    private int anzahlSeitzplaetze;
    public void starten(){
        System.out.println("Ich kann nur starten wenn Superman da ist");
        Superman starthelfer=Superman.rufeSuperman();
        System.out.println("Ohren zu");
    }
    public void fliegen(){
        System.out.println("Mitten in der Luft bleib ich stehen");
    }
    public void landen(){
        System.out.println("Aus dem Weg, meine Rotorblätter sind gefährlich");
    }
}
