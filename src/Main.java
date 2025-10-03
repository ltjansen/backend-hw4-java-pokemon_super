import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);
    IO.println("Welkom!");
    IO.println("Geef je naam in: ");
    String username = scanner.nextLine();
    IO.println("Geregistreerde naam: " + username);

}
