/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meinspiel;


import com.myGames.figuren.Charakter;
import com.myGames.figuren.Hexer;
import com.myGames.figuren.GespielterCharakter;
import com.myGames.figuren.Krieger;
import ki.Oger;

/**
 *
 * @author awiechens
 */
public class Start {

    public static void main(String[] args) {
//        Charakter eins = new Charakter();
//        Charakter zwei = new Charakter(30);
//        eins.verwunden(zwei);
//        zwei.verwunden(eins);
//        zwei.verwunden(eins);
//        zwei.verwunden(zwei); // Autoaggression
//        System.out.println("Lebenspunkte GespielterCharakter eins: " + eins.getLebensPunkte());
//        System.out.println("Lebenspunkte GespielterCharakter zwei: " + zwei.getLebensPunkte());
//        Charakter t = new Charakter("Trump");
//        System.out.println("Trump: "  + t.getLebensPunkte());
//        Charakter vip2 = new Charakter(30, 10);
//        System.out.println("Der Charakter vip2 hat  "  + vip2.getLebensPunkte() +  " Lebenspunkte und " + vip2.getSchadensRate() + " SchadensRate");
//        GespielterCharakter justus = new GespielterCharakter("Justus Jonas");
//        justus.anzeigeDesSpielers();
//        System.out.println("Lebenspunkte: " + justus.getLebensPunkte());
//        
//        Hexer lilli = new Hexer("Peter Shaw");
//        lilli.verwunden(justus);
//            
//        justus.anzeigeDesSpielers();
//        
//        System.out.println(justus.getClass());
//        System.out.println(justus.toString().getClass());
//        
//        System.out.println(justus);
//        System.out.println("Das Objekt ist: " + justus.toString());
//        System.out.println(justus.getClass().getName());
//        System.out.println(justus.getClass().getSimpleName());
//        
//        Object o = new Object();
//        System.out.println(o.getClass().getSimpleName().equals("Object"));
//        
//        checkObjekthierarchie(justus);
        Oger hauDrauf = new Oger();
        Krieger ichRetteDieWelt = new Krieger("Justus Jonas");
        System.out.println("Oger: " + hauDrauf);
        System.out.println("Krieger: " + ichRetteDieWelt);
        hauDrauf.verwunden(ichRetteDieWelt);
        ichRetteDieWelt.verwunden(hauDrauf);
        System.out.println(hauDrauf);
        System.out.println("Kriger: " + ichRetteDieWelt);
        
        Charakter figur = new Krieger("Peter Shaw");
        Object nurSo = new Krieger("Bob Andrews");
        Object test = new String("blabla");
        Charakter refAufTest = (Charakter) test;
        
        Charakter refFuerNurSo = (Charakter) nurSo;
        
        System.out.println("Objekt: " + nurSo.toString());
        // nurSo ist eine Refferenz auf ein Objekt vom Typ Krieger
        System.out.println("Das selbe Objekt mit der selben Referenz: " + refFuerNurSo);
        refFuerNurSo.verwunden(hauDrauf);
        System.out.println(hauDrauf);
        
    }   
    
    public static String checkObjekthierarchie(Object o) {
         
        while(!o.getClass().getSimpleName().equals("Object") ) {
            System.out.println(o + "ist nicht vom Typ Objekt");
            break;
        }
        
        
        return "dies";     
    }
}
