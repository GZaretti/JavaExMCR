package articles;

import reduces.IReduce;

public abstract class Part {
    private String name;
    private double price;
    private IReduce reduce;

    public Part(double price, String name, IReduce reduce) {
        this.price = price;
        this.name = name;
        this.reduce = reduce;
    }
    public Part(double price, String name) {
        this.price = price;
        this.name = name;
        this.reduce = null;
    }

    public void setReduce(IReduce reduce){
        this.reduce = reduce;
    }

    public double getPrice(){
        if(reduce == null) {
            return this.price;
        }

        return this.reduce.getPrice(this.price);
    }
}
