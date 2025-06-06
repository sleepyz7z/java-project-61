package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = scanner.nextLine();
        System.out.println();

        switch (choice) {
            case "1":     // Greet
                Cli.greet();
                break;
            case "2":     // Even
                Even.play();
                break;
            case "3":     // Calc
                Calc.play();
                break;
            case "4":     // GCD
                Gcd.play();
                break;
            case "5":     // Progression
                Progression.play();
                break;
            case "6":     // Prime
                Prime.play();
                break;
            case "0":     // Exit
                return;
            default:
                System.out.println("Error: Invalid choice \"" + choice + "\"" + ". Please enter a number from 0 to 6");
                break;
        }
    }
}
