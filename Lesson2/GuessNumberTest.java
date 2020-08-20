import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name = scan.next();
        Player playerOne = new Player(name);

        System.out.print("Введите имя второго игрока: ");
        name = scan.next();
        Player playerTwo = new Player(name);

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

        String answer;
        do {
            guessNumber.mailLoop();
            do {
                System.out.print("Хотите продолжить? [да]/[нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (!answer.equals("нет"));
    }
}
