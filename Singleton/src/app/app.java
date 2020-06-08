package app;

import AbstractSingleton.SingletonChildHA;
import AbstractSingleton.SingletonHA;
import Singleton.Singleton;
import SingletonHeritage.SingletonH;
import SingletonHeritage.SingletonChildH;

public class app {
    public static void main(String[] args){
       if( Singleton.getInstance() == Singleton.getInstance()){
           System.out.println("Same instance");
       }

       //test Singleton Heritage
        try {
            SingletonH.register(SingletonChildH.class.getName());
            System.out.println(SingletonH.getInstance().getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //test Singleton Hertigae Parent habstract
        try {
            SingletonHA.register(SingletonChildHA.class);
            System.out.println(SingletonChildHA.getInstance().getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
