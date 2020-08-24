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

    public void startGame() {
        generateHiddenNumber();
        Player currentPlayer = playerTwo;
        do {
            currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            inputNumber(currentPlayer);
        } while (!compareNumber(currentPlayer));

        System.out.println("Игрок " + currentPlayer.getName() + " победил!");
    }

    private void generateHiddenNumber() {
        Random random = new Random();
        hiddenNumber = random.nextInt(101);
    }

    private void inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumber(Player player) {
        System.out.println(player.getNumber() > hiddenNumber ? "Загаданное число меньше."
                : player.getNumber() < hiddenNumber ? "Загаданное число больше."
                : "Число угадано!");
        return hiddenNumber == player.getNumber();
    }
}
