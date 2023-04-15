package Units;

public class Sniper extends Shoter {
    public Sniper(String name){
        super(name, 20, 0.6f, 2, 4, 5, 10, 0.5f, 5);
    }

    
    public String toString() {
        return name;
    }

}