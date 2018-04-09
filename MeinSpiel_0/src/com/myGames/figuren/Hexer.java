/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myGames.figuren;

/**
 *
 * @author awiechens
 */
public class Hexer extends GespielterCharakter{
    
    public Hexer() {
        super("NoN");
    }
    
    public Hexer(String wirdGespieltVon){
        super(wirdGespieltVon); // da die Klasse 'GespielterCharakter' keinen Parameterlosen Konstruktor zur Verfügung stellt, muss ein bestehender mit super() aufgerufen werden
    }
    
    @Override
    public void verwunden(Charakter fremder) {
        fremder.ververwundetWerden(schadensRate + schadensRate);
    }
    
}
