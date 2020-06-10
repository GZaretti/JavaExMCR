package Adapter;

public class app {
    public static void main(String[] args){
        Peg squarePeg = new SquarePeg();
        squarePeg.insert("Inserting square peg...");
        RoundPegStrange roundPeg = new RoundPegStrange();
        Peg adapter = new RoundPegAdapter(roundPeg);
        adapter.insert("Inserting round pegStrange withs RoundPegAdapter...");

    }
}
