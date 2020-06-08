package app;

import Singleton.Singleton;
import SingletonHeritage.SingletonH;
import SingletonHeritage.SingletonSubClass;

public class app {
    public static void main(String[] args){
       if( Singleton.getInstance() == Singleton.getInstance()){
           System.out.println("Same instance");
       }

       //test Singleton Heritage
        try {
            SingletonH.register(SingletonSubClass.class.getName());
            System.out.println(SingletonH.getInstance().getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
