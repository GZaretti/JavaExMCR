package Fabrication7;

import java.util.ArrayList;
import java.util.Objects;

public class Array<T> implements Collection<T>{
    Object[] array;
    int current;

    public Array(int n) {
        array = new Object[n];
        current = 0;
    }

    public int nbElements(){
        return current;
    }

  @Override
   public void add(T o) {
        if(current < array.length){

            array[current] = o;
            ++current;
        }
  }

  public T getAt(int index) {
        T element = null;
        if(index < array.length) {
            element = (T)array[index];
        }
        return element;
  }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(this);
    }
}
