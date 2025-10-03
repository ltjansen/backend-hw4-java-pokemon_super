package Pokemon;

public class ElectricPokemon extends PokemonSuper{
    private int lightningPower;
    private int defenceLevel;


//    constructor
public ElectricPokemon(String name, int level, int lightningPower, int defenceLevel) {
    super(name, level);
    this.lightningPower = lightningPower;
    this.defenceLevel = defenceLevel;
}

//    methods
public void attack() {
    IO.println(this.name + " attacks for " + this.lightningPower + " damage!");
}

    public void lightningPowerUp() {
        IO.println(this.name + " increases lightning power from level " + this.lightningPower + " to level " + (this.lightningPower+=10));
    }

    public void defenceLevelUp () {
        IO.println(this.name + " increases defence from level " + this.defenceLevel + " to level " + (this.defenceLevel+=50));
    }

//    override-methods

    @Override
    public void speak() {
        super.speak();
        IO.println("Pika pika!");
    }

    @Override
    public void eat() {
//        super.eat();
        IO.println(this.name + " is not hungry");
    }

//    getters & setters

    public int getLigtningPower() {
        return lightningPower;
    }

    public void setLigtningPower(int lightningPower) {
        this.lightningPower = lightningPower;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

}
