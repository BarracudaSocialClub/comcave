/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themen.vererbung;

import themen.vererbung.castexample.SourceClass;
import themen.vererbung.castexample.SubClass;
import themen.vererbung.castexample.SuperClass;

/**
 *
 * @author awiechens
 */
public class Cast {
    
    public static void main(String[] args) {
        
        SuperClass superclass = new SuperClass();
        superclass = new SubClass();
        
//        SubClass subclass = new SubClass();
//        subclass = (SubClass) new SuperClass(); // führt zu ClassCastException

        SubClass refSubClass_ObjectVonSubClass = new SubClass();
        SuperClass refSuperClass_ObjectVonSubClass = new SubClass();
        SuperClass refSuperClass_ObjectVonSuperClass = new SuperClass();
        
        System.out.println("refSubClass_ObjectVonSubClass.objektName: " + refSubClass_ObjectVonSubClass.objektName);
        refSubClass_ObjectVonSubClass.superMethod();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("refSuperClass_ObjectVonSubClass.objektName: " + refSuperClass_ObjectVonSubClass.objektName);
        refSuperClass_ObjectVonSubClass.superMethod();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("refSuperClass_ObjectVonSuperClass.objektName: " + refSuperClass_ObjectVonSuperClass.objektName);
        refSuperClass_ObjectVonSuperClass.superMethod();
        System.out.println("---------------------------------------------------------------------------");
        new SourceClass().sourceMethod();
        refSubClass_ObjectVonSubClass.sourceMethod();
        refSuperClass_ObjectVonSubClass.sourceMethod();
        refSuperClass_ObjectVonSuperClass.sourceMethod();
    }
}
