package articles;

import reduces.IReduce;

public class Soda extends Part {
    private boolean isLight;

    public Soda(double price, String name, boolean isLight, IReduce reduce) {
        super(price, name, reduce);
    }
}
