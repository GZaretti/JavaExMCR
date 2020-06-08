package app;

import Singleton.Singleton;

public class app {
    public static void main(String[] args){
       if( Singleton.getInstance() == Singleton.getInstance()){
           System.out.println("Same instance");
       }
    }
}
