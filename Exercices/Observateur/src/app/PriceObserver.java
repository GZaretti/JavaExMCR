package app;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        if(o instanceof Float){
            Float price = (Float) o;
            System.out.println("PriceObserver: Price changed to " + price);
        }
    }
}
