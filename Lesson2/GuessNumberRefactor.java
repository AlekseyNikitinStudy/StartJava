import java.util.Random;
import java.util.Scanner;

public class GuessNumberRefactor {
    private int hiddenNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumberRefactor(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        generateHiddenNumber();
        Player currentPlayer = playerOne;
        boolean isGuess = false;
        while (!isGuess) {
            inputNumber(currentPlayer);
            isGuess = compareNumber(currentPlayer);
            if (!isGuess) {
                hint(currentPlayer);
                currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            }
        }

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
        return hiddenNumber == player.getNumber();
    }

    private void hint(Player player) {
        System.out.println(player.getNumber() > hiddenNumber ? "Загаданное число меньше."
                : "Загаданное число больше.");
    }
}
