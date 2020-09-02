package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPTS = 10;

    private String name;
    private int[] numbers;
    private int currentIndex;

    public Player(String name) {
        this.name = name;
        numbers = new int[MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getCurrentNumber() {
        return numbers[currentIndex - 1];
    }

    public void setCurrentNumber(int number) {
        this.numbers[currentIndex] = number;
        currentIndex++;
    }

    public void startGame() {
        Arrays.fill(numbers, 0, currentIndex, 0);
        currentIndex = 0;
    }

    public boolean isAttemptsOver() {
        return currentIndex == MAX_ATTEMPTS;
    }

    public void showNumbers() {
        System.out.print("\nЧисла игрока " + name + ": ");
        int[] filledNumbers = Arrays.copyOf(numbers, currentIndex);

        for (int filledNumber : filledNumbers) {
            System.out.print(filledNumber + " ");
        }
    }

    public void showResult(boolean isVictory) {
        if (isVictory) {
            System.out.println("\nИгрок " + name + " угадал число " + numbers[currentIndex - 1] + " с " + currentIndex + " попытки");
        } else {
            System.out.println("\nУ " + name + " закончились попытки.");
        }
    }
}
