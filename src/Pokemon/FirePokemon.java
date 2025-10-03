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
        IO.println(this.name + " gains increased flame power! New power level: " + (this.flamePower+=10));
    }

    public void levelUp() {
        IO.println(this.name + " levels up to level " + ++this.level + "!");
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
        IO.println("fire crackers");
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
