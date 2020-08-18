import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите имя первого игрока: ");
            String name = scan.next();
            Player playerOne = new Player(name);

            System.out.print("Введите имя второго игрока: ");
            name = scan.next();
            Player playerTwo = new Player(name);

            GuessNumber guessNumber = new GuessNumber();

            int number;
            Player playerCurrent = playerTwo;
            do {
                if (playerCurrent == playerOne) {
                    playerCurrent = playerTwo;
                } else {
                    playerCurrent = playerOne;
                }
                System.out.print("Игрок " + playerCurrent.getName() + ", введите число: ");
                number = scan.nextInt();
                playerCurrent.setNumber(number);

                System.out.println(guessNumber.makeHint(playerCurrent));
            } while (!guessNumber.checkNumber(number));

            System.out.println("Игрок " + playerCurrent.getName() + " победил!");

            do {
                System.out.print("Хотите продолжить? [да]/[нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (!answer.equals("нет"));
    }
}
