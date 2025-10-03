package Pokemon;

public class FirePokemon extends PokemonSuper {
    private int flamePower;
    private boolean attackReady;


//    constructor

    public FirePokemon(String name, int level, int flamePower, boolean attackReady) {
        super(name, level);
        this.flamePower = flamePower;
        this.attackReady = attackReady;
    }

//    methods

    public void attack() {
        IO.println(this.name + " attacks for " + this.flamePower + " damage!");
    }

    public void flamePowerUp() {
        IO.println(this.name + " increases flame power from level " + this.flamePower + " to level " + (this.flamePower+=10));
    }


//    override-methods from super

    @Override
    public void speak() {
        super.speak();
        IO.println("-unintelligible noise-");
    }

    @Override
    public void eat() {
        super.eat();
        IO.println("fire cracker");
    }

//    getters & setters

    public int getFlamePower() {
        return flamePower;
    }

    public void setFlamePower(int flamePower) {
        this.flamePower = flamePower;
    }

    public boolean getAttack() {
        return attackReady;
    }

    public void setAttack(boolean attackReady) {
        this.attackReady = attackReady;
    }

}
