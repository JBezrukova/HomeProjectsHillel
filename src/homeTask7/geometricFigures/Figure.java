package homeTask7.geometricFigures;

import homeTask7.colors.Color;

/**
 * Created by Þëÿ on 13.03.2016.
 */
public abstract class Figure {

    private Color brush;


    public double consumptionOfColorForFigure(){
        double consumption = countArea()*this.brush.getConsumtion();
        return consumption;
    }

    public void toBrush(Color brush) {
        this.brush = brush;

    }

    public abstract double countArea();

    public abstract double countPerimeter();

    public abstract void color(Color brush);

    public  Color color(){
        return this.brush;
    }
}
