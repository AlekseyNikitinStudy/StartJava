package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        char operation = '^';
        int result;

        if (operation == '+') {
            result = x + y;
            System.out.println(x + " + " + y + " = " + result);
        } else if (operation == '-') {
            result = x - y;
            System.out.println(x + " - " + y + " = " + result);
        } else if (operation == '*') {
            result = x * y;
            System.out.println(x + " * " + y + " = " + result);
        } else if (operation == '/') {
            float resultF = (float) x / (float) y;
            System.out.println(x + " / " + y + " = " + resultF);
        } else if (operation == '^') {
            result = 1;
            for (int i = 0; i < y; i++) {
                result *= x;
            }
            System.out.println(x + " ^ " + y + " = " + result);
        } else if (operation == '%') {
            result = x % y;
            System.out.println(x + " % " + y + " = " + result);
        }
    }
}
