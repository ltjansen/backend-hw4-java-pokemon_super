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
        IO.println("FirePokemon attacks");
    }

    public void flamePowerUp() {
        IO.println("FirePokemon increases flame power");
//        niet zeker of dit gaat werken met de ++
        IO.println("New flame power: " + this.flamePower++);
    }

//    override-methods from super

    @Override
    public void speak() {
        super.speak();
        IO.println("- hissing fire-");
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
