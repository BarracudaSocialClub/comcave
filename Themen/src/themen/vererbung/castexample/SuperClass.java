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
public class SuperClass extends SourceClass{
    
    public String sMText = "Text der superMethod";
    public String objektName = "objektName der SuperClass";
    public static String staticName = "staticName der SuperClass";
    
    public void superMethod() {
        System.out.println("Ausgabe der superMethod der SuperClass");
        System.out.println("Objekt ist " + this.getClass().getSimpleName());
        System.out.println(objektName);
        System.out.println(staticName);
    }

    @Override
    public void sourceMethod() {
        System.out.println(sMText);
    }
    
    
    
}
