package homeTask7.animals;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public abstract class Wild extends Animal implements PredatorAnimal {


    public Wild(String id, int weight, String color, int age) {
        super(id, weight, color, age);
    }

    public abstract String isWild();


}
