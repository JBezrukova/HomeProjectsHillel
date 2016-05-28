package homeTask9;

import homeTask9.ImprovedArrayExtends;

import java.util.Iterator;

/**
 * Created by Юля on 14.04.2016.
 */
public class ImprovedArrayIterator implements Iterator {
    private ImprovedArrayExtends arrayExtends;
    private int index;

    public ImprovedArrayIterator(ImprovedArrayExtends arrayExtends) {
        this.arrayExtends = arrayExtends;
    }

    @Override
    public boolean hasNext() {
        return (index < arrayExtends.getNumberOfElements());
    }

    @Override
    public Object next() {
        return arrayExtends.getElement(index++);
    }

    @Override
    public void remove() {
        if (index >= arrayExtends.getNumberOfElements()) {
            throw new IndexOutOfBoundsException("The element with index " + index + " does not consist");
        } else {
            arrayExtends.remove(index);
        }
    }
}
