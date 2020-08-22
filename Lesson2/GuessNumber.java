import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private void generateHiddenNumber() {
        Random random = new Random();
        this.hiddenNumber = random.nextInt(100);
    }

    public void startGame() {
        generateHiddenNumber();
        Player playerCurrent = playerTwo;
        do {
            playerCurrent = playerCurrent == playerOne ? playerTwo : playerOne;
            scanNumber(playerCurrent);
        } while (!compareNumber(playerCurrent));

        System.out.println("Игрок " + playerCurrent.getName() + " победил!");
    }

    private void scanNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumber(Player player) {
        if (player.getNumber() > hiddenNumber) {
            System.out.println("Загаданное число меньше, чем число " + player.getNumber() + " у игрока " + player.getName() + ".");
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println("Загаданное число больше, чем число " + player.getNumber() + " у игрока " + player.getName() + ".");
        } else {
            System.out.println("Загаданное число совпадает с числом " + player.getNumber() + " у игрока " + player.getName() + ".");
        }
        return hiddenNumber == player.getNumber();
    }
}
