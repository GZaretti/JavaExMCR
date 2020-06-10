package Adapter;

public class RoundPegAdapter extends Peg{

    private RoundPegStrange roundPegStrange;
    public RoundPegAdapter(RoundPegStrange roundPegStrange){
        this.roundPegStrange = roundPegStrange;
    }
    @Override
    public void insert(String str) {
        System.out.println(prompt());
        this.roundPegStrange.insertIntoHole(str);
    }
}
