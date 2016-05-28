package hash;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Created by Юля on 21.04.2016.
 */
public class HashElement {

    private LinkedList list;

    public HashElement() {
        list = new LinkedList();
    }

    public void add(Object object) {
        list.add(object);
    }

    public boolean contains(Object object) {
        return list.contains(object);
    }

    public int size() {
        return list.size();
    }

    public Object[] getList() {
        return list.toArray();
    }

    public void remove(Object object) {
        if (!contains(object)) {
            throw new NoSuchElementException("No such element: " + "\"" + object.toString() + "\"" + " in the hashMap");
        } else list.remove(object);
    }
}
