import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.next());

        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.next());

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

        String answer;
        do {
            guessNumber.startGame();
            do {
                System.out.print("Хотите продолжить? [да]/[нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (!answer.equals("нет"));
    }
}
