package homeTask7.geometricFigures;

import homeTask7.colors.Candy;
import homeTask7.colors.Color;
import homeTask7.colors.Sky;
import homeTask7.colors.Sunny;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public class MainFigures {
    public static void main(String[] args) {
        Figure circle = new Circle(4);
        Figure rectangle = new Rectangle(3, 2);
        Figure square = new Square(3);
        Figure triangle = new Triangle(3, 2, 4);
        Figure parallelogram = new Parallelogram(3, 4);

        Color first = new Sky("Blue", 3.5);
        Color second = new Candy("Pink", 2);
        Color third = new Sunny("Yellow", 4.2);

        circle.color(first);
        rectangle.color(third);
        square.color(second);
        triangle.color(first);
        parallelogram.color(second);
        System.out.println(circle.color().getColor());
        System.out.println(rectangle.consumptionOfColorForFigure());
    }
}
