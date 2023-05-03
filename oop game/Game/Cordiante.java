package Game;

public class Cordiante {
    public int x, y;

    public Cordiante(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    public float distance(Cordiante coordinate){
        float dx = coordinate.x - this.x;
        float dy = coordinate.y - this.y;
        return (float) Math.sqrt(dx*dx+dy*dy);
    }
}