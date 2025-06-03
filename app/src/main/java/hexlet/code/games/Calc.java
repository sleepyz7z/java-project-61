package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void play() {
        String rule = "What is the result of the expression?";
        String[][] rounds = new String[3][2];
        Random random = new Random();
        char[] operators = {'+', '-', '*'};

        for (int i = 0; i < 3; i++) {           // Цикл идет пока не будет выведено 3 вопроса
            int a = random.nextInt(50);        // Генерируем число до указанного значения
            int b = random.nextInt(50);        // Генерируем число до указанного значения
            char operator = operators[random.nextInt(3)];

            String question = a + " " + operator + " " + b;
            String answer = calculate(a, b, operator);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(rule, rounds);
    }

    private static String calculate(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> Integer.toString(a + b);
            case '-' -> Integer.toString(a - b);
            case '*' -> Integer.toString(a * b);
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}

