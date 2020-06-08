import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MilitarySyncronizedTime extends SyncronizedTime implements ISyncronizedTime, IMilitaryTime {
    public MilitarySyncronizedTime(int hrs, int min) {
        super(hrs, min);
    }

    public MilitarySyncronizedTime() {
    }


    @Override
    public void tell() {
        System.out.println("Military times : " + hrs + "" +min + ", " + this.sincronizedAt);
    }

    @Override
    public void tellHrs() {

        System.out.println("Military hours : " + hrs + "00"+ ", " + this.sincronizedAt);
    }

    @Override
    public void tellMin() {
        System.out.println("Military minutes : 00"+ "" +min+ ", " + this.sincronizedAt);
    }



    @Override
    public void tellSync() {
        this.sync();
        this.tell();
    }

    @Override
    public void tellSyncHrs() {
        this.sync();
        this.tellHrs();
    }

    @Override
    public void tellSyncMin() {
        this.sync();
        this.tellMin();
    }
}
