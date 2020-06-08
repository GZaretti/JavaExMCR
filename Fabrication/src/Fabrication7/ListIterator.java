package Fabrication7;

public class ListIterator<T> implements Iterator<T> {

    Element<T> current;

    public ListIterator(Element<T> current) {
        this.current = current;
    }

    @Override
    public T next() {
        T temp = current.data;
        current = current.next;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return current.next != null;
    }
}
