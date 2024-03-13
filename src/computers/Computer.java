package computers;

public abstract class Computer {
    private int cpuMemory, driveMemory,price,warranty;
    private String model;

    public Computer() {
    }

    public Computer(int cpuMemory, int driveMemory, int price, int warranty, String model) {
        setCpuMemory(cpuMemory);
        setDriveMemory(driveMemory);
        setPrice(price);
        setWarranty(warranty);
        setModel(model);
    }

    public int getCpuMemory() {
        return cpuMemory;
    }

    public void setCpuMemory(int cpuMemory) {
        this.cpuMemory = cpuMemory;
    }

    public int getDriveMemory() {
        return driveMemory;
    }

    public void setDriveMemory(int driveMemory) {
        this.driveMemory = driveMemory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpuMemory=" + cpuMemory +
                ", driveMemory=" + driveMemory +
                ", price=" + price +
                ", warranty=" + warranty +
                ", model='" + model + '\'' +
                '}';
    }
    public void print() {
        System.out.println(this);
    }
    public abstract void offerAccessories();
}
