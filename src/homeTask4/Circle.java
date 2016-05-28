package homeTask4;


/**
 * Created by Þëÿ on 24.02.2016.
 */
public class Circle {

    private int radius;

    public int getRadius() {

        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
