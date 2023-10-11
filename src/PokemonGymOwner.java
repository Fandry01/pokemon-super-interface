import java.util.List;

public class PokemonGymOwner extends PokemonTrainer{
    private String town;

    public PokemonGymOwner(String name, String town, List<Pokemon> Pokemons){
    super(name,Pokemons);

    this.town = town;

    }
    public String getTown() {
        return town;
    }
}
