package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_ATTEMPTS = 10;

    private int hiddenNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        System.out.println("У вас " + MAX_ATTEMPTS + " попыток.");

        generateHiddenNumber();
        playerOne.clearNumbers();
        playerTwo.clearNumbers();
        Player currentPlayer = null;

        do {
            currentPlayer = currentPlayer == playerOne ? playerTwo : playerOne;
            inputNumber(currentPlayer);
            showHint(currentPlayer);
        } while (!compareNumber(currentPlayer)&&!currentPlayer.isAttemptsOver());

        showNumbers(playerOne);
        showNumbers(playerTwo);
        showResult(currentPlayer);
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
            System.out.println("Загаданное число " + (player.getCurrentNumber() > hiddenNumber ? "меньше."
                    : "больше."));
        }
    }

    public void showNumbers(Player player) {
        System.out.print("\nЧисла игрока " + player.getName() + ": ");
        int[] numbers = Arrays.copyOf(player.getNumbers(), player.getAttempt());

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public void showResult(Player player) {
        if (compareNumber(player)) {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getCurrentNumber() + " с " + player.getAttempt() + " попытки");
        } else {
            System.out.println("\nУ " + player.getName() + " закончились попытки.");
        }
    }

    private boolean compareNumber(Player player) {
        return hiddenNumber == player.getCurrentNumber();
    }

}
