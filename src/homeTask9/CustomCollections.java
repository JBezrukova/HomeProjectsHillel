package homeTask9;

/**
 * Created by Юля on 25.03.2016.
 */
public interface CustomCollections {

    void add(Object object);

    int size();

    void setElement(Object object, int index);

    Object getElement(int index);

    boolean equals(Object another);

    String toString();

    boolean contains(Object object);

    void remove(Object object);

    int getIndex(Object object);
}
