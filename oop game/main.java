import Units.Crossbowman;
import Units.Monk;
import Units.Peasant;
import Units.Sniper;
import Units.Spearman;
import Units.Whief;
import Units.Wizard;

public class main {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("Том");
        Whief thief = new Whief("Хитрец");
        Sniper sniper = new Sniper("Соколиный Глаз");
        Spearman spearman = new Spearman("Марс");
        Crossbowman crossbowman = new Crossbowman("Почти соколиный глаз))");
        Monk monk = new Monk("Чанли");
        Wizard wizard = new Wizard("Гендальф");
        System.out.println(peasant);
        System.out.println(thief);
        System.out.println(sniper);
        System.out.println(spearman);
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(wizard);
    }
}