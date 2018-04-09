/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ki;

import com.myGames.figuren.Charakter;

/**
 *
 * @author awiechens
 */
public class Oger extends Charakter{
    
   public Oger(){
        this.lebensPunkte=200;
        this.schadensRate=20;
    }
    @Override
    public String toString(){
        return "Oger: Leben: "+lebensPunkte;
    }
    
}
