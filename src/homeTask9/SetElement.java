package homeTask9;

import java.util.List;

/**
 * Created by Юля on 16.04.2016.
 */
public class SetElement {

    private int key;
    private Object element;

    public SetElement(Object element) {
        this.element = element;
        key = hashCode();
    }

    public int getKey() {
        return key;
    }

    public Object getElement() {
        return element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SetElement)) return false;

        SetElement that = (SetElement) o;

        if (key != that.key) return false;
        return element != null ? element.equals(that.element) : that.element == null;

    }

    @Override
    public int hashCode() {
        int result = key;
        result = 31 * result + (element != null ? element.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return element + " ";
    }
}
