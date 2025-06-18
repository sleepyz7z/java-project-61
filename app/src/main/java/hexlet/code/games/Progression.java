package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    // Константы для настройки игры
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 20;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final String RULE = "What number is missing in the progression?";

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < rounds.length; i++) {
            int length = Utils.generateNumber(MIN_LENGTH, MAX_LENGTH);
            int start = Utils.generateNumber(MIN_START, MAX_START);
            int step = Utils.generateNumber(MIN_STEP, MAX_STEP);
            int hiddenIndex = Utils.generateNumber(length - 1);

            String[] progression = generateProgression(start, step, length);
            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(RULE, rounds);
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + i * step);
        }
        return progression;
    }
}
