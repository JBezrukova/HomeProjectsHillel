package comparator;

import comparator.comparators.CompareINAscendingOrder;
import comparator.comparators.CompareInDescebdingOrder;
import comparator.comparators.StringComparator;
import comparator.sorts.InsertionSort;
import comparator.sorts.MergeSort;
import comparator.sorts.QuickSort;
import homeTask9.ImprovedArrayExtends;


import java.util.Arrays;


/**
 * Created by ��� on 17.03.2016.
 */
public class sortMain {

    public static void main(String[] args) {

        int[] arrayFirst = {1, 6, 5, 4, 2, 8, 7, 3, 9};

        InsertionSort insertionSort = new InsertionSort(new CompareINAscendingOrder());


        insertionSort.sort(arrayFirst);
        System.out.println(Arrays.toString(arrayFirst));

        Object[] arraySecond = {21, 15, 2, 4, 87, 56, 23};
        QuickSort quickSort = new QuickSort(new CompareINAscendingOrder());
        quickSort.sort(arraySecond);
        System.out.println(Arrays.toString(arraySecond));

        MergeSort mergeSort = new MergeSort(new CompareInDescebdingOrder(new CompareINAscendingOrder()));
        int[] arrayThird = {8, 3, 1, 54, 21};
        mergeSort.sort(arrayThird);
        System.out.println(Arrays.toString(arrayThird));

        ImprovedArrayExtends first = new ImprovedArrayExtends();
        MergeSort mergeSort1 = new MergeSort(new StringComparator());
        first.add("Ann");
        first.add("Igor");
        first.add("Alex");
        first.add("Fil");
        first.add("Sam");
        mergeSort1.sort(first);
        System.out.println(first.toString());
        System.out.println(first.containsIfArrayIsSorted("Kate", new StringComparator()));
    }
}
