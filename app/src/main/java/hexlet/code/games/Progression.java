package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void play() {
        String rule = "What number is missing in the progression?";
        String[][] rounds = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {                   // Цикл идет пока не будет выведено 3 вопроса
            int length = random.nextInt(6) + 5;  // Длина 5-10 чисел
            int start = random.nextInt(20) + 1;
            int step = random.nextInt(10) + 1;
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
