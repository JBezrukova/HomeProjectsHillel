package comparator.comparators;

import java.util.Comparator;

/**
 * Created by Þëÿ on 20.03.2016.
 */
public class CompareInDescebdingOrder implements Comparator {
    Comparator comparator;

    public CompareInDescebdingOrder(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return comparator.compare(o1, o2) * (-1);
    }
}
