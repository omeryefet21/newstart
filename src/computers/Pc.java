package computers;

public class Pc extends Computer{
    private boolean isMouseWireless;
    private int monitorSize;

    public Pc(int cpuMemory, int driveMemory, int price, int warranty, String model, boolean isMouseWireless, int monitorSize) {
        super(cpuMemory, driveMemory, price, warranty, model);
        setMouseWireless(isMouseWireless);
        setMonitorSize(monitorSize);
    }

    public boolean isMouseWireless() {
        return isMouseWireless;
    }

    public void setMouseWireless(boolean mouseWireless) {
        isMouseWireless = mouseWireless;
    }

    public int getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(int monitorSize) {
        this.monitorSize = monitorSize;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPc{" +
                "isMouseWireless=" + isMouseWireless +
                ", monitorSize=" + monitorSize +
                '}';
    }

//    @Override
//    public void print() {
//        System.out.println(this);
//    }

    @Override
    public void offerAccessories() {
        System.out.println("Wanna buy a table?");
    }
}
