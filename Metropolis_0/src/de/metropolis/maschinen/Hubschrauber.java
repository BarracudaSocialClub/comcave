/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.metropolis.maschinen;

import metropolis.Flieger;

/**
 *
 * @author awiechens
 */
public class Hubschrauber extends Flugmaschinen implements Flieger{
    
    private int anzahlSitzplaetze;
    
    @Override
    public void starten() {
        System.out.println("Ohren zu!");
    }
    
    @Override
    public void fliegen() {
        System.out.println("Mitten in der Luft bleib ich stehen");
    }
    
    @Override
    public void landen() {
        System.out.println("Aus dem Weg, meine Rotorblätter sind gefährlich !!!");
    }
    
}
