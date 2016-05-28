package homeTask9;

import homeTask6.ImprovedArray;

import java.util.*;

/**
 * Created by Юля on 14.04.2016.
 */
public class MyHashSet {

    private ImprovedArray arrayExtends;

    public MyHashSet() {
        arrayExtends = new ImprovedArray();
    }

    public void add(Object object) {
        SetElement element = new SetElement(object);

        if (!contain(element)) {
            if (loadFactor()) {
                Object[] tempArray = new Object[arrayExtends.getNumberOfElements()];

                arrayExtends = new ImprovedArray();
                arrayExtends.bigger();

                for (int i = 0; i < tempArray.length; i++) {
                    int index = Math.abs(element.getKey() % arrayExtends.getArray().length);
                    arrayExtends.setElement(element, index);
                }
                add(element);
            } else {
                int index = Math.abs(element.getKey() % arrayExtends.getArray().length);
                arrayExtends.setElement(element, index);
                arrayExtends.setNumberOfElements(arrayExtends.getNumberOfElements() + 1);
            }
        }

    }

    private boolean contain(SetElement object) {
        if (arrayExtends.getNumberOfElements() != 0) {
            for (int i = 0; i < arrayExtends.getArray().length; i++) {
                if (arrayExtends.getElement(i) != null) {
                    try {
                        if (object.equals(arrayExtends.getElement(i))) {
                            return true;
                        }
                    } catch (Exception e) {

                    }
                }
            }
        }
        return false;
    }


    public boolean contain(Object object) {

        SetElement element = new SetElement(object);
        return contain(element);
    }

    private boolean loadFactor() {
        return arrayExtends.getNumberOfElements() > arrayExtends.getArray().length * 0.75;
    }

    public void remove(Object object) {
        SetElement element = new SetElement(object);
        int index = element.getKey() % arrayExtends.getArray().length;
        arrayExtends.remove(index);
    }

    public String toString() {
        String result = "Set: ";
        for (int i = 0; i < arrayExtends.getArray().length; i++) {
            if (arrayExtends.getElement(i) != null) {
                SetElement element = new SetElement(arrayExtends.getElement(i));
                result = result + " " + element.toString();
            }
        }
        return result;
    }


    public ImprovedArray getArrayExtends() {
        return arrayExtends;
    }
}
