package app;

import java.util.Observable;
import java.util.Observer;

public class NameObservateur implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        if(o instanceof String){
            String name = (String) o;
            System.out.println("NameObserver: Name changed to " + name);
        }
    }
}
