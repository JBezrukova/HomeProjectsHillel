package comparator.comparators;

import java.util.Comparator;

/**
 * Created by Þëÿ on 22.03.2016.
 */
public class StringComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (((String)o1).compareTo((String)o2));
    }
}
