package computers;

enum MemoryTypes {
    hd(500,2000),
    hd1(600,3000),

    ssd,
    qhd,
    fsd;

    int size;
    int price;

    MemoryTypes(int size, int price) {
        this.size = size;
        this.price = price;
    }

    MemoryTypes() {
    }
}