public class GuessTheNumber {
    public static void main(String[] args) {
        int number = 34;
        int playerNumber = 50;
        System.out.println("Try to guess the number.");
        do {
            System.out.println("Player number is " + playerNumber);
            if (playerNumber > number) {
                System.out.println("The number is less than player number " + playerNumber);
                playerNumber = playerNumber - 1;
            } else if (playerNumber < number) {
                System.out.println("The number is more than player number " + playerNumber);
                playerNumber = playerNumber + 1;
            }
        } while (playerNumber != number);
        System.out.print("The number is equals player number! The number is " + number);
    }
}
