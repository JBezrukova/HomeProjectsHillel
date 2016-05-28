package homeTask9.counter;

import java.util.LinkedList;
import java.util.regex.Matcher;

/**
 * Created by ��� on 25.03.2016.
 */
public class CounterOfSum {

    public Float sum(LinkedList<Float> list) {
        int sumInt = 0;
        Float sumFloat = 0F;
        float frac = 0f;
        for (float element : list) {
            frac = element % 1;
            sumFloat = sumFloat + frac;
            sumInt = sumInt + (int) (element - frac);
        }
        return sumFloat + sumInt;
    }

}
