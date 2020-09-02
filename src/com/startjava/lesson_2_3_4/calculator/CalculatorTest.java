package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите математическое выражение: ");
            String[] expression = scan.nextLine().split(" ");

            Calculator calculator = new Calculator(Integer.parseInt(expression[0]), expression[1].charAt(0),
                    Integer.parseInt(expression[2]));
            System.out.println(calculator.calculate());

            do {
                System.out.print("Хотите продолжить? [да]/[нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (!answer.equals("нет"));
    }
}
