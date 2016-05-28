package homeTask7.animals;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[9];


        zoo[1] = new Crocodile("12cc", 40, "green", 12);
        zoo[2] = new Dog("43dog", 8, "brown", "Barni", 3);
        zoo[3] = new Fish("34fi", 1, "grey", 1);
        zoo[4] = new Giraffe("G456G", 90, "yellow", 18);
        zoo[5] = new GuideDog("d908g", 6, "blsck", "Gektor", 2);
        zoo[6] = new Hamster("vrf", 1, "brown", "Petya", 1);
        zoo[7] = new Lion("LLK45", 100, "orange", 9);
        zoo[8] = new Wolf("lk09", 78, "grey", 7);

        for (Animal animal : zoo) {
            animal.greet();
        }


    }


}
