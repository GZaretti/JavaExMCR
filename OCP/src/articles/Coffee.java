package articles;

import reduces.IReduce;

public class Coffee extends Part {
    String force;

    public Coffee(double price, String name, String force, IReduce reduce) {
        super(price, name, reduce);
        this.force = force;
    }
}
