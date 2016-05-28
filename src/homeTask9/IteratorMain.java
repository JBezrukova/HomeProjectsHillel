package homeTask9;

import homeTask9.ImprovedArrayExtends;
import homeTask9.ImprovedArrayIterator;

import java.util.Iterator;

/**
 * Created by Юля on 14.04.2016.
 */
public class IteratorMain {
    public static void main(String[] args) {

        ImprovedArrayExtends arrayExtends = new ImprovedArrayExtends();
        ImprovedArrayIterator iterator = new ImprovedArrayIterator(arrayExtends);

        arrayExtends.add("car");
        arrayExtends.add("cat");
        arrayExtends.add("flower");

        iterate(arrayExtends);

        iterate(arrayExtends);

        System.out.println(arrayExtends.toString());

    }

    public static void iterate (Iterable iterable){
        Iterator iterator = iterable.iterator();
        iterate(iterator);
    }

    public static void iterate(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
