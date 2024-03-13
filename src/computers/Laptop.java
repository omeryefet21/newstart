package computers;

public class Laptop extends Computer{
    private int chargeHoursCapacity, chargePercentage;
    private boolean isTouchScreen;

    public Laptop(int cpuMemory, int driveMemory, int price, int warranty, String model, int chargeHoursCapacity, int chargePercentage, boolean isTouchScreen) {
        super(cpuMemory, driveMemory, price, warranty, model);
        setChargeHoursCapacity(chargeHoursCapacity);
        setChargePercentage(chargePercentage);
        setTouchScreen(isTouchScreen);
    }

    public int getChargeHoursCapacity() {
        return chargeHoursCapacity;
    }

    public void setChargeHoursCapacity(int chargeHoursCapacity) {
        this.chargeHoursCapacity = chargeHoursCapacity;
    }

    public int getChargePercentage() {
        return chargePercentage;
    }

    public void setChargePercentage(int chargePercentage) {
        this.chargePercentage = chargePercentage;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLaptop{" +
                "chargeHoursCapacity=" + chargeHoursCapacity +
                ", chargePercentage=" + chargePercentage +
                ", isTouchScreen=" + isTouchScreen +
                '}';
    }

    @Override
    public void offerAccessories() {
        System.out.println("Wanna buy a bag?");
    }
    public void charge() {
        System.out.println("Your laptop was successfully charged");
    }

}
