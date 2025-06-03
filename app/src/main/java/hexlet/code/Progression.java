package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void playProgression() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What number is missing in the progression?");
        int correctAnswers = 0;

        while (correctAnswers < 3) {                   // Цикл идет пока не будет выведено 3 вопроса
            int start = random.nextInt(20) + 1;
            int step = random.nextInt(5) + 1;
            int hiddenPos = random.nextInt(10);
            int answer = 0;

            StringBuilder question = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                if (i == hiddenPos) {
                    question.append(".. ");
                    answer = start + i * step;
                } else {
                    question.append(start + i * step).append(" ");
                }
            }

            System.out.println("Question: " + question.toString().trim());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(Integer.toString(answer))) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");

        scanner.close();
    }
}

