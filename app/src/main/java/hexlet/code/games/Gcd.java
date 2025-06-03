package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    public static void play() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {                   // Цикл идет пока не будет выведено 3 вопроса
            int a = random.nextInt(100) + 1;        // Генерируем число до указанного значения
            int b = random.nextInt(100) + 1;        // Генерируем число до указанного значения

            String question = a + " " + b;
            String answer = Integer.toString(findGcd(a, b));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(rule, rounds);
    }

    private static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
