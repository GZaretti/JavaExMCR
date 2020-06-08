package app;

import java.util.Observable;

public class Product extends Observable {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    private  void notify(Object arg){
        setChanged();
        notifyObservers(arg);
    }

    public void setName(String name){
        this.name = name;
        notify(name);
    }

    public void setPrice(float price){
        this.price = price;
        notify(price);
    }
}
