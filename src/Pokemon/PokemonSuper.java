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

    public void eat() {
        IO.print(getName() + " eats delicious ");
    }

    public void speak() {
        IO.print(getName() + " speaks: ");
    }

    public void sleep() {
        IO.println(getName() + " goes to sleep");
        IO.println("zzz...zzz...");
        IO.println(getName() + " has woken up");
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
