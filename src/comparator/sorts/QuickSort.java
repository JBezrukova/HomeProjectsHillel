package comparator.sorts;

import homeTask9.ImprovedArrayExtends;

import java.util.Comparator;

/**
 * Created by ��� on 17.03.2016.
 */
public class QuickSort implements Sorter {

    private Comparator comparator;

    @Override
    public Comparator getComparator() {
        return comparator;
    }

    public QuickSort(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(ImprovedArrayExtends arrayExtendses) {
        sorting(arrayExtendses, 0, arrayExtendses.size() - 1);
    }

    @Override
    public void sort(Object[] array) {
        sorting(array, 0, array.length - 1);
    }

    @Override
    public void sort(int[] array) {
        sorting(array, 0, array.length - 1);
    }

    private void sorting(Object[] array, int first, int last) {
        if (first < last) {
            int pivot = pivotList(array, first, last);
            sorting(array, first, pivot - 1);
            sorting(array, pivot + 1, last);
        }
    }

    private int pivotList(Object[] array, int first, int last) {
        int pivotPoint = first;
        Object temp;
        Object x = array[first];
        for (int index = first + 1; index <= last; index++) {
            if (comparator.compare(array[index], x) < 0) {
                pivotPoint++;
                temp = array[pivotPoint];
                array[pivotPoint] = array[index];
                array[index] = temp;
            }
        }
        temp = array[first];
        array[first] = array[pivotPoint];
        array[pivotPoint] = temp;
        return pivotPoint;
    }

    private void sorting(int[] array, int first, int last) {
        if (first < last) {
            int pivot = pivotList(array, first, last);
            sorting(array, first, pivot - 1);
            sorting(array, pivot + 1, last);
        }
    }

    private int pivotList(int[] array, int first, int last) {
        int pivotPoint = first;
        int temp;
        int x = array[first];
        for (int index = first + 1; index <= last; index++) {
            if (comparator.compare(array[index], x) < 0) {
                pivotPoint++;
                temp = array[pivotPoint];
                array[pivotPoint] = array[index];
                array[index] = temp;
            }
        }
        temp = array[first];
        array[first] = array[pivotPoint];
        array[pivotPoint] = temp;
        return pivotPoint;
    }

    private void sorting(ImprovedArrayExtends array, int first, int last) {
        if (first < last) {
            int pivot = pivotList(array, first, array.size());
            sorting(array, first, pivot - 1);
            sorting(array, pivot + 1, last);
        }
    }

    private int pivotList(ImprovedArrayExtends array, int first, int last) {
        int pivotPoint = first;
        Object temp;
        Object x = array.getElement(first);
        for (int index = first + 1; index <= last; index++) {
            if (comparator.compare(array.getElement(index), x) < 0) {
                pivotPoint++;

                temp = array.getElement(pivotPoint);
                array.setElement(array.getElement(index), pivotPoint);
                array.setElement(temp, index);
            }
        }
        temp = array.getElement(first);
        array.setElement(array.getElement(pivotPoint), first);
        array.setElement(temp, pivotPoint);
        return pivotPoint;
    }
}
