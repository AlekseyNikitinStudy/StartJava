package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] numbers;
    private int currentIndex;
    public static final int MAX_ATTEMPTS = 10;

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
        if (currentIndex < MAX_ATTEMPTS) {
            this.numbers[currentIndex] = number;
            currentIndex++;
        }
    }
    public void startGame() {
        currentIndex = 0;
    }

    public boolean isAttemptsOver() {
        return currentIndex == MAX_ATTEMPTS;
    }
    public void showNumbers() {
        System.out.print("\nЧисла игрока " + name + ": ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(numbers[i] + " ");
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
