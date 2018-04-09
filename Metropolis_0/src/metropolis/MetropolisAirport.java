
package metropolis;

import de.metropolis.lebewesen.Vogel;
import de.metropolis.maschinen.Flugmaschinen;
import de.metropolis.maschinen.Flugzeug;
import de.metropolis.maschinen.Hubschrauber;

/**
 *
 * @author awiechens
 */
public class MetropolisAirport {

    public static void main(String[] args) {
        
        Flieger[] alleMeineFlieger = new Flieger[3];
        alleMeineFlieger[0] = new Vogel();
        alleMeineFlieger[1] = new Flugzeug();
        alleMeineFlieger[2] = new Hubschrauber();
        
        for (Flieger flug : alleMeineFlieger) {
            flug.starten();
            flug.fliegen();
        }
        
        for (Flieger flug : alleMeineFlieger) {
            flug.landen();
        }
        
        Vogel spatz = new Vogel();
        spatz.starten();
        
        String gelesen = "Hallo";
        System.out.println(gelesen.toUpperCase());
        
    }
    public static void givePermissionToLand(Flieger f) {
        System.out.println("Landung erlaubt");
        f.landen();
    }
}
