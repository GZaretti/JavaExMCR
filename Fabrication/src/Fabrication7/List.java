package Fabrication7;

public class List<T> implements Collection<T>{
    Element<T> start;

    @Override
    public void add(T o) {

        Element<T> last = start;
        if(last != null){
            while (last.next != null){
                last = last.next;
            }
            last.next = new Element<T>(o);
        }else {
            start = new Element<T>(o);
        }


    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(start);
    }
}
