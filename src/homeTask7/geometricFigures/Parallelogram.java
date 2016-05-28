package homeTask7.geometricFigures;

import homeTask7.colors.Color;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class Parallelogram extends Figure {
    private double a;
    private double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public int getNumberOfSides() {
        return 4;
    }

    public double countArea() {
        double area = a * b;
        return area;
    }

    public double countPerimeter() {
        double perimeter = 2 * (a + b);
        return perimeter;
    }

    public void color(Color brush) {
        toBrush(brush);
        System.out.println("Figure " + this.getClass().getSimpleName() + " with parameters: " + this.a + ", " + this.b + " has been bruched into " + brush.description()+" Consumtion of the color for figure: "+ Double.toString(consumptionOfColorForFigure()));
    }
}
