
package metropolis;

import de.metropolis.lebewesen.Superman;
import de.metropolis.lebewesen.Vogel;
import de.metropolis.maschinen.Flugzeug;
import de.metropolis.maschinen.Hubschrauber;

public class MetropolisAirport {

  
    public static void main(String[] args) {
        Flieger[] alleMeineFlieger = new Flieger[3];
        alleMeineFlieger[0] = new Vogel();
        alleMeineFlieger[1] = new Flugzeug();
        alleMeineFlieger[2] = new Hubschrauber();
        
        for(Flieger flug : alleMeineFlieger){//erweiterte for-Schliefe
            flug.starten();
            flug.fliegen();
        }
        for(Flieger flug : alleMeineFlieger){//erweiterte for-Schliefe
            flug.landen();
        }
        Vogel spatz = new Vogel();
        spatz.starten();
         Superman clark1 = Superman.rufeSuperman();
       Superman clark2 = Superman.rufeSuperman();
       Superman clark3 = Superman.rufeSuperman();
       if(clark1 == clark2){
           System.out.println("Nur ein Superman");
       }
 
    }
    public static void givePermissionToLand(Flieger f){
        System.out.println("Landung erlaubt");
        f.landen();
    }
}
