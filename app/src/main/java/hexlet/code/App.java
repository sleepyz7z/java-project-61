package hexlet.code;

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
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int gameID = scanner.nextInt();

        switch (gameID) {
            case 1:
                Cli.getUser();
                break;
            case 2:
                Even.playEven();
                break;
            case 3:
                Calc.playCalc();
                break;
            case 4:
                GCD.playGCD();
                break;
            case 5:
                Progression.playProgression();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
