package classes;

public class GetProductThread extends Thread{
    @Override
    public void run() {

            try {
                sleep(1500);
                System.out.println(ProductPool.getInstance().getConnection());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

        }


    }
}
