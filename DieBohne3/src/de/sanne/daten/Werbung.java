
package de.sanne.daten;

import kunden.Kunde;

/**
 *
 * @author awiechens
 */
public class Werbung { // Besispielklasse zu alles Mögliche zu Methoden
    //werbeSpamOpfer soll sofort beim Anlegen des Objektes initialisiert werden:
    private Kunde[] werbeSpamOpfer = new Kunde[10];
    private String kundenName;
    public void zeigeAlleKundenAn() {
        System.out.println("*****************************");
        for (Kunde meinKunde : werbeSpamOpfer) {
            if (meinKunde != null) {
                kundenName = meinKunde.gibDenNamenAn();
            } else {
                kundenName= "---";
            }
            System.out.println("Der Kunde ist: " + kundenName);
        }
        
        System.out.println("*****************************");
    }
    public void kundeZufuegen(Kunde neuerKunde) {
        // Soll an eine Stelle erfolgen, die noch frei ist
        // Eine Ausgabe soll erfolgen, wenn das Kunden-Array schon voll ist
        // kein Kunde soll überschrieben werden
        // Vergleich mit null ist möglich: if (k[i] == null
        for (int i = 0; i < werbeSpamOpfer.length; i++) {
            if (werbeSpamOpfer[i] == null) {
                werbeSpamOpfer[i] = neuerKunde;
                break;
            }
            if (werbeSpamOpfer[werbeSpamOpfer.length-1] != null) {
                System.out.println("Array ist voll!");
                break;
            }
        }
        
    }
    
    public void anredeAendern() {
        for (Kunde meinKunde : werbeSpamOpfer) {
            meinKunde.setzeDenNamen(meinKunde.gibDenNamenAn().toUpperCase());
            /* Gleichbedeutend:
                String tmp = meinmeinKunde.gibDenNamenAn();
                String gross = tmp.toUpperCase();
            */
        }
        Kunde testKunde = werbeSpamOpfer[0];
        kundeIstKoenig(testKunde);
    }
    
    public void kundeIstKoenig(Kunde meinKunde) {
        meinKunde.setzeDenNamen("König");        
    }
    
    public void kundeIstKoenig(Kunde[] alleMeinKunden) {
        Kunde koenig = new Kunde();
        koenig.setzeDenNamen("König");    
        alleMeinKunden[0] = koenig;
    }
    
    public void zahlenKram() {
        int i = 0, j = 10;
        int k  = 0;
        manI(i);
        System.out.println("i hat den Wert " + i);
    }
    
    public void manI(int i) {
        i++;
    }
    
}
