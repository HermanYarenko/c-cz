package Units;
public class Spearman extends Unit {

    public Spearman(String name){
        super(name, 30, 0.6f, 2, 4, 30);
    }

    
    public String toString() {
        return "Копейщик";
    }

    
    public void step() {
        
    }


    public String getInfo() { 
        return super.getInfo();
    }

}
