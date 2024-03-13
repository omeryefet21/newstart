package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class ProductPool {
    private static final int NUMBER_OF_CONNECTION = 5;
    public static ProductPool instance = null;
    private final Stack<Product> connections = new Stack<>();

    private ProductPool() {
        System.out.println("We created new connection pool instance");

        try {
            this.openAllConnections();
        } catch (SQLException var2) {
            System.out.println(var2.getMessage());
        }

    }

    private void openAllConnections() throws SQLException {
        for(int counter = 0; counter < NUMBER_OF_CONNECTION; ++counter) {
            connections.push(new Product(("bamba"+counter),8,80));
        }

    }

    public static ProductPool getInstance() {
        if (instance == null) {
            Class var0 = ProductPool.class;
            synchronized(ProductPool.class) {
                if (instance == null) {
                    instance = new ProductPool();
                }
            }
        }

        return instance;
    }

    public void closeAllConnections() throws InterruptedException {
        synchronized(this.connections) {
            while(this.connections.size() < NUMBER_OF_CONNECTION) {
                this.connections.wait();
            }

            this.connections.removeAllElements();
        }
    }

    public Product getConnection() throws InterruptedException {
        synchronized(this.connections) {
            if (this.connections.isEmpty()) {
                this.connections.wait();
            }

            return this.connections.pop();
        }
    }

    public void returnConnection(Product connection) {
        synchronized(this.connections) {
            this.connections.push(connection);
            this.connections.notify();
        }
    }
}
