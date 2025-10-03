package Pokemon;

public class PokemonSuper {
    String name;
    int level;


//    constructor

    public PokemonSuper(String name, int level) {
        this.name = name;
        this.level = level;
    }

//    methods

    public void eat() {
        IO.print("The Pokemon eats: ");
    }

    public void speak() {
        IO.print("The Pokemon speaks: ");
    }

    public void sleep() {
        IO.println("The Pokemon goes to sleep");
        IO.println("...");
        IO.println("The Pokemon has woken up");
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
