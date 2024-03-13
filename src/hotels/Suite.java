package hotels;

public class Suite extends Room{
    int bedCount, hotTubSize;

    public Suite(int roomNumber, MaintenanceWorker maintenanceWorker, int bedCount, int hotTubSize) {
        super(roomNumber, maintenanceWorker);
        setBedCount(bedCount);
        setHotTubSize(hotTubSize);
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public int getHotTubSize() {
        return hotTubSize;
    }

    public void setHotTubSize(int hotTubSize) {
        this.hotTubSize = hotTubSize;
    }

    @Override
    public String toString() {
        return super.toString()+"is a Suite{" +
                "bedCount=" + bedCount +
                ", hotTubSize=" + hotTubSize +
                '}';
    }

    @Override
    public void cleanTheRoom(int duration) {
        super.cleanTheRoom(duration);
        System.out.println("and the bed was made and the hot tub was cleaned");
    }
}

