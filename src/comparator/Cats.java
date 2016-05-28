package comparator;

/**
 * Created by Þëÿ on 26.02.2016.
 */
public class Cats implements Comparable{
    private String color;
    private String name;
    private int birthYear;
    private String[] vaccines = new String[10];
    private int numberOfVaccines;

    public Cats(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    public void meow() {
        System.out.println("meow!");
    }

    public void vaccinate(String vaccine) {
        vaccines[numberOfVaccines] = vaccine;
        numberOfVaccines++;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Cats another = (Cats) o;
        if (birthYear > another.birthYear){
            return -1;
        }
        else {
            if (birthYear == another.birthYear){
                return 0;
            }
            return 1;
        }
    }

    public String toString() {

        return "name: " +name + " ,color: " + color + " birthYear: " + birthYear;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cats cat = (Cats) o;

        if (birthYear != cat.birthYear) return false;
        if (!color.equals(cat.color)) return false;
        return name.equals(cat.name);

    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + birthYear;
        return result;
    }
}