package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void playCalc() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;

        while (correctAnswers < 3) {                   // Цикл идет пока не будет выведено 3 вопроса
            int number1 = random.nextInt(20);    // Генерируем число до указанного значения
            int number2 = random.nextInt(20);
            String operator = random.nextBoolean() ? "+" : random.nextBoolean() ? "-" : "*";

            String expression = number1 + " " + operator + " " + number2;
            System.out.println("Question: " + expression);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            String correctAnswer = calculate(number1, number2, operator);

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

    //метод который считает на основе оператора
    private static String calculate(int number1, int number2, String operator) {
        if (operator.equals("+")) {
            return Integer.toString(number1 + number2);
        }
        if (operator.equals("-")) {
            return Integer.toString(number1 - number2);
        }
        return Integer.toString(number1 * number2);
    }
}
