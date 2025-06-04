package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    // Константы для настройки игры
    private static final int ROUNDS_COUNT = 3;
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_START_VALUE = 1;
    private static final int MAX_START_VALUE = 20;
    private static final int MIN_STEP_VALUE = 1;
    private static final int MAX_STEP_VALUE = 10;

    public static void play() {
        String rule = "What number is missing in the progression?";
        String[][] rounds = new String[ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < rounds.length; i++) {
            int length = random.nextInt(MAX_PROGRESSION_LENGTH - MIN_PROGRESSION_LENGTH + 1) + MIN_PROGRESSION_LENGTH;
            int start = random.nextInt(MAX_START_VALUE - MIN_START_VALUE + 1) + MIN_START_VALUE;
            int step = random.nextInt(MAX_STEP_VALUE - MIN_STEP_VALUE + 1) + MIN_STEP_VALUE;
            int hiddenIndex = random.nextInt(length);

            String[] progression = generateProgression(start, step, length);
            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(rule, rounds);
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + i * step);
        }
        return progression;
    }
}
