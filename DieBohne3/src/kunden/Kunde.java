/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kunden;

/**
 *
 * @author awiechens
 */
public class Kunde {
    
    // Attribute
    private  String name;
    /**
     * enthält den Betrag in €, den der Kunde noch zu zahlen hat
     */
    private double rechnung;
    private boolean darfKontaktiertWerden;
    
    
    // Bereich, der noch gefüllt werden muss...
    
    
    // Methoden
    public void setzeDenNamen(String kundenName) {
        name = kundenName;
    }
    public void bestellen(int id) {
        switch(id) {
            case 111: {
                System.out.println("Danke, dass du einen Latte Macchiato bestellt hast");
                rechnung = rechnung + 4.11;
                break;
            }
            case 222: {
                System.out.println("Danke, dass du einen Milchkaffee bestellt hast");
                rechnung = rechnung + 2.12;
                break;
            }
            case 333: {
                System.out.println("Danke, dass du einen Cappuchino bestellt hast");
                rechnung = rechnung + 5;
                break;
            }
            default: {
                System.out.println("Haben wir aktuell nicht im Programm. Dürfen wir dich kontaktieren, wenn es etwas Neues gibt?");
                // Vielleicht den boolean darfKontaktiertWerden ändern
                break; // Da default auch an anderer Stelle stehen kann, macht es Sinn, es von vornherein reinzunehmen... Gebraucht wird es am Ende nicht... 
            }
        }
    }
    
    public void bestellen(int id, int anzahl) {
        switch(id) {
            case 111: {
                System.out.println("Danke, dass du einen Latte Macchiato bestellt hast");
                rechnung = rechnung + (anzahl * 4.11);
                break;
            }
            case 222: {
                System.out.println("Danke, dass du einen Milchkaffee bestellt hast");
                rechnung = rechnung + (anzahl * 2.12);
                break;
            }
            case 333: {
                System.out.println("Danke, dass du einen Cappuchino bestellt hast");
                rechnung = rechnung + (anzahl * 5);
                break;
            }
            default: {
                System.out.println("Haben wir aktuell nicht im Programm. Dürfen wir dich kontaktieren, wenn es etwas Neues gibt?");
                // Vielleicht den boolean darfKontaktiertWerden ändern
                break; // Da default auch an anderer Stelle stehen kann, macht es Sinn, es von vornherein reinzunehmen... Gebraucht wird es am Ende nicht... 
            }
        }
    }
    // bestellen
    // soll sagen, ob er konataktiert werden darf
    // bezahlen
    public void bezahlen() {
        System.out.println("Die Rechnung beträgt aktuell: " + rechnung + " €");
        rechnung = 0;
    }
    
    public String gibDenNamenAn() {
        return name;
    }
    
    public double gibDenRechnungsBetragAn() {
        return rechnung;
    }
    
    public boolean darfGeben() {
        if(rechnung == 0) {
            return true;
        } else {
            return false;
        }
    }
}
