package com.startjava.lesson_2_3_4.calculator;


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
        double result;

        switch (sign) {
            case '+':
                result = x + y;
                break;
            case '*':
                result = Math.multiplyExact(x, y);
                break;
            case '/':
                result = (double) x / (double) y;
                break;
            case '^':
                result = Math.pow(x, y);
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
