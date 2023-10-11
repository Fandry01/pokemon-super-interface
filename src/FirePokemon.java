import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private static final String type = "Fire";

    private static final List<String> attacks = Arrays.asList("fireLash","flameThrower","pyroBall","inferno");
    List<String> getAttacks() {
        return attacks;
    }

    public FirePokemon(String name, int level, int hp,String food, String sound){
    super(name, level , hp, food, sound, type);

    }


    public void fireLash(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "FireFlash");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 12hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 23hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 38hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 25hp");
                break;
        }
    }
    public void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "flameThrower");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 7hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 10hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 20hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 3hp");
                break;
        }
    }
    public void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "PyroBall");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 5HP");
                enemy.setHp(enemy.getHp() - 5);
                break;
            case "Electric":
                System.out.println(enemy.getName()+ "loses 10HP");
                enemy.setHp(enemy.getHp() - 10);
                break;
            case"Grass":
                System.out.println(enemy.getName()+ "loses 25HP");
                enemy.setHp(enemy.getHp() - 0);
                break;
            case "water":
                System.out.println(enemy.getName()+ "loses 20hp");
                enemy.setHp(enemy.getHp() - 20);
                break;
        }
        System.out.println(enemy.getName() + "has lost" + enemy.getHp());
    }

    public void inferno(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "inferno");
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
        System.out.println(enemy.getName() + "has lost" + enemy.getHp());
    }
}
