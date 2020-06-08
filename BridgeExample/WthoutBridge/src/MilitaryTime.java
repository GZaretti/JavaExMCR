public class MilitaryTime extends Time implements IMilitaryTime{

    public MilitaryTime(int hrs, int min) {
        super(hrs, min);
    }

    @Override
    public void tell() {
        System.out.println("Military times : " + hrs + "" +min);
    }

    @Override
    public void tellHrs() {

        System.out.println("Military hours : " + hrs + "00");
    }

    @Override
    public void tellMin() {
        System.out.println("Military minutes : 00"+ "" +min);
    }
}
