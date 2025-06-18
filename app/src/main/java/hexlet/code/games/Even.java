package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    // Константы для настройки игры
    private static final int MAX_NUMBER = 100;
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < rounds.length; i++) {
            int number = Utils.generateNumber(MAX_NUMBER);
            String question = Integer.toString(number);
            String answer = isEven(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(RULE, rounds);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
