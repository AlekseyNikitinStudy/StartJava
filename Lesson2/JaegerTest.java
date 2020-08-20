public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1980f, 7, 8, 6, 9);
        Jaeger jaegerTwo = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2312f, 5, 7, 4,  2);

        System.out.println(jaegerOne.getModelName() + "[" + jaegerOne.getMark() + "] from " + jaegerOne.getOrigin() + " убил " + jaegerOne.getKaijuKilled() + " кайдзю.");
        System.out.println("Рост: " + jaegerOne.getHeight() + ", вес: " + jaegerOne.getWeight() + ", сила: " + jaegerOne.getStrength());
        jaegerOne.move();
        System.out.println(jaegerOne.scanKaiju());
        jaegerOne.useVortexCannon();
        jaegerOne.setKaijuKilled(jaegerOne.getKaijuKilled() + 1);
        System.out.println(jaegerOne.getModelName() + " убил " + jaegerOne.getKaijuKilled() + " кайдзю.");

        System.out.println("\n" + jaegerTwo.getModelName() + "[" + jaegerTwo.getMark() + "] from " + jaegerTwo.getOrigin() + " убил " + jaegerTwo.getKaijuKilled() + " кайдзю.");
        System.out.println("Рост: " + jaegerTwo.getHeight() + ", вес: " + jaegerTwo.getWeight() + ", сила: " + jaegerTwo.getStrength());
        jaegerTwo.move();
        System.out.println(jaegerTwo.scanKaiju());
        jaegerTwo.useVortexCannon();
    }
}
