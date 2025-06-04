package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    // Константы для настройки игры
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void play() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < rounds.length; i++) {
            int number = random.nextInt(MAX_NUMBER);
            String question = Integer.toString(number);
            String answer = isEven(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(rule, rounds);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
