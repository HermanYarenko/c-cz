package Units;
public class Unit {
    protected String name;
    protected float hp, luck, armor;
    protected int speed, damage;

    Unit(String name, float hp, float luck, int speed, int damage, float armor){
        this.name = name;
        this.hp = hp;
        this.luck = luck;
        this.speed =speed;
        this.damage = damage;
        this.armor = armor;
    }

    void attack(){

    }
    void await(){

    }
    void defend(){

    }
    void walk(){

    }

    void die(){

    }
}