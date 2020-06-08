import articles.Coffee;
import articles.Part;
import articles.Soda;
import articles.Wiskey;
import reduces.IReduce;
import reduces.Reduce;

public class Main {

    public static void main(String args[]){
        System.out.println("Test exercice open close patern");
        IReduce lightReduce = new Reduce(0.2);
        IReduce bioReduce = new Reduce(0.40);
        IReduce alcoolReduce = new Reduce(0.30);

        Part[] allArticles = {new Soda(1.50, "Coca Light", true, lightReduce),
                new Soda(1.40, "Coca Cola", false, null),
                new Soda(3, "lemon juce", false, bioReduce),
                new Coffee(10, "black coffe","3/5", null),
                new Coffee(10, "green coffe","4/5", null),
                new Coffee(10, "String coffe","5/5", null),
                new Wiskey(35, "Jack",alcoolReduce),
                new Wiskey(35, "Jack",alcoolReduce),
                        new Wiskey(35, "Jack",alcoolReduce)};

        System.out.println(totalPrice(allArticles));

    }

    public static double totalPrice(Part[] parts){
        double total = 0;
        for(Part p : parts){
            total += p.getPrice();
        }
        return total;
    }
}
