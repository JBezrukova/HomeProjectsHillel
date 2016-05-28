package homeTask9;


import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by ��� on 13.03.2016.
 */
public class ImprovedArrayExtends implements CustomCollections, Iterable {

    private Object[] array = new Object[10];
    private int numberOfElements;


    public void add(Object addingObject) {
        if (numberOfElements == array.length) {
            makeBiggerArray();
        }
        array[numberOfElements] = addingObject;
        numberOfElements++;

    }

    @Override

    public void setElement(Object object , int index){
        array[index] = object;
    }

    private void makeBiggerArray() {
        Object[] array = new Object[this.array.length * 2];
        int i = 0;
        for (Object element : this.array) {
            array[i] = element;
            i++;
        }
        this.array = array;
    }

    public int size() {
        return numberOfElements;
    }


    public Object getElement(int index) {
        if (index >= numberOfElements) {
            throw new IndexOutOfBoundsException("the elemnt with index " + index + " does not contain");
        }
        return array[index];
    }

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof ImprovedArrayExtends)) {
            return false;
        }
        ImprovedArrayExtends anotherArray = (ImprovedArrayExtends) another;

        if (numberOfElements != anotherArray.numberOfElements) {
            return false;
        } else {
            for (int i = 0; i < numberOfElements; i++) {
                if (!array[i].equals(anotherArray.array[i])) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public String toString() {
        String result = "Array: ";
        for (int i = 0; i < numberOfElements; i++) {
            if (array[i] != null)
                result = result + " " + array[i];
        }
        return result;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < numberOfElements; i++) {
            if (array[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (index >= numberOfElements) {
            throw new IndexOutOfBoundsException("the element with index " + index + " does not contain");
        } else {
            numberOfElements = numberOfElements - 1;
            for (int i = index; i < array.length-1; i++) {
                array[i] = array[i + 1];
            }
        }

    }

    public void remove(Object obj) {

        int i = getIndex(obj);
        remove(i);
    }

    public int getIndex(Object obj) {
        int i = 0;
        while (i < numberOfElements) {
            if (array[i].equals(obj)) {
                break;
            } else {
                i++;
            }
        }
        if (i == numberOfElements){

            throw new NoSuchElementException("This element does not contain in the array");
        }
        return i;
    }

    public boolean containsIfArrayIsSorted(Object object, Comparator comparator) {
        int left = 0;
        int right = numberOfElements;
        int middle;
        while (left < right) {
            middle = (left + right) / 2;
            if (comparator.compare(array[middle], object) < 0) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        if (comparator.compare(array[right], object) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new ImprovedArrayIterator(this);
    }
}



