package comparator.sorts;

import homeTask9.ImprovedArrayExtends;

import java.util.Comparator;

/**
 * Created by ��� on 20.03.2016.
 */
public interface Sorter {
    Comparator getComparator();

    void sort(Object[] array);

    void sort(int[] array);

    void sort(ImprovedArrayExtends arrayr);
}
