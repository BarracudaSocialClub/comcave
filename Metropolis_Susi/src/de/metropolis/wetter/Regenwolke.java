/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.metropolis.wetter;

/**
 *
 * @author awiechens
 */
public class Regenwolke extends Wolke{

    
    @Override
    public void starten() {
        System.out.println("Was soll denn das sein?");
    }
    
    @Override
    public void landen() {
        System.out.println("Eigentlich landet der Regen, nicht die Wolke");
    }

    @Override
    public void dasIstDieGefahr() {
        System.out.println("Wir werden nass");
    }
    
    

    
}
