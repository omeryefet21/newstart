package classes;

public class Program {
    public static void main(String[] args) throws InterruptedException {
//        Product product1=new Product();
//        Product product2=new Product();
//
//        product1.setName("bamba");
//        product1.setPrice(4.90);
//        product1.setWeight(80);
//        product2.setName("bisli");
//        product2.setPrice(3.40);
//        product2.setWeight(60);
//        product1.print();
//        product2.print();
//
        ProductPool.getInstance();
        System.out.println(ProductPool.getInstance().getConnection());
        System.out.println(ProductPool.getInstance().getConnection());
        System.out.println(ProductPool.getInstance().getConnection());
        System.out.println(ProductPool.getInstance().getConnection());
        System.out.println(ProductPool.getInstance().getConnection());
        ProductReturnThread productReturnThread = new ProductReturnThread();
        productReturnThread.start();
        GetProductThread getProductThread=new GetProductThread();
        getProductThread.start();
        ProductPool.getInstance().closeAllConnections();
//        System.out.println(ProductPool.getInstance().getConnection());


    }
}