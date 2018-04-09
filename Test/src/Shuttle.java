
import static java.lang.Math.PI;



class Rocket {
    private void blastOff() {
        System.out.println("bang");
    }
}


public class Shuttle extends Rocket{
    
    public static void main(String[] args) {
        new Shuttle().go();
        
    }
    
    void go() {
        blastOff();
        //Rocket.blastOff();
    }

    private void blastOff() {
            System.out.println("hsbang");
    }
    
}
