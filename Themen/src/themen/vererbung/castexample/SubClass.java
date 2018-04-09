/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themen.vererbung.castexample;

/**
 *
 * @author awiechens
 */
public class SubClass extends SuperClass{
    
    public String sMText = "Text der SubMethod";
    public String objektName = "objektName der SubClass";
    public static String staticName = "staticName der SubClass";

    @Override
    public void sourceMethod() {
        System.out.println(sMText);
    }
    
    
    
    @Override
    public void superMethod() {
        System.out.println("Ausgabe der superMethod der SubClass");
        System.out.println("Objekt ist " + this.getClass().getSimpleName());
        System.out.println(objektName);
        System.out.println(staticName);
    }

    protected void subMethod() {
        System.out.println("Text der subMethod");
    }


    
    
}
