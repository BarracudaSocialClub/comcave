
package de.metropolis.lebewesen;

import metropolis.Flieger;

/**
 * singleton design pattern
 * @author Sanne
 */
public class Superman implements Flieger{
    private String identitaet =  "Clark Kent";
    private int weltRettungen=0;
    private static Superman superman;
    
    private Superman(){
        /**
         * Soll die getInstance Methode aus Design Pattern umsetzen
         * @return gibt Das <h2> </h2>
         */
        
    }
    
    public static Superman rufeSuperman(){
        if(superman==null){
            superman = new Superman();
        }
        return superman;
    }
    
    @Override
    public void starten(){
        System.out.println("Ich mach mich auf, die Welt zu retten");
    }
    @Override
    public void fliegen(){
        System.out.println("Unterwegs die Welt zu retten");
    }
    @Override
    public void landen(){
        System.out.println("Ich bin da, um die Welt zu retten");
        weltRettungen++;
    }
}
