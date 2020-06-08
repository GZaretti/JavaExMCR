package Singleton;

public class Singleton {
    private static Singleton instance;
    private  int data;

    private Singleton(){}
    private int getData(){return data;}
    public void setData(int data){
        this.data = data;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
