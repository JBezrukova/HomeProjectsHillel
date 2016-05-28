package homeTask7.animals;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class Giraffe extends Wild implements PredatorAnimal {

    public Giraffe(String id, int weight, String color, int age) {
        super(id, weight, color, age);
    }

    public void greet() {
        System.out.println("Hello," + isWild() + " " + angry());
    }

    public String isWild() {
        return "I'm a wild animal.";
    }

    public boolean isPredatorAnimal() {
        return false;
    }

    public String angry() {
        if (isPredatorAnimal() == true) {
            return "I'm angry!";
        } else return " ";
    }
}

