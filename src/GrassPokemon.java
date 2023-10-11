import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    private static String type = "grass";
    private static final List<String> attacks = Arrays.asList("leaveBlade","leechSeed","solarBeam","leafStorm");
    public void leaveBlade(Pokemon name, Pokemon enemy){
            System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "leaveBlade");
            switch(enemy.getType()){
                case "Fire":
                    System.out.println(enemy.getName() + "loses 15HP");
                    break;
                case "Electric":
                    System.out.println(enemy.getName() + "loses 25HP");
                    break;
                case"Grass":
                    System.out.println(enemy.getName() + "loses 30HP");
                    break;
                case "water":
                    System.out.println(enemy.getName() + "loses 5HP");
                    break;
        }
    }
    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "leechSeed");
        switch(enemy.getType()) {
            case "Fire":
                System.out.println(enemy.getName() + "loses 15HP");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 25HP");
                break;
            case "Grass":
                System.out.println(enemy.getName() + "loses 30HP");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 5HP");
                break;
        }
    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "solarBeam");
        switch(enemy.getType()) {
            case "Fire":
                System.out.println(enemy.getName() + "loses 15HP");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 25HP");
                break;
            case "Grass":
                System.out.println(enemy.getName() + "loses 30HP");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 5HP");
                break;
        }
    }
    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "leafStorm");
        switch(enemy.getType()) {
            case "Fire":
                System.out.println(enemy.getName() + "loses 15HP");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 25HP");
                break;
            case "Grass":
                System.out.println(enemy.getName() + "loses 30HP");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 5HP");
                break;
        }
    }
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound,type);
    }
    List<String> getAttacks() {
        return attacks;
    }
}
