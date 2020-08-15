public class WolfModified {
    private String name;
    private String gender;
    private float height;
    private float weight;
    private int age;

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

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорретный возраст");
        } else {
            this.age = age;
        }
    }
}
