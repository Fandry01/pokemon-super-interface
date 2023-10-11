import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private static String type = "Electric";
    private static final List<String> attacks = Arrays.asList("thunderPunch","electroBall","thunder","voltTackle");

    public  void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "thunderPunch");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 12hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 8hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 15hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 30hp");
                break;
        }
    }
    public void electroBall(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "electroBall");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 12hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 8hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 15hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 25hp");
                break;
        }
    }
    public void thunder(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "thunder");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 12hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "added 10hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 18hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 35hp");
                break;
        }
    }
    public void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println("Fightt!! " + name.getName() + " Attacks!!" + enemy.getName()+ "With"+ "voltTackle");
        switch(enemy.getType()){
            case "Fire":
                System.out.println(enemy.getName() + "loses 12hp");
                break;
            case "Electric":
                System.out.println(enemy.getName() + "loses 10hp");
                break;
            case"Grass":
                System.out.println(enemy.getName() + "loses 15hp");
                break;
            case "water":
                System.out.println(enemy.getName() + "loses 40hp");
                break;
        }
    }
    public ElectricPokemon(String name,int level, int hp, String food, String sound){
        super(name, level,hp, food, sound,type);
    }
    List<String> getAttacks() {
        return attacks;
    }
}
