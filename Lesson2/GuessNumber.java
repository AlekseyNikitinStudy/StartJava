import java.util.Random;

public class GuessNumber {
    private int hiddenNumber;

    public GuessNumber() {
        Random random = new Random();
        this.hiddenNumber = random.nextInt(100);
    }

    public String makeHint (Player player) {
        if (player.getNumber() > hiddenNumber) {
            return "Загаданное число меньше, чем число " + player.getNumber() + " у игрока " + player.getName() + ".";
        } else if (player.getNumber() < hiddenNumber) {
            return "Загаданное число больше, чем число " + player.getNumber() + " у игрока " + player.getName() + ".";
        }
        return "Загаданное число совпадает с числом " + player.getNumber() + " у игрока " + player.getName() + ".";
    }

    public boolean checkNumber(int number) {
        return hiddenNumber == number;
    }
}
