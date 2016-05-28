package homeTask7.geometricFigures;

import HomeTask3.Main;
import homeTask7.colors.Color;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double countArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double countPerimeter() {
        double lenth = 2 * Math.PI * radius;
        return lenth;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }

    public void color(Color brush) {
        toBrush(brush);
        System.out.println("Figure " + this.getClass().getSimpleName() + " with parameters: " + this.radius + " has been bruched into " + brush.description()+" Consumtion of the color for figure: "+ Double.toString(consumptionOfColorForFigure()));
    }
}
