package hash;

import homeTask6.ImprovedArray;
import homeTask9.NoSuchElementException;


/**
 * Created by Юля on 21.04.2016.
 */
public class Hash {

    private ImprovedArray array;
    private Object element;
    private HashElement hashElement;
    private int numberOfElements;

    public Hash() {
        array = new ImprovedArray();
    }

    public void add(Object object) {
        element = object;
        if (!contains(element)) {
            if (loadFactor()) {
                int index = countIndex(element.hashCode());
                if (array.getElement(index) == (null)) {
                    hashElement = new HashElement();
                    array.setElement(hashElement, index);
                    hashElement.add(element);
                    numberOfElements++;
                } else {
                    hashElement = (HashElement) array.getElement(index);
                    hashElement.add(element);
                    numberOfElements++;
                }
            } else {
                reload();
                add(element);
            }
        }
    }

    private void reload() {
        Object[] temp = new Object[numberOfElements];
        int tempIndex = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getElement(i) != (null)) {
                hashElement = (HashElement) array.getElement(i);
                Object[] hashElementList = hashElement.getList();
                for (int j = 0; j < hashElement.size(); j++) {
                    temp[tempIndex] = hashElementList[j];
                    tempIndex++;
                }
            }
        }
        array = new ImprovedArray();
        array.bigger();
        numberOfElements = 0;

        for (int i = 0; i < temp.length; i++) {
            add(temp[i]);
        }
    }

    private boolean loadFactor() {
        return numberOfElements < array.getArray().length * 0.75;
    }


    private int countIndex(int hashCode) {
        int index = Math.abs(hashCode) % array.getArray().length;
        return index;
    }

    public boolean contains(Object object) {
        this.element = object;
        int index = countIndex(element.hashCode());
        if (array.getElement(index) == (null)) {
            return false;
        } else {
            hashElement = (HashElement) array.getElement(index);
            return hashElement.contains(element);
        }
    }

    public void remove(Object object) {
        element = object;
        if (!contains(element)) {
            throw new NoSuchElementException("No such element: " + "\"" + object.toString() + "\"" + " in the hashMap");
        } else {
            int index = countIndex(element.hashCode());
            hashElement = (HashElement) array.getElement(index);
            hashElement.remove(element);
            numberOfElements--;
        }
    }

    @Override
    public int hashCode() {
        return element.hashCode();
    }
}
