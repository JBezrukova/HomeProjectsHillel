package comparator.sorts;

import homeTask9.ImprovedArrayExtends;

import java.util.Comparator;

/**
 * Created by ��� on 20.03.2016.
 */
public class MergeSort implements Sorter {

    private Comparator comparator;


    public Comparator getComparator() {
        return comparator;
    }

    public MergeSort(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(Object[] array) {
        mergeSorting(array, 0, array.length - 1);
    }

    @Override
    public void sort(ImprovedArrayExtends arrayExtendses) {
        mergeSorting(arrayExtendses, 0, arrayExtendses.size() - 1);
    }


    @Override
    public void sort(int[] array) {
        mergeSorting(array, 0, array.length - 1);
    }

    private void mergeSorting(Object[] array, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSorting(array, first, middle);
            mergeSorting(array, middle + 1, last);
            mergeList(array, first, middle, middle + 1, last);
        }
    }

    private void mergeList(Object[] array, int startFirst, int endFirst, int startSecond, int endSecond) {
        int finalStart = startFirst;
        int finalEnd = endSecond;
        int indexOfResult = 0;
        Object[] result = new Object[array.length];
        while ((startFirst <= endFirst) && (startSecond <= endSecond)) {
            if (comparator.compare(array[startFirst], array[startSecond]) < 0) {
                result[indexOfResult] = array[startFirst];
                startFirst++;
            } else {
                result[indexOfResult] = array[startSecond];
                startSecond++;
            }
            indexOfResult++;
        }
        if (startFirst <= endFirst) {
            for (int i = startFirst; i <= endFirst; i++) {
                result[indexOfResult] = array[i];
                indexOfResult++;
            }
        } else {
            for (int i = startSecond; i <= endSecond; i++) {
                result[indexOfResult] = array[i];
                indexOfResult++;
            }
        }
        indexOfResult = 0;
        for (int i = finalStart; i <= finalEnd; i++) {
            array[i] = result[indexOfResult];
            indexOfResult++;
        }
    }

    private void mergeSorting(int[] array, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSorting(array, first, middle);
            mergeSorting(array, middle + 1, last);
            mergeList(array, first, middle, middle + 1, last);
        }
    }

    private void mergeList(int[] array, int startFirst, int endFirst, int startSecond, int endSecond) {
        int finalStart = startFirst;
        int finalEnd = endSecond;
        int indexOfResult = 0;
        int[] result = new int[array.length];
        while ((startFirst <= endFirst) && (startSecond <= endSecond)) {
            if (comparator.compare(array[startFirst], array[startSecond]) < 0) {
                result[indexOfResult] = array[startFirst];
                startFirst++;
            } else {
                result[indexOfResult] = array[startSecond];
                startSecond++;
            }
            indexOfResult++;
        }
        if (startFirst <= endFirst) {
            for (int i = startFirst; i <= endFirst; i++) {
                result[indexOfResult] = array[i];
                indexOfResult++;
            }
        } else {
            for (int i = startSecond; i <= endSecond; i++) {
                result[indexOfResult] = array[i];
                indexOfResult++;
            }
        }
        indexOfResult = 0;
        for (int i = finalStart; i <= finalEnd; i++) {
            array[i] = result[indexOfResult];
            indexOfResult++;
        }


    }

    private void mergeSorting(ImprovedArrayExtends array, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSorting(array, first, middle);
            mergeSorting(array, middle + 1, last);
            mergeList(array, first, middle, middle + 1, array.size());
        }
    }

    private void mergeList(ImprovedArrayExtends array, int startFirst, int endFirst, int startSecond, int endSecond) {
        int finalStart = startFirst;
        int finalEnd = endSecond;
        int indexOfResult = 0;
        ImprovedArrayExtends result = new ImprovedArrayExtends();
        while ((startFirst <= endFirst) && (startSecond <= endSecond)) {
            if (comparator.compare(array.getElement(startFirst), array.getElement(startSecond)) < 0) {
                result.setElement(array.getElement(startFirst), indexOfResult);
                startFirst++;
            } else {
                result.setElement(array.getElement(startSecond), indexOfResult);
                startSecond++;
            }
            indexOfResult++;
        }
        if (startFirst <= endFirst) {
            for (int i = startFirst; i <= endFirst; i++) {
                result.setElement(array.getElement(i), indexOfResult);
                indexOfResult++;
            }
        } else {
            for (int i = startSecond; i <= endSecond; i++) {
                result.setElement(array.getElement(i), indexOfResult);
                indexOfResult++;
            }
        }
        indexOfResult = 0;
        for (int i = finalStart; i <= finalEnd; i++) {
            array.setElement(result.getElement(indexOfResult), i);
            indexOfResult++;
        }
    }


}


