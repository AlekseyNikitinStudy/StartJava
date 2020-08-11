public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 10;
        char operation = '^';

        if (operation == '+') {
            int sum = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        } else if (operation == '-') {
            int sub = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + sub);
        } else if (operation == '*') {
            int multiply = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        } else if (operation == '/') {
            float divide = (float) firstNumber / (float) secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
        } else if (operation == '^') {
            int power = 1;
            for (int i = 0; i < secondNumber; i++) {
                power = power * firstNumber;
            }
            System.out.println(firstNumber + " ^ " + secondNumber + " = " + power);
        } else if (operation == '%') {
            int remainder= firstNumber % secondNumber;
            System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);
        }
    }
}
