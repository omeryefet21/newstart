package hotels;

public class MaintenanceWorker {
    private String name;
    private int workerNumber;
    private boolean isBusy;

    public MaintenanceWorker(String name, int workerNumber, boolean isBusy) {
        setName(name);
        setWorkerNumber(workerNumber);
        setBusy(isBusy);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkerNumber() {
        return workerNumber;
    }

    public void setWorkerNumber(int workerNumber) {
        this.workerNumber = workerNumber;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    @Override
    public String toString() {
        return "MaintenanceWorker{" +
                "name='" + name + '\'' +
                ", workerNumber=" + workerNumber +
                ", isBusy=" + isBusy +
                '}';
    }
}
