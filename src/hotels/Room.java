package hotels;

public class Room {
    private int roomNumber;
    private MaintenanceWorker maintenanceWorker;

    public Room() {
    }

    public Room(int roomNumber, MaintenanceWorker maintenanceWorker) {
        setRoomNumber(roomNumber);
        setMaintenanceWorker(maintenanceWorker);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public MaintenanceWorker getMaintenanceWorker() {
        return maintenanceWorker;
    }

    public void setMaintenanceWorker(MaintenanceWorker maintenanceWorker) {
        this.maintenanceWorker = maintenanceWorker;
    }

    @Override
    public String toString() {
        return "\n"+getClass().getSimpleName() +
                " roomNumber=" + roomNumber +
                ", maintenanceWorker=" + maintenanceWorker +
                '}';
    }
    public void cleanTheRoom(int duration) {
        System.out.println("\nRoom "+getRoomNumber()+" was cleaned. cleanup duration: "+duration+" minutes");
    }
}
