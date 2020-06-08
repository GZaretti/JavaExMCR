import java.util.ArrayList;

public class Array implements Collection {

    ArrayList<Object> array;
    ArrayIterator arrayIterator;

    Array(){
        array = new ArrayList<>();
        arrayIterator = new ArrayIterator(this);
    }

    @Override
    public void add(Object o) {
        array.add(o);
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator();
    }
}
