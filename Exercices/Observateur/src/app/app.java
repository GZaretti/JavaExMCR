package app;

public class app {
    public static void main(String args[]){
        //Create the subject and observers.
        Product s = new Product("Orange", 1.35f);
        s.addObserver(new NameObservateur());
        s.addObserver(new PriceObserver());

        s.setName("Orange juce");
        s.setPrice(1.87f);
    }
}
