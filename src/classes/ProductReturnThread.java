package classes;

public class ProductReturnThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            ProductPool.getInstance().returnConnection(new Product(("bamba"+i),7,80));
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
