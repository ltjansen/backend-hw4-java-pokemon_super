package Pokemon;

public abstract class PokemonSuper {
    String name;
    int level;


//    constructor

    public PokemonSuper(String name, int level) {
        this.name = name;
        this.level = level;
    }

//    methods

    public void speak() {
        IO.print(getName() + " is saying something: ");
    }

    public void eat() {
        IO.print(getName() + " eats a delicious ");
    }

    public void sleep() {
        IO.println(getName() + " goes to sleep");
        IO.println("zzz...zzz...");
        IO.println(getName() + " has woken up");
    }

    public void levelUp() {
        IO.println(getName() + " levels up to level " + (getLevel() + 1) + "!");
    }

//    getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
