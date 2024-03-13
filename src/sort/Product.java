package sort;

public class Product implements Comparable<Product> {
    private String name;
    private int weight,price;

    public Product(String name, int weight, int price) {
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (o != null) {
            return (this.getPrice()- o.getPrice());
        }
        else
            return -1;
    }
}
