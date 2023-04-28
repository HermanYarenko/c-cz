package Units;

public interface GameInterface {
    void step(ArrayList<Unit> enemy);

    String getInfo();

    String introduce();
}