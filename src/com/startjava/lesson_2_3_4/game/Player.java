package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int attempt;

    public Player(String name) {
        this.name = name;
        numbers = new int[GuessNumber.MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getAttempt() {
        return attempt;
    }

    public int getCurrentNumber() {
        return numbers[attempt - 1];
    }

    public void setCurrentNumber(int number) {
        numbers[attempt] = number;
        attempt++;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public boolean isAttemptsOver() {
        return attempt == GuessNumber.MAX_ATTEMPTS;
    }
}
