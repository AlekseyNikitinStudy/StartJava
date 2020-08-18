public class Calculator {
    private int x;
    private int y;
    private char sign;

    public Calculator(int x, int y, char sign) {
        this.x = x;
        this.y = y;
        this.sign = sign;
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
