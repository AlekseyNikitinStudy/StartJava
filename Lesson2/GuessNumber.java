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
        Player currentPlayer = null;
        /* Игровой цикл:
         1. Определяем текущего игрока.
         2. Принимает ввод номера от него.
         3. Показываем подсказку
         4. Принимаем решение продолжении в зависимости угадано число или нет. */
        do {
            /* При первой итерации цикла currentPlayer = playerOne (благодаря инициализации currentPlayer = null выше).*/
            currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            /* Ввод номер от текущего игрока. */
            inputNumber(currentPlayer);
            /* Показываем подсказку - больше, меньше или победа. */
            showHint(currentPlayer);
        /* Сравниваем на равенство с загаданным числом и принимаем решение продолжать или нет цикл. */
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

    private void showHint(Player player) {
        if (!compareNumber(player)) {
            System.out.println(player.getNumber() > hiddenNumber ? "Загаданное число меньше."
                : "Загаданное число больше.");
        }    
    }

    private boolean compareNumber(Player player) {
        return hiddenNumber == player.getNumber();
    }
}
