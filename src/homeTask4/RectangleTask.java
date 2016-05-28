package homeTask4;

/**
 * Created by Þëÿ on 24.02.2016.
 */
public class RectangleTask {
    private int area;
    private int perimeter;

    public void setArea(int area) {

        this.area = area;
    }

    public void setPerimeter(int perimeter) {

        this.perimeter = perimeter;
    }

    public int getArea() {

        return area;
    }

    public int getPerimeter() {

        return perimeter;
    }

    public Rectangle getSides() {
        Rectangle rectangle = new Rectangle();

        int halfOfPerimeter = perimeter / 2;

        int d = (int) Math.pow(halfOfPerimeter, 2) - 4 * area;

        if (d > 0) {
            if ((halfOfPerimeter + Math.sqrt(d)) / 2 > 0) {
                rectangle.setB((int) (halfOfPerimeter + Math.sqrt(d)) / 2);
            } else {
                rectangle.setB((int) ((halfOfPerimeter - Math.sqrt(d)) / 2));
            }
        } else if (d == 0) {
            rectangle.setB(halfOfPerimeter / 2);
        }
        rectangle.setA(halfOfPerimeter - rectangle.getB());

        return rectangle;

    }

}
