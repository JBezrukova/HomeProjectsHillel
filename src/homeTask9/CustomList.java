package homeTask9;

/**
 * Created by Юля on 25.03.2016.
 */
public class CustomList implements CustomCollections {

    private ListElement head;
    private ListElement tail;


    @Override
    public void add(Object object) {
        ListElement listElement = new ListElement(object);
        if (head == null) {
            listElement.next = head;
            head = listElement;
        } else {
            ListElement temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            tail = listElement;
            temp.next = tail;
        }
    }

    @Override
    public int size() {
        int count = 0;
        if (head == null) {
            return 0;
        }
        ListElement temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        count++;
        return count;
    }

    @Override
    public void setElement(Object object, int index) {
        ListElement temp = new ListElement();
        temp.value = object;
        if (index == 0) {
            temp.next = head;
            head = temp;
        } else {
            int count = 0;
            ListElement listElement = head;
            while (count != index - 1) {
                count++;
                listElement = listElement.next;
            }
            listElement.next = temp;
            listElement.next = listElement.next.next;
        }
    }

    @Override
    public String toString() {
        String result = "CustomList: ";
        for (int i = 0; i < size(); i++) {
            result = result + " " + getElement(i) + ";";
        }
        return result;
    }

    @Override
    public Object getElement(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("the list is empty");
        }
        if (index == 0) {
            return head.toString();
        } else {

        }
        try {
            int counter = 0;
            ListElement temp = head;
            while (!(counter == index)) {
                counter++;
                temp = temp.next;
            }
            return temp.toString();
        } catch (RuntimeException e) {
            throw new IndexOutOfBoundsException("The are no element with index " + index);
        }
    }


    @Override
    public boolean contains(Object object) {
        if (head == null) {
            return false;
        } else {
            ListElement temp = head;
            while (temp.next != null) {
                if (temp.value.equals(object)) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public void remove(Object object) {
        if (head == null) {
            return;
        }
        if (head.value.equals(object)) {
            if (!(head.next == null)) {
                head = head.next;
            } else {
                head = null;
            }
        } else {
            try {
                ListElement temp = head;
                while (temp != null) {
                    if (temp.next.value.equals(object)) {
                        temp.next = temp.next.next;
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
            } catch (RuntimeException e) {
                throw new NoSuchElementException("there no element in the list: " + object.toString());
            }
        }
    }

    @Override
    public int getIndex(Object object) {
        int counter = 0;
        ListElement temp = head;
        while (temp.next != null) {
            if (temp.value.equals(object)) {
                break;
            }
            counter++;
        }
        if (counter >= size()) {
            throw new NoSuchElementException("This element does not contain");
        }
        return counter;
    }
}
