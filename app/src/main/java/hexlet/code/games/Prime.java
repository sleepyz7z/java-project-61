package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void play() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {                       // Цикл идет пока не будет выведено 3 вопроса
            int number = random.nextInt(100) + 1;      //Генерируем число до указанного значения
            String question = Integer.toString(number);
            String answer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(rule, rounds);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
