package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int x;
    private char sign;
    private int y;

    public Calculator(int x, char sign, int y) {
        this.x = x;
        this.sign = sign;
        this.y = y;
    }

    public String calculate() {
        float result;

        switch (sign) {
            case '+':
                result = x + y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = (float) x / (float) y;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < y; i++) {
                    result *= x;
                }
                break;
            case '%':
                result = x % y;
                break;
            default:
                return "Недопустимый знак.";
        }
        return String.valueOf(result);
    }
}
