import java.util.ArrayList;

public class ArrayIterator implements Iterator{

    private int index;
    private Array array;
    ArrayIterator(Array array){
        this.array = array;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
