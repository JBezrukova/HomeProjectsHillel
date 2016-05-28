package homeTask9.counter;


import homeTask9.CustomList;
import homeTask9.counter.Counter;
import homeTask9.counter.CounterOfSum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by ��� on 24.03.2016.
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<Float> floatList = new LinkedList<>();
        floatList.add(11.3f);
        floatList.add(2.0f);
        floatList.add(6.7f);

        CounterOfSum counterOfSum = new CounterOfSum();

        System.out.println("FloatList: " + floatList.toString());
        System.out.println("Sum of the elements: " + counterOfSum.sum(floatList));


        LinkedList<Double> linkedList = new LinkedList();
        ArrayList<Double> arrayList = new ArrayList();
        TreeSet<Double> treeSet = new TreeSet();

        Counter counter = new Counter();

        fillingInTheCollection(linkedList);
        fillingInTheCollection(arrayList);
        fillingInTheCollection(treeSet);

        // productivity(linkedList, arrayList, treeSet, counter);

        CustomList customList = new CustomList();
        customList.add("cat");
        customList.add("dog");
        System.out.println(customList.getElement(1));
        System.out.println(customList.size());
        System.out.println(customList.toString());
    }

    private static void productivity(LinkedList<Double> linkedList, ArrayList<Double> arrayList, TreeSet<Double> treeSet, Counter counter) {
        System.out.println("Push to the end productivity: ");
        System.out.println("Linked List: " + counter.pushToTheEnd(linkedList, 200.0));
        System.out.println("Array List: " + counter.pushToTheEnd(arrayList, 200.0));
        System.out.println("Push to Begin productivity: ");
        System.out.println("Linked List: " + counter.pushToTheBegin(linkedList, 200.0));
        System.out.println("Array List: " + counter.pushToTheBegin(arrayList, 200.0));
        System.out.println("Push to set productivity: " + counter.pushToSet(treeSet, 200.0));
        System.out.println("Search by element productivity");
        System.out.println("Linked List: " + counter.search(linkedList, 200.0));
        System.out.println("Array List: " + counter.search(arrayList, 200.0));
        System.out.println("Tree set: " + counter.search(treeSet, 200.0));
        System.out.println("Search by index productivity: ");
        System.out.println("Linked list: " + counter.searchByIndex(linkedList, 48562));
        System.out.println("Array List: " + counter.searchByIndex(arrayList, 48562));
        System.out.println("Remove element productivity: ");
        System.out.println("Linked List: " + counter.remove(linkedList, 568.0));
        System.out.println("Array List: " + counter.remove(arrayList, 568.0));
        System.out.println("Tree set: " + counter.remove(treeSet, 568.0));
        System.out.println("Remove from the begin productivity: ");
        System.out.println("Linked List: " + counter.removeFromBgin(linkedList));
        System.out.println("Array List: " + counter.removeFromBgin(arrayList));
        System.out.println("Remove from the end productivity: ");
        System.out.println("Linked List: " + counter.removeFromEnd(linkedList));
        System.out.println("Array List: " + counter.removeFromEnd(arrayList));
        System.out.println("Remove from the middle productivity: ");
        System.out.println("Linked List: " + counter.removeFromMiddle(linkedList));
        System.out.println("Array List: " + counter.removeFromMiddle(arrayList));

        CustomList customList = new CustomList();
        customList.add("cat");
        customList.add("dog");
        customList.add("fish");
        customList.toString();
    }

    public static void fillingInTheCollection(Collection<Double> collection) {
        for (int i = 0; i < 500000; i++) {
            collection.add(Math.random() * 1000);
        }
        collection.add(568.0);
    }

}
