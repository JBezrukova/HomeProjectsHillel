package homeTask7.colors;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public abstract class Color {
    private String color;
    private double consumtion;

    public String getColor() {
        return color;
    }

    public double getConsumtion() {
        return consumtion;
    }

    public Color(String color, double consumtion) {
        this.color = color;
        this.consumtion = consumtion;
    }

    public String description() {
        return "Designation of the brush: " + getClass().getSimpleName() + ". Color: " + color + ", consumption of color per square meter: " + consumtion+". ";
    }
}
