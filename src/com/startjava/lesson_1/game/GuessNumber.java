package com.startjava.lesson_1.game;

public class GuessNumber {
    public static void main(String[] args) {
        int hiddenNumber = 34;
        int playerNumber = 50;
        System.out.println("Try to guess the number.");
        do {
            System.out.println("Player number is " + playerNumber);
            if (playerNumber > hiddenNumber) {
                System.out.println("The number is less than player number " + playerNumber);
                playerNumber--;
            } else if (playerNumber < hiddenNumber) {
                System.out.println("The number is more than player number " + playerNumber);
                playerNumber++;
            }
        } while (playerNumber != hiddenNumber);
        System.out.print("The number is equals player number! The number is " + hiddenNumber);
    }
}
