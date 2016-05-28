package homeTask7.geometricFigures;

import homeTask7.colors.Color;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public int getNumberOfSides() {
        return 4;
    }

    public double countArea() {
        double area = height * width;
        return area;
    }

    public double countPerimeter() {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

    public void color(Color brush) {
        toBrush(brush);
        System.out.println("Figure " + this.getClass().getSimpleName() + " with parameters: " + this.height + ", " + this.width + " has been bruched into " + brush.description()+" Consumtion of the color for figure: "+ Double.toString(consumptionOfColorForFigure()));
    }
}
