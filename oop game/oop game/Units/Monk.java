package Units;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Monk extends Magican {

    public Monk(String name, ArrayList<Unit> team) {
        super(name, 20, 0.6f, 2, 2, 20, 5, 1, 10, 50, team);
    }

    
    public String toString() {
        return "Монах";
    }

    
    public String getInfo() {
        return super.getInfo();
    }

}

    public String getInfo() {
        return super.getInfo();
    }
