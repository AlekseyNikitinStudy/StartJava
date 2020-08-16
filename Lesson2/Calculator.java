public class Calculator {
    private int x;
    private int y;
    private char sign;

    public Calculator(int x, int y, char sign) {
        this.x = x;
        this.y = y;
        this.sign = sign;
    }

    public void calculateAndOut() {
        int resultInt;
        float resultFloat;

        switch (sign) {
            case ('+'):
                resultInt = x + y;
                System.out.println(x + " + " + y + " = " + resultInt);
                break;
            case ('*'):
                resultInt = x * y;
                System.out.println(x + " * " + y + " = " + resultInt);
                break;
            case ('/'):
                resultFloat = (float) x / (float) y;
                System.out.println(x + " / " + y + " = " + resultFloat);
                break;
            case ('^'):
                resultInt = 1;
                for (int i = 0; i < y; i++) {
                    resultInt *= x;
                }
                System.out.println(x + " ^ " + y + " = " + resultInt);
                break;
            case ('%'):
                resultInt = x % y;
                System.out.println(x + " % " + y + " = " + resultInt);
                break;
            default:
                System.out.println("Недопустимый знак.");
        }
    }
}
