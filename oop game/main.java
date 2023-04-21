import java.util.ArrayList;
import java.util.Random;
import Units.Crossbowman;
import Units.Monk;
import Units.Names;
import Units.Peasant;
import Units.Sniper;
import Units.Spearman;
import Units.Unit;
import Units.Whief;
import Units.Wizard;

public class main {
    public static void main(String[] args) {

        ArrayList<Unit> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team1.add(new Peasant(getName()));
                    break;
                case 1:
                    team1.add(new Spearman(getName()));
                    break;
                case 2:
                    team1.add(new Crossbowman(getName()));
                    break;
                case 3:
                    team1.add(new Wizard(getName()));
                    break;
            }
        }
        System.out.println("[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();

        ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Peasant(getName()));
                    break;
                case 1:
                    team2.add(new Whief(getName()));
                    break;
                case 2: 
                    team2.add(new Sniper(getName()));
                    break;
                case 3:
                    team2.add(new Monk(getName()));
                    break;
            }
        }
        System.out.println("[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}