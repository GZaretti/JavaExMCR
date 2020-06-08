import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public abstract class SyncronizedTime extends Time implements ISyncronizedTime, ITime{
    protected String sincronizedAt;

    public SyncronizedTime(int hrs, int min) {
        super(hrs, min);
        final Date currentTime = new Date();
        final SimpleDateFormat sdf =
                new SimpleDateFormat("EEE, MMM d, yyyy hh:mm:ss a z");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        sincronizedAt = "Not a syncronized time. Created at : " + sdf.format(currentTime) + ".";
    }

    public SyncronizedTime(){
        super(0, 0);
        this.sync();
    }

    @Override
    public void sync() {



        final Date currentTime = new Date();
        final SimpleDateFormat sdf =
                new SimpleDateFormat("EEE, MMM d, yyyy hh:mm:ss a z");
        final SimpleDateFormat hours =
                new SimpleDateFormat("HH");
        final SimpleDateFormat minutes =
                new SimpleDateFormat("mm");

        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.sincronizedAt = "GMT Syncronized : " + sdf.format(currentTime) + ".";
        this.hrs = Integer.parseInt(hours.format(currentTime));
        this.min = Integer.parseInt(minutes.format(currentTime));
    }
}
