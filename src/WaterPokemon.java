import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private static String type = "Water";

    private static final List<String> attacks = Arrays.asList("hydroPump","hydroCanon","rainDance","surf");
    public void surf(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "surf");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 19hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 10hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 9hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 7hp");
                break;
        }
    }
    public void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "hydroPump");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 20hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 8hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 10hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 6hp");
                break;
        }
    }
    public void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "hydroCanon");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 35hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 5hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 10hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 3hp");
                break;
        }
    }
    public void rainDance(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "rainDance");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 25hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "not effective");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "added 10hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 3hp");
                break;
        }
    }
    public WaterPokemon(String name, int level, int hp, String food, String sound){
        super(name,level,hp,food,sound,type);
    }

    List<String> getAttacks() {
        return attacks;
    }
}
