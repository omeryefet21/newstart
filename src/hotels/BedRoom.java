package hotels;

public class BedRoom extends Room{
    private int bedCount;
    private boolean gotTv;

    public BedRoom(int roomNumber, MaintenanceWorker maintenanceWorker, int bedCount, boolean gotTv) {
        super(roomNumber, maintenanceWorker);
        setBedCount(bedCount);
        setGotTv(gotTv);
    }

    public int getBeds() {
        return bedCount;
    }

    public void setBedCount(int beds) {
        this.bedCount = beds;
    }

    public boolean isGotTv() {
        return gotTv;
    }

    public void setGotTv(boolean gotTv) {
        this.gotTv = gotTv;
    }

    @Override
    public String toString() {
        return super.toString()+"is a BedRoom{" +
                "beds=" + bedCount +
                ", gotTv=" + gotTv +
                '}';
    }

    @Override
    public void cleanTheRoom(int duration) {
        super.cleanTheRoom(duration);
        System.out.println("and the bed was made");
    }
}
