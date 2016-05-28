package homeTask7.geometricFigures;

import homeTask7.colors.Color;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getNumberOfSides() {
        return 4;
    }

    public double countArea() {
        double perimeter = countPerimeter();
        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    public double countPerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    public void color(Color brush) {
        toBrush(brush);
        System.out.println("Figure " + this.getClass().getSimpleName() + " with parameters: " + this.a + ", " + this.b + ", " + this.c + " has been bruched into " + brush.description()+" Consumtion of the color for figure: "+ Double.toString(consumptionOfColorForFigure()));
    }
}
