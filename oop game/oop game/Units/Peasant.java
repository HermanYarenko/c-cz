
package Units;


import java.util.ArrayList;

public class Peasant extends Unit{
    public Peasant(ArrayList<Unit>gang) {
        super(name, 10, 0.5f, 1, 1, 0,gang);
    }

    
    public String toString() {
        return "Крестьянин";
    }

    
    public void step() {

    }

    
    public String getInfo() {
        return super.getInfo();
    }
}