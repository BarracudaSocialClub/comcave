package com.myGames.figuren;

public class Charakter {

    // Attribute
    // private int lebensPunkte; // init wäre: 0
    protected int lebensPunkte; // für Vererbung benötigt
    // private int schadensRate;
    protected int schadensRate;
    // private boolean darfSpielen = true; // Init wäre: false
    protected boolean darfSpielen = true;

    // Konstruktoren
    public Charakter() {
        super();

        System.out.println("\n                  ----- Charakter() -----");
        System.out.println("                    Charakter-Objekt ohne Parameter wird erstellt!");

        // eine Zufallszahl erzeugen mittels Math.random
        double tmp = (Math.random() * 100) + 1;
        this.lebensPunkte = (int) tmp;
        // System.out.println("lebensPunkte: " + this.lebensPunkte);

        tmp = (Math.random() * 10) + 1;
        this.schadensRate = (int) tmp;
        // System.out.println("schadensRate: " + this.schadensRate);
    }

    public Charakter(String name) {
        System.out.println("\n                  ----- Charakter() -----");
        System.out.println("                    Charakter-Objekt mit Parameter 'name' wird erstellt!");
        if (name.equals("Trump")) {
            int malus = -100;
            System.out.println("Ein Trump wird erzeugt.");

            double tmp = (Math.random() * 100) + 1;
            this.lebensPunkte = (int) tmp + malus;
        } else {
//            setSpielerName( name );
        }
    }

    public Charakter(int lebensPunkteVIP) {
        System.out.println("Ein VIP wird erzeugt!");

        double tmp = (Math.random() * 100) + 1;
        this.lebensPunkte = (int) tmp + lebensPunkteVIP;
        System.out.println("lebensPunkte: " + this.lebensPunkte);
    }

    // Methoden
    public void setLebensPunkte(int punkte) {
        this.lebensPunkte = punkte;
    }

    public int getLebensPunkte() {
        return this.lebensPunkte;
    }

    public void verwundetWerden(int schaden) {
        System.out.println("\n              ----- Charakter().verwundetWerden() -----");
        System.out.println("                lebensPunkte (alt): " + lebensPunkte + " / schaden: " + schaden);
        lebensPunkte = lebensPunkte - schaden; // lebenspunkte -= schaden
        if (lebensPunkte <= 0) {
            // lebensPunkte = 0;
            darfSpielen = false;
            System.out.println("Das war's (Lebenspunkte: " + lebensPunkte + ")");
        } else {
            System.out.println("                lebensPunkte (neu): " + lebensPunkte);
        }
    }

    public void verwunden(Charakter fremder) {
        // Das Objekt selbst (also ich) wird angesprochen über: this. ist Referenz auf mich selbst
        System.out.println("\n              ----- Charakter().verwunden() -----");
        System.out.println(">>>>> this:" + this);
        System.out.println(">>>>> that:" + fremder);
        if (this != fremder) {
            fremder.verwundetWerden(schadensRate);
        } else {
            System.out.println("Das bin ich selbst!");
        }
    }

    public void geheiltWerden(int heilung) {
        System.out.println("\n              ----- Charakter().geheiltWerden() -----");
        lebensPunkte += heilung;
    }

    public boolean istNochDabei() {
        System.out.println("\n              ----- Charakter().istNochDabei() -----");
//        if (this.lebensPunkte < 1) {
//            darfSpielen = false;
//        }
        return darfSpielen;
    }

}
