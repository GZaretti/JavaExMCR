public class ListIterator implements Iterator {


    private List list;
    private Object o ;

    ListIterator(List list){
        this.list = list;
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
