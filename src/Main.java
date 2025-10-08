import Pokemon.*;

import java.util.Scanner;

void main() {

    FirePokemon firePokemon = new FirePokemon("Charizard", 1, 10, true);
    WaterPokemon waterPokemon = new WaterPokemon("Blastoise", 1, 10, "Downpour");
    GrassPokemon grassPokemon = new GrassPokemon("Venusaur", 1, 10, "Lawnmower");
    ElectricPokemon electricPokemon = new ElectricPokemon("Pikachu", 1, 10, 100);


//    menu (uitzetten bij experimenteren met losse opdrachten)
    Scanner scanner = new Scanner(System.in);
    IO.println("Choose your Pokemon:");
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
                        firePokemon.levelUp();
                        }
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
                    IO.println(firePokemon.getName() + " is confused");
            }
            break;
        case 2:
            IO.println("You have chosen Blastoise! Select an action:");
            IO.println("  1 - Attack");
            IO.println("  2 - Special attack");
            IO.println("  3 - Increase power");
            IO.println("  4 - Eat");
            IO.println("  5 - Speak");
            IO.println("  6 - Sleep");
            int choice2 = scanner.nextInt();
            switch (choice2) {
                case 1:
                    waterPokemon.attack();
                    waterPokemon.levelUp();
                    break;
                case 2:
                    waterPokemon.specialAttack();
                    waterPokemon.levelUp();
                    break;
                case 3:
                    waterPokemon.splashPowerUp();
                    break;
                case 4:
                    waterPokemon.eat();
                    waterPokemon.levelUp();
                    break;
                case 5:
                    waterPokemon.speak();
                    break;
                case 6:
                    waterPokemon.sleep();
                    break;
                default:
                    IO.println(waterPokemon.getName() + " is confused");
            }
            break;
        case 3:
            IO.println("You have chosen Venusaur! Select an action:");
            IO.println("  1 - Attack");
            IO.println("  2 - Special attack");
            IO.println("  3 - Increase power");
            IO.println("  4 - Eat");
            IO.println("  5 - Speak");
            IO.println("  6 - Sleep");
            int choice3 = scanner.nextInt();
            switch (choice3) {
                case 1:
                    grassPokemon.attack();
                    grassPokemon.levelUp();
                    break;
                case 2:
                    grassPokemon.specialAttack();
                    grassPokemon.levelUp();
                    break;
                case 3:
                    grassPokemon.greenPowerUp();
                    break;
                case 4:
                    grassPokemon.eat();
                    grassPokemon.levelUp();
                    break;
                case 5:
                    grassPokemon.speak();
                    break;
                case 6:
                    grassPokemon.sleep();
                    break;
                default:
                    IO.println(grassPokemon.getName() + " is confused");
            }
        break;
        case 4:
            IO.println("You have chosen Pikachu! Select an action:");
            IO.println("  1 - Attack");
            IO.println("  2 - Increase defence");
            IO.println("  3 - Increase power");
            IO.println("  4 - Eat");
            IO.println("  5 - Speak");
            IO.println("  6 - Sleep");
            int choice4 = scanner.nextInt();
            switch (choice4) {
                case 1:
                    electricPokemon.attack();
                    electricPokemon.levelUp();
                    break;
                case 2:
                    electricPokemon.defenceLevelUp();
                    break;
                case 3:
                    electricPokemon.lightningPowerUp();
                    break;
                case 4:
                    electricPokemon.eat();
                    break;
                case 5:
                    electricPokemon.speak();
                    break;
                case 6:
                    electricPokemon.sleep();
                    break;
                default:
                    IO.println(electricPokemon.getName() + " is confused");
            }
        break;
        default:
            IO.println("error 153 - Pokemon not found");
    }

    IO.println("");
    IO.println("Thank you for playing!");

}
