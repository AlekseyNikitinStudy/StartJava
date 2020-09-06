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

    public double calculate() {
        switch (sign) {
            case '+':
                return x + y;
            case '*':
                return Math.multiplyExact(x, y);
            case '/':
                return (double) x / (double) y;
            case '^':
                return Math.pow(x, y);
            case '%':
                return x % y;
        }
        return 0;
    }
}
