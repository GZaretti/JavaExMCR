package articles;

import reduces.IReduce;

public class Wiskey extends Part{
    private int age;
    private double percentAlcool;

    public Wiskey(double price, String name, IReduce reduce) {
        super(price, name, reduce);
    }
}
