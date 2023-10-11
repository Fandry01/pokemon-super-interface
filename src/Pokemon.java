public abstract class Pokemon {
private final String type;
private final String name;
private final int level;
private int hp;
private final String food;
private final String sound;

public Pokemon(String type,String name,int level, int hp,String food,String sound){
    this.name = name;
    this.type = type;
    this.level = level;
    this.hp = hp;
    this.food = food;
    this.sound = sound;
}

    public int getHp() {
        return hp;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public int getLevel() {
        return level;
    }

}
