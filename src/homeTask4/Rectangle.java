package homeTask4;


/**
 * Created by Þëÿ on 24.02.2016.
 */
public class Rectangle {
    private int a;
    private int b;

    public int getA() {

        return a;
    }

    public int getB() {

        return b;
    }

    public void setA(int a) {

        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int calculateArea() {
        int area = a * b;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = 2 * (a + b);
        return perimeter;
    }


}

