package reduces;

public class Reduce implements IReduce {
    private double percentReduce;

    public Reduce(double percentReduce) {
        this.percentReduce = percentReduce;
    }

    @Override
    public double getReduction(double price) {
        return price * percentReduce;
    }

    @Override
    public double getPrice(double price) {
        return price - this.getReduction(price);
    }
}
