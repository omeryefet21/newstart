package JDBC.cls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.Stack;

public class ConnectionPool {
    private static final int NUMBER_OF_CONNECTION = 10;
    public static volatile ConnectionPool instance = null;
    private final Stack<Connection> connections = new Stack<>();

    private ConnectionPool() {
        System.out.println("We created new connection pool instance");

        try {
            this.openAllConnections();
        } catch (SQLException var2) {
            System.out.println(var2.getMessage());
        }

    }

    private void openAllConnections() throws SQLException {
        for(int counter = 0; counter < NUMBER_OF_CONNECTION; ++counter) {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1234");
            this.connections.push(connection);
        }

    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            synchronized(ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
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

    public Connection getConnection() throws InterruptedException {
        synchronized(this.connections) {
            if (this.connections.isEmpty()) {
                this.connections.wait();
            }

            return (Connection)this.connections.pop();
        }
    }

    public void returnConnection(Connection connection) {
        synchronized(this.connections) {
            this.connections.push(connection);
            this.connections.notify();
        }
    }






//    public Boolean runQuery(String sql) throws CLLogicException, SQLException {
//        Connection connection = null;
//        try {
//            connection = connectionPool.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.execute();
//            return true;
//        } catch (InterruptedException exception) {
//            throw new CLLogicException("Operation interrupted - " + exception.getMessage(), 498);
//        } finally {
//            connectionPool.returnConnection(connection);
//        }
//    }
//
//    public Boolean runQuery(String sql, Map<Integer, Object> params) throws CLLogicException, SQLException {
//        Connection connection = null;
//        try {
//            connection = connectionPool.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            return setPreparedStatement(preparedStatement, params).execute();
//        } catch (InterruptedException exception) {
//            throw new CLLogicException("Operation interrupted - " + exception.getMessage(), 498);
//        } finally {
//            connectionPool.returnConnection(connection);
//        }
//    }

}
