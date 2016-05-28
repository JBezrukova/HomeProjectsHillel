package homeTask4;


/**
 * Created by Þëÿ on 24.02.2016.
 */
public class Triangle {
    private int a;
    private int b;
    private int c;

    public int getA() {

        return a;
    }

    public int getB() {

        return b;
    }

    public int getC() {

        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int calculatePerimeter() {
        int perimeter = a + b + c;
        return perimeter;
    }

}
