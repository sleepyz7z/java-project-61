package hexlet.code;

import java.util.Random;

public final class Utils {
    private static final Random RANDOM = new Random();

    public static int generateNumber(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    public static int generateNumber(int max) {
        return generateNumber(0, max);
    }
}
