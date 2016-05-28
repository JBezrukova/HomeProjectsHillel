package comparator.comparators;

import java.util.Comparator;

/**
 * Created by Þëÿ on 22.03.2016.
 */
public class IntegerComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Integer) o1).compareTo((Integer) o2);
    }
}

