package homeTask7.animals;


/**
 * Created by Þëÿ on 13.03.2016.
 */
public abstract class Pet extends Animal {

    private String name;

    public Pet(String id, int weight, String color, String name, int age) {
        super(id, weight, color, age);
        this.name = name;

    }

    public abstract void vaccinate();

    public String getName() {
        return name;
    }
}
