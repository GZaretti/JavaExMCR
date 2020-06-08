public class CivilianSycronizedTime extends SyncronizedTime implements ISyncronizedTime, ICivilianTime {
    public CivilianSycronizedTime(int hrs, int min) {
        super(hrs, min);
    }

    public CivilianSycronizedTime() {
    }

    @Override
    public void tell() {

        System.out.println("Civilian time : " + this.getAmPmHours() + " and " + min + " minutes." + " " + this.sincronizedAt);
    }

    @Override
    public void tellHrs() {

        System.out.println("Civilian time : "  +  this.getAmPmHours() + ". " + this.sincronizedAt);
    }

    @Override
    public void tellMin() {

        System.out.println("Civilian hours : " + this.min +" minutes." + " " + this.sincronizedAt);
    }

    @Override
    public String getAmPmHours() {
        String ampm;
        if(this.hrs > 12){
            ampm = (this.hrs - 12 ) +" pm";
        }else {
            ampm = hrs +" am";
        }
        return ampm;
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
