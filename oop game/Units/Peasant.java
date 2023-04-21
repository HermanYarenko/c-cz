
package Units;
public class Peasant extends Unit{
    public Peasant(String name) {
        super(name, 10, 0.5f, 1, 1, 0);
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