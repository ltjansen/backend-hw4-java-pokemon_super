package Pokemon;

public class GrassPokemon extends PokemonSuper {
    private int greenPower;
    private String specialAttack;


//    constructor
    public GrassPokemon(String name, int level, int greenPower, String specialAttack) {
        super(name, level);
        this.greenPower = greenPower;
        this.specialAttack = specialAttack;
}

//    methods
    public void attack() {
        IO.println(this.name + " attacks for " + this.greenPower + " damage!");
}

    public void specialAttack() {
        IO.println(this.name + " uses " + this.specialAttack + " and the opponent is defeated instantly");
    }

    public void greenPowerUp() {
        IO.println(this.name + " increases green power from level " + this.greenPower + " to level " + (this.greenPower+=10));
    }

//    override-methods

    @Override
    public void speak() {
        super.speak();
        IO.println("-insulting you by spitting grass-");
    }

    @Override
    public void eat() {
        super.eat();
        IO.println("clover");
    }

//    getters & setters

    public int getGreenPower() {
        return greenPower;
    }

    public void setGreenPower(int greenPower) {
        this.greenPower = GrassPokemon.this.greenPower;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

}
