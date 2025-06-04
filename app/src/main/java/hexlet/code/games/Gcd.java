package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    // Константы для настройки игры
    private static final int ROUNDS_COUNT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void play() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < rounds.length; i++) {
            int firstNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            int secondNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;

            String question = firstNumber + " " + secondNumber;
            String answer = Integer.toString(calculateGcd(firstNumber, secondNumber));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(rule, rounds);
    }

    private static int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
