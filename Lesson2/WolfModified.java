public class WolfModified {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорретный возраст");
        } else {
            this.age = age;
        }
    }

    void walk() {
        System.out.println(name + " гуляет.");
    }

    void sit() {
        System.out.println(name + " сидит.");
    }

    void run() {
        System.out.println(name + " бежит.");
    }

    void howl() {
        System.out.println(name + " воет.");
    }

    void hunt() {
        System.out.println(name + " охотится.");
    }
}
