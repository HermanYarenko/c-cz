package Units;

import java.util.ArrayList;

public class Shoter extends Unit {
    protected int distance, maxCountBullet, currentCountBullet;
    protected float accuracy;

    Shoter(String name, float maxHp, float luck, int speed, int attack,
    int distance, int maxCountBullet, float accuracy, float armor, ArrayList<Unit> team, int x, int y) {
super(x,y,name, maxHp, luck, speed, attack, armor, team);
this.distance = distance;
this.maxCountBullet = maxCountBullet;
this.currentCountBullet = maxCountBullet;
this.accuracy = accuracy;
}

    void shoot() {

    }
    
    public String getInfo() {
        return super.getInfo() + " distance:" + distance +
                " bullets:" + currentCountBullet + "/" + maxCountBullet + 
                " accuracy:" + accuracy;
    }
    @Override
    public void step(ArrayList<Unit> enemy) {
        if (die() || currentCountBullet <= 0) {
            return;
        }
        attack(findNearUnit(enemy));
        for (Unit unit : team) {
            if (unit instanceof Peasant) {
                if (!unit.die() && ((Peasant)unit).readiness) {
                    ((Peasant)unit).readiness = false;
                    return;
                }
            }
        }
        this.currentCountBullet--;
    }
}
