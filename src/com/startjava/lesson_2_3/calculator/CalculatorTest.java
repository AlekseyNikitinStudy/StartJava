package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int x = scan.nextInt();

            System.out.print("Введите знак математической операции: ");
            char sign = scan.next().charAt(0);

            System.out.print("Введите второе число: ");
            int y = scan.nextInt();

            Calculator calculator = new Calculator(x, sign, y);
            System.out.println(calculator.calculate());

            do {
                System.out.print("Хотите продолжить? [да]/[нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (!answer.equals("нет"));
    }
}
