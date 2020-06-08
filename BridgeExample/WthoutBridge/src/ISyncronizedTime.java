public interface ISyncronizedTime extends ITime {
    void sync();
    void tellSync();
    void tellSyncHrs();
    void tellSyncMin();
}
