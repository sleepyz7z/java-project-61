package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int correctAnswers = 0;

        while (correctAnswers < 4) {                   // Цикл идет пока не будет выведено 4 вопроса
            int number = random.nextInt(50);    // Генерируем число до указанного значения
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = number % 2 == 0;           // проверяем четность
            String correctAnswer = isEven ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");


        scanner.close();
    }
}
