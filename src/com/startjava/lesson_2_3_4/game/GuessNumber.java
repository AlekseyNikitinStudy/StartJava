package com.startjava.lesson_2_3_4.game;

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
        System.out.println("У вас " + Player.MAX_ATTEMPTS + " попыток.");

        generateHiddenNumber();
        playerOne.startGame();
        playerTwo.startGame();
        Player currentPlayer = null;

        do {
            currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            inputNumber(currentPlayer);
            showHint(currentPlayer);
        } while ((!compareNumber(currentPlayer))&&(!currentPlayer.isAttemptsOver()));

        playerOne.showNumbers();
        playerTwo.showNumbers();
        currentPlayer.showResult(compareNumber(currentPlayer));
    }

    private void generateHiddenNumber() {
        Random random = new Random();
        hiddenNumber = random.nextInt(101);
    }

    private void inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + ", введите число: ");
        player.setCurrentNumber(scan.nextInt());
    }

    private void showHint(Player player) {
        if (!compareNumber(player)) {
            System.out.println(player.getCurrentNumber() > hiddenNumber ? "Загаданное число меньше."
                    : "Загаданное число больше.");
        }
    }

    private boolean compareNumber(Player player) {
        return hiddenNumber == player.getCurrentNumber();
    }
}
