/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diebohne3;

import de.sanne.daten.Werbung;
import java.util.Scanner;
import kunden.Kunde;

/**
 *
 * @author awiechens
 */
public class Test {
    
    public static void main(String[] args) {
        Werbung werbung = new Werbung();
        werbung.zeigeAlleKundenAn();
        Scanner eingabe = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            String seinName = eingabe.nextLine();
            Kunde kunde = new Kunde();
            werbung.kundeZufuegen(kunde);
            kunde.setzeDenNamen(seinName);
        }
        werbung.zeigeAlleKundenAn();
        
    }
    
}
