package Adapter;

public abstract class Peg {
    private static int count;
    private int index = count++;
    abstract public void insert(String msg);
    public String prompt(){
        return "Peg #"+index+">";
    }
}

