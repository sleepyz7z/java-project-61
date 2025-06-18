package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    // Константы для настройки игры
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int FIRST_PRIME_NUMBER = 2;
    private static final int DIVISOR_STEP = 2;
    private static final int ODD_NUMBER_FROM_THREE = 3;

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < rounds.length; i++) {
            int number = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            String question = Integer.toString(number);
            String answer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(RULE, rounds);
    }

    private static boolean isPrime(int number) {
        if (number < FIRST_PRIME_NUMBER) {
            return false;
        }
        if (number == FIRST_PRIME_NUMBER) {
            return true;
        }
        if (number % FIRST_PRIME_NUMBER == 0) {
            return false;
        }
        for (int i = ODD_NUMBER_FROM_THREE; i * i <= number; i += DIVISOR_STEP) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
