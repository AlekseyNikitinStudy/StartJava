package com.startjava.lesson_2_3_4.game;

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
        } while (!makeMove(currentPlayer));

        showNumbers(playerOne);
        showNumbers(playerTwo);
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

    private boolean makeMove(Player player) {
        if (player.isAttemptsOver()) {
            System.out.println("\nУ " + player.getName() + " закончились попытки.");
            return true;
        }
        return compareNumber(player);
    }

    private boolean compareNumber(Player player) {
        if (player.getNumber() != hiddenNumber) {
            System.out.println("Загаданное число " + (player.getNumber() > hiddenNumber ? "меньше." : "больше."));
            return false;
        } else {
            System.out.println("\nИгрок " + player.getName() + " угадал число " + player.getNumber() + " с " + player.getAttempt() + " попытки");
            return true;
        }
    }

    public void showNumbers(Player player) {
        System.out.print("\nЧисла игрока " + player.getName() + ": ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }
}
