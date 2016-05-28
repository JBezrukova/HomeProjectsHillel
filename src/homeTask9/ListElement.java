package homeTask9;

/**
 * Created by Юля on 25.03.2016.
 */
public class ListElement {
    ListElement next;
    Object value;

    public ListElement(Object value) {
        this.value = value;
    }

    public ListElement() {
    }

    public String toString() {
        return value.toString();
    }

}
