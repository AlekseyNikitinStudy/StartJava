public class WolfModifiedTest {
    public static void main(String[] args) {
        WolfModified wolfOne = new WolfModified();
        wolfOne.setName("Star");
        wolfOne.setAge(5);
        wolfOne.setGender("female");
        wolfOne.setHeight(36.8f);
        wolfOne.setWeight(24.3f);
        System.out.println("name = " + wolfOne.getName());
        System.out.println("gender = " + wolfOne.getGender());
        System.out.println("height = " + wolfOne.getHeight());
        System.out.println("weight = " + wolfOne.getWeight());
        System.out.println("age = " + wolfOne.getAge());
    }
}
