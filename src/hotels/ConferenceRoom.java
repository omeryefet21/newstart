package hotels;

public class ConferenceRoom extends Room {
    private int stageSize;
    private boolean gotProjector, gotMicrophone;

    public ConferenceRoom(int roomNumber, MaintenanceWorker maintenanceWorker, int stageSize, boolean gotProjector, boolean gotMicrophone) {
        super(roomNumber, maintenanceWorker);
        setStageSize(stageSize);
        setGotProjector(gotProjector);
        setGotMicrophone(gotMicrophone);
    }

    public int getStageSize() {
        return stageSize;
    }

    public void setStageSize(int stageSize) {
        this.stageSize = stageSize;
    }

    public boolean isGotProjector() {
        return gotProjector;
    }

    public void setGotProjector(boolean gotProjector) {
        this.gotProjector = gotProjector;
    }

    public boolean isGotMicrophone() {
        return gotMicrophone;
    }

    public void setGotMicrophone(boolean gotMicrophone) {
        this.gotMicrophone = gotMicrophone;
    }

    @Override
    public String toString() {
        return super.toString() + "is a ConferenceRoom{" +
                "stageSize=" + stageSize +
                ", gotProjector=" + gotProjector +
                ", gotMicrophone=" + gotMicrophone +
                '}';
    }

    @Override
    public void cleanTheRoom(int duration) {
        super.cleanTheRoom(duration);
        System.out.println("The stage was also cleaned");
    }
}

