package Adapter;

public class SquarePeg extends Peg {
    public void insert(String str){
        System.out.println(prompt()+"SquarePeg.insert():"+str);
    }
}
