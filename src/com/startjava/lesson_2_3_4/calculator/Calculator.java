package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int x;
    private char sign;
    private int y;

    public Calculator(String[] expression) {
        x = Integer.parseInt(expression[0]);
        sign = expression[1].charAt(0);
        y = Integer.parseInt(expression[2]);
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
