package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void play(String rule, String[][] rounds) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rule);

        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (!answer.equals(round[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + round[1] + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
