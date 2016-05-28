package comparator.comparators;

import java.util.Comparator;

/**
 * Created by Þëÿ on 20.03.2016.
 */
public class CompareINAscendingOrder implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int first = (int) o1;
        int second = (int) o2;
        return first - second;
    }
}
