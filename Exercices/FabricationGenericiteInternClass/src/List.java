import java.util.ArrayList;

public class List implements Collection {

    ArrayList<Object> objects;

    Iterator listIterator;

    List(){
        objects = new ArrayList<>();
        listIterator = new ListIterator(this);
    }

    @Override
    public void add(Object o) {
        this.objects.add(o);

    }

    @Override
    public Iterator iterator() {
        return  listIterator;
    }
}
