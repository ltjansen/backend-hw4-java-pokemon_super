import Pokemon.FirePokemon;
import Pokemon.PokemonSuper;

import java.util.Scanner;

void main() {

    FirePokemon firePokemon = new FirePokemon("Charizard", 1, 10, true);
//    WaterPokemon waterPokemon = new WaterPokemon
//    GrassPokemon grassPokemon = new GrassPokemon
//    ElectricPokemon electricPokemon = new ElectricPokemon

    Scanner scanner = new Scanner(System.in);
    IO.println("Please choose your Pokemon:");
    IO.println("  1 - Charizard     (fire)");
    IO.println("  2 - Blastoise     (water)");
    IO.println("  3 - Venusaur      (grass)");
    IO.println("  4 - Pikachu       (electricity)");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            IO.println("You have chosen Charizard! Select an action:");
            IO.println("  1 - Attack");
            IO.println("  2 - Increase power");
            IO.println("  3 - Eat");
            IO.println("  4 - Speak");
            IO.println("  5 - Sleep");
            int choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    if (firePokemon.getAttack() == true) {
                        firePokemon.attack();
                        firePokemon.levelUp(); }
                    else {
                        IO.println(firePokemon.getName() + " is not ready to attack"); }
                    break;
                case 2:
                    firePokemon.flamePowerUp();
                    break;
                case 3:
                    firePokemon.eat();
                    firePokemon.levelUp();
                    break;
                case 4:
                    firePokemon.speak();
                    break;
                case 5:
                    firePokemon.sleep();
                    break;
                default:
                    IO.println("Invalid choice, better luck next time");
            }

//      default:

    }


//    IO.println("");
//    IO.println("Thank you for playing");

}
