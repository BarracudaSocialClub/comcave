/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themen.pools;

/**
 *
 * @author awiechens
 * http://www.andreas-schrade.de/java/2013/04/22/java-der-string-constant-pool/
 */
public class Strings {
    
    public static void main(String[] args) {
        
        String ERKLAERUNG = 
                  "##################################################\n"
                + "#                                                #\n"
                + "#     WANN SIND STRINGS IM POOL VERFÜGBAR ?      #\n"
                + "#                                                #\n"
                + "#  Verglichen werden folgende Strings:           #\n"
                + "#                                                #\n"
                + "#  String referrenz = \"myString\";                #\n"
                + "#  String a = \"myString\";                        #\n"
                + "#  String b = \"myString\".intern();               #\n"
                + "#  String c = new String(\"myString\");            #\n"
                + "#  String d = new String(\"myString\").intern();   #\n"
                + "#  String e = a.substring(0, a.length()-1)+ \"g\"; #\n"
                + "##################################################\n";
    
        System.out.println(ERKLAERUNG);
        
        String referrenz = "myString";
        String a = "myString";
        String b = "myString".intern();
        String c = new String("myString");
        String d = new String("myString").intern();
        String e = a.substring(0, a.length()-1)+ "g";
                
        String[] vergleich = {a, b, c, d, e};        
        
        System.out.println("String\tim Pool\tnicht im Pool");
        
        char bezeichner = 'a';
        for(String v : vergleich)  {            
            if (referrenz == v) {
                System.out.println(bezeichner+"\tX\t");
            } else {
                System.out.println(bezeichner+"\t\tX");
            }
            bezeichner++;
        }        
    }    
}
