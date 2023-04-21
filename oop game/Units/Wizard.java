package Units;

public class Wizard extends Magican{

    public Wizard(String name) {
        super(name, 30, 0.7f, 2, 4, 5, 10, 1, 5, 50);
    }

    public String toString() {
        return "Маг";
    }



    public void step() {

    }

    
    public String getInfo() {
        return super.getInfo();
    }

}