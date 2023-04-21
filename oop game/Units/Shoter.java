package Units;

public class Shoter extends Unit {
    protected int distance, maxCountBullet, currentCountBullet;
    protected float accuracy;

    Shoter(String name, float maxHp, float luck, int speed, int attack,
            int distance, int maxCountBullet, float accuracy, float armor) {
        super(name, maxHp, luck, speed, attack, armor);
        this.distance = distance;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = maxCountBullet;
        this.accuracy = accuracy;
    }

    void shoot() {

    }
    @Override
    public String getInfo() {
        return super.getInfo() + " distance:" + distance +
                " bullets:" + currentCountBullet + "/" + maxCountBullet + 
                " accuracy:" + accuracy;
    }
}
