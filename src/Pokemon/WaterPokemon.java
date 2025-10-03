package Pokemon;

public class WaterPokemon extends PokemonSuper{
    private int splashPower;
    private String specialAttack;

//    constructor
    public WaterPokemon(String name, int level, int splashPower, String specialAttack) {
        super(name, level);
        this.splashPower = splashPower;
        this.specialAttack = specialAttack;
    }

//    methods

    public void attack() {
        IO.println(this.name + " attacks for " + this.splashPower + " damage!");
    }

    public void specialAttack() {
        IO.println(this.name + " uses " + this.specialAttack + " and the opponent is defeated instantly");
    }

    public void splashPowerUp() {
        IO.println(this.name + " increases splash power from level " + this.splashPower + " to level " + (this.splashPower+=10));
    }


//    override-methods

    @Override
    public void speak() {
        super.speak();
        IO.println("-blub blub blub-");
    }

    @Override
    public void eat() {
        super.eat();
        IO.println("water toast");
    }

//    getters & setters

    public int getSplashPower() {
        return splashPower;
    }

    public void setSplashPower(int splashPower) {
        this.splashPower = splashPower;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

}
