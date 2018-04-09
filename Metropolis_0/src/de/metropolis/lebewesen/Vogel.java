/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.metropolis.lebewesen;

import metropolis.Flieger;

/**
 *
 * @author awiechens
 */
public class Vogel implements Flieger{
    
    @Override
    public void starten() {
        System.out.println("Zwitscher");
    }
    
    @Override
    public void fliegen() {
        System.out.println("Zwitscher");
    }
    
    @Override
    public void landen() {
        System.out.println("Zwitscher");
    }
    
}
