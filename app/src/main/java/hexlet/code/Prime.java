package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void playPrime() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < 3) {                   // Цикл идет пока не будет выведено 3 вопроса
            int number = random.nextInt(50);    // Генерируем число до указанного значения
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            String correctAnswer = isPrime(number) ? "yes" : "no";

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
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i < number; i += 2) { // Упрощенная проверка (до n вместо √n)
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
