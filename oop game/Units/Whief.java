package Units;

public class Whief extends Unit {

    public Whief(String name) {
        super(name, 20, 0.8f, 3, 2, 10);
    }

    @Override
    public String toString() {
        return "Разбойник";
    }

    void dodge() {

    }

    void stealth() {

    }

    public void step() {
        
    }

    
    public String getInfo() {
        return super.getInfo();
    }
}