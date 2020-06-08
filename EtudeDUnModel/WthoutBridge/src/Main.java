public class Main {

    public static void main(String args[]){

    ITime militaryTime = new MilitaryTime(12, 45);

    militaryTime.tell();
    militaryTime.tellHrs();
    militaryTime.tellMin();

    System.out.println();
    ITime civilianTime = new CivilianTime(12, 45);
    civilianTime.tell();
    civilianTime.tellHrs();
    civilianTime.tellMin();
    System.out.println();
    SyncronizedTime militaryTimeSnync = new MilitarySyncronizedTime(12,45);
    militaryTimeSnync.tell();
    militaryTimeSnync.tellHrs();
    militaryTimeSnync.tellMin();
    militaryTimeSnync.tellSync();
    militaryTimeSnync.tellSyncHrs();
    militaryTimeSnync.tellSyncMin();
    System.out.println();
    SyncronizedTime militaryTimeAutoSnync = new MilitarySyncronizedTime();
    militaryTimeAutoSnync.tell();
    militaryTimeAutoSnync.tellHrs();
    militaryTimeAutoSnync.tellMin();
    militaryTimeAutoSnync.tellSync();
    militaryTimeAutoSnync.tellSyncHrs();
    militaryTimeAutoSnync.tellSyncMin();
    System.out.println();
    SyncronizedTime CivilianimeSnync = new CivilianSycronizedTime(12,45);
    CivilianimeSnync.tell();
    CivilianimeSnync.tellHrs();
    CivilianimeSnync.tellMin();
    CivilianimeSnync.tellSync();
    CivilianimeSnync.tellSyncHrs();
    CivilianimeSnync.tellSyncMin();
    System.out.println();
    SyncronizedTime civilianTimeAutoSnync = new CivilianSycronizedTime();
    civilianTimeAutoSnync.tell();
    civilianTimeAutoSnync.tellHrs();
    civilianTimeAutoSnync.tellMin();
    civilianTimeAutoSnync.tellSync();
    civilianTimeAutoSnync.tellSyncHrs();
    civilianTimeAutoSnync.tellSyncMin();
    }
}
