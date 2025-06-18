package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    // Константы для настройки игры
    private static final int MAX_OPERAND_VALUE = 50;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String RULE = "What is the result of the expression?";
    private static final String UNKNOWN_OPERATOR_MSG = "Unknown operator: ";

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < rounds.length; i++) {
            int firstOperand = Utils.generateNumber(MAX_OPERAND_VALUE);
            int secondOperand = Utils.generateNumber(MAX_OPERAND_VALUE);
            char operator = OPERATORS[Utils.generateNumber(OPERATORS.length - 1)];

            String question = firstOperand + " " + operator + " " + secondOperand;
            String answer = calculate(firstOperand, secondOperand, operator);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(RULE, rounds);
    }

    private static String calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return Integer.toString(a + b);
            case '-':
                return Integer.toString(a - b);
            case '*':
                return Integer.toString(a * b);
            default:
                throw new RuntimeException(UNKNOWN_OPERATOR_MSG + operator);
        }
    }
}
