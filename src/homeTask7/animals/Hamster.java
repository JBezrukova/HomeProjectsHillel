package homeTask7.animals;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class Hamster extends Pet {

    private boolean isVaccinate = false;

    public Hamster(String id, int weight, String color, String name, int age) {
        super(id, weight, color, name, age);

    }


    public void greet() {
        System.out.println("Hello, my name is " + super.getName());
    }

    public void vaccinate() {
        isVaccinate = true;
    }

    public boolean isVaccinate() {
        return isVaccinate;
    }

}


