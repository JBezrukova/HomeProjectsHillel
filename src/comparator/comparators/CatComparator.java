package comparator.comparators;

import comparator.Cats;

import java.util.Comparator;

/**
 * Created by Þëÿ on 22.03.2016.
 */
public class CatComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cats cat1 = (Cats) o1;
        Cats cat2 = (Cats) o2;
        int result = cat1.getBirthYear() - cat2.getBirthYear();
        return result;
    }
}
