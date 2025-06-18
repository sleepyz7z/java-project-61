package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    // Константы для настройки игры
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < rounds.length; i++) {
            int firstNumber = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int secondNumber = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);

            String question = firstNumber + " " + secondNumber;
            String answer = Integer.toString(gcd(firstNumber, secondNumber));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(RULE, rounds);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
