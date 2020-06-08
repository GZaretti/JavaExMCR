package Fabrication7;

public class ArrayIterator<T> implements Iterator<T> {
    int index;
    Array<T> arrayy;
    public ArrayIterator(Array<T> array) {
       arrayy = array;
       index = 0;
    }

    @Override
    public T next() {

        T temp = (T)arrayy.getAt(index);
        index++;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return arrayy.nbElements() - 1 > index ;
    }
}
