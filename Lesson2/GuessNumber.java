import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        Random random = new Random();
        this.hiddenNumber = random.nextInt(100);
    }

    public void mailLoop() {
        int number;
        Scanner scan = new Scanner(System.in);
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

            System.out.println(makeHint(playerCurrent));
        } while (!checkNumber(number));

        System.out.println("Игрок " + playerCurrent.getName() + " победил!");
    }

    public String makeHint (Player player) {
        if (player.getNumber() > hiddenNumber) {
            return "Загаданное число меньше, чем число " + player.getNumber() + " у игрока " + player.getName() + ".";
        } else if (player.getNumber() < hiddenNumber) {
            return "Загаданное число больше, чем число " + player.getNumber() + " у игрока " + player.getName() + ".";
        }
        return "Загаданное число совпадает с числом " + player.getNumber() + " у игрока " + player.getName() + ".";
    }

    public boolean checkNumber(int number) {
        return hiddenNumber == number;
    }
}
