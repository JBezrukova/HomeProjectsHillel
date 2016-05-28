package homeTask7.animals;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public abstract class Animal {
    private final String id;
    private int age;
    private int weight;
    private final String color;

    public Animal(String id, int weight, String color, int age) {
        this.id = id;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public abstract void greet();
}
