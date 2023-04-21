package Units;

public class Crossbowman extends Shoter{
    public Crossbowman(String name) {
        super(name, 20, 0.5f, 2, 2, 2, 50, 0.5f, 10);
    }

    public String toString() {
        return "Арбалетчик";
    }

    public void step() {

    }

    
    public String getInfo() {
        return super.getInfo();
    }

}