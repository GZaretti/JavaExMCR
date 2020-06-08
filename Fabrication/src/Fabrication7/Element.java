package Fabrication7;

public class Element<T> {
    T data;
    Element<T> next;


    public Element(T data) {
        this.data = data;
        next = null;
    }
}
