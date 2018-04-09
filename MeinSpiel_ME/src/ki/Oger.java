package ki;

import com.myGames.figuren.Charakter;

public class Oger extends Charakter{
    
    public Oger(){
        System.out.println("\n              ----- Oger() -----");
        System.out.println("Oger-Objekt ohne Parameter wird erstellt!");
        this.lebensPunkte = 200;
        this.schadensRate = 20;
    }
    
    public Oger( int lebensPunkte , int schadensRate ){
        System.out.println("\n              ----- Oger() -----");
        System.out.println("Oger-Objekt mit Parameter wird erstellt!");
        this.lebensPunkte = lebensPunkte;
        this.schadensRate = schadensRate;
    }

    @Override
    public String toString(){
        System.out.println("\n           ----- Oger().toString() @Override -----");
        return "Lebenspunkte: "+this.lebensPunkte+" / Schadensrate: "+this.schadensRate ;
    }
    
    //public void test(){
    //    System.out.println("Superklasse: "+super.getClass().getName());
    //}
    
}
