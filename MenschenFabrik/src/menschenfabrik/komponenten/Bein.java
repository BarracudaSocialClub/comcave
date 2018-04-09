/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menschenfabrik.komponenten;

/**
 *
 * @author awiechens
 */
public class Bein {
    
    private final String standardSeite = "r";
    private final int standardLaenge = 90;
    
    
    private String seite = standardSeite;
    private int laengeRechts = standardLaenge;

    
    
    public String getSeite() {
        return seite;
    }

    public void setSeite(String seite) {
        this.seite = seite;
    }

    public int getLaengeRechts() {
        return laengeRechts;
    }

    public void setLaengeRechts(int laengeRechts) {
        this.laengeRechts = laengeRechts;
    }
    
    
}
