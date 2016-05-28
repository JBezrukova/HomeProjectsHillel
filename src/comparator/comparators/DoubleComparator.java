package comparator.comparators;

import java.util.Comparator;

/**
 * Created by Þëÿ on 22.03.2016.
 */
public class DoubleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Double) o1).compareTo((Double) o2);
    }
}