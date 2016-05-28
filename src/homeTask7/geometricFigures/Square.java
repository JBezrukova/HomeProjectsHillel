package homeTask7.geometricFigures;


import homeTask7.colors.Color;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class Square extends Figure {

    private double height;

    public Square(double height) {
        this.height = height;
    }

    public int getNumberOfSides() {
        return 4;
    }

    public double countArea() {
        double area = Math.pow(height, 2);
        return area;
    }

    public double countPerimeter() {
        double perimeter = height * 4;
        return perimeter;
    }

    public void color(Color brush) {
        toBrush(brush);
        System.out.println("Figure " + this.getClass().getSimpleName() + " with parameters: " + this.height + " has been bruched into " + brush.description()+" Consumtion of the color for figure: "+ Double.toString(consumptionOfColorForFigure()));
    }

}
