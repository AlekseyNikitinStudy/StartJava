public class Jaeger {
    private String modelName;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    private String origin;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int strength;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private int armor;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    private int kaijuKilled;

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor, int kaijuKilled) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.kaijuKilled = kaijuKilled;
    }

    public boolean drift(int speed) {
        if (this.speed < speed)
            return false;
        else
            return true;
    }

    public void move() {
        System.out.println(modelName + " двигается со скоростью " + speed);
    }

    String scanKaiju() {
        return modelName + " сканирует Kaiju";
    }

    void useVortexCannon() {
        System.out.println(modelName + " стреляет из пушки.");
    }
}
