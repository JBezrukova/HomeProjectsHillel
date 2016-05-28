package homeTask7.animals;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class GuideDog extends Pet {

    private boolean isVaccinate = false;

    public GuideDog(String id, int weight, String color, String name, int age) {
        super(id, weight, color, name, age);

    }


    public void greet() {
        System.out.println("Hello, my name is " + super.getName() + ". I can take you home.");
    }

    public void guide() {
        System.out.println("I took you home.");
    }

    public void vaccinate() {
        isVaccinate = true;
    }

    public boolean isVaccinate() {
        return isVaccinate;
    }
}
