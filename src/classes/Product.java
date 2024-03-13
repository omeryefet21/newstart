package classes;

public class Product {
    private String name;
    private double price;
    private int weight;

    public Product(){
        this("generic",99.99,100);
    }
    public Product(String name,double price,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    public void print() {
        System.out.println("Name: "+name+"\n"+"Weight: "+weight+"\n"+"Price: "+price);

    }
}
