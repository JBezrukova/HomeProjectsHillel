package homeTask4;

import java.util.Scanner;

/**
 * Created by Þëÿ on 28.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RectangleTask firstRectangleTask = new RectangleTask();
        Rectangle firstRectangle = new Rectangle();

        System.out.println("Enter area: ");
        firstRectangleTask.setArea(scanner.nextInt());
        System.out.println("Enter perimeter: ");
        firstRectangleTask.setPerimeter(scanner.nextInt());

        firstRectangle = firstRectangleTask.getSides();

        System.out.println("Sides of rectangle: ");
        System.out.println("a = " + firstRectangle.getA());
        System.out.println("b = " + firstRectangle.getB());


    }
}
