package de.metropolis.maschinen;

import metropolis.Flieger;

public class Flugzeug extends Flugmaschine implements Flieger{

    private double gewicht;

    public void starten() {
        System.out.println("Ich heb ab");
    }

    public void fliegen() {
        System.out.println("Ich mach Dreck");
    }

    public void landen() {
        System.out.println("Ich brauch Platz, ne ganze Landebahn lang...");
    }
}
