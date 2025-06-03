package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void play() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {                   // Цикл идет пока не будет выведено 3 вопроса
            int number = random.nextInt(100);       // Генерируем число до указанного значения
            String question = Integer.toString(number);
            String answer = number % 2 == 0 ? "yes" : "no";
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(rule, rounds);
    }
}
