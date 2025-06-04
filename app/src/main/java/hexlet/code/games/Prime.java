package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    // Константы для настройки игры
    private static final int ROUNDS_COUNT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    // Константы для проверки простых чисел
    private static final int FIRST_PRIME_NUMBER = 2;
    private static final int DIVISOR_STEP = 2; // Проверяем только нечётные делители

    public static void play() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] rounds = new String[ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < rounds.length; i++) {
            int number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            String question = Integer.toString(number);
            String answer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(rule, rounds);
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
        for (int i = ROUNDS_COUNT; i * i <= number; i += DIVISOR_STEP) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
