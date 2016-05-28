package comparator.sorts;

import homeTask9.ImprovedArrayExtends;

import java.util.Comparator;

/**
 * Created by ��� on 17.03.2016.
 */
public class InsertionSort implements Sorter {

    private Comparator comparator;

    @Override
    public Comparator getComparator() {
        return comparator;
    }

    public InsertionSort(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(Object[] array) {
        Object newElement;
        int location;
        for (int i = 2; i < array.length; i++) {
            newElement = array[i];
            location = i - 1;

            while ((location >= 1) && (comparator.compare(array[location], newElement) > 0)) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;
        }
    }

    @Override
    public void sort(ImprovedArrayExtends improoved) {
        Object newElement;
        int location;
        for (int i = 2; i < improoved.size() - 1; i++) {
            newElement = improoved.getElement(i);
            location = i - 1;

            while ((location >= 1) && (comparator.compare(improoved.getElement(location), newElement) > 0)) {
                improoved.setElement(improoved.getElement(location), location + 1);
                location--;
            }
            improoved.setElement(newElement, location + 1);
        }
    }


    @Override
    public void sort(int[] array) {
        int newElement;
        int location;
        for (int i = 2; i < array.length; i++) {
            newElement = array[i];
            location = i - 1;

            while ((location >= 1) && (comparator.compare(array[location], newElement) > 0)) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newElement;
        }
    }
}

