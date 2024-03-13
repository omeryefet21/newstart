package JDBC.cls;

import java.sql.*;
import java.util.Map;

public class DBUtils {

    public DBUtils() {
    }

    public static boolean runQuery(String sql) {
        Connection connection = null;

        boolean var2;
        try {
            boolean var3;
            try {
                if (true) {
                    connection = ConnectionPool.getInstance().getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.execute();
                    var3 = true;
                    return var3;
                }

                System.out.println("Roni please stop");
                var2 = false;
            } catch (SQLException | InterruptedException var7) {
                System.out.println(var7.getMessage());
                var3 = false;
                return var3;
            }
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }

        return var2;
    }

    public static boolean runQuery(String sql, Map<Integer, Object> params) {
        Connection connection = null;

        boolean var4;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            params.forEach((key, value) -> {
                try {
                    if (value instanceof Integer) {
                        preparedStatement.setInt(key, (Integer)value);
                    } else if (value instanceof String) {
                        preparedStatement.setString(key, String.valueOf(value));
                    } else if (value instanceof Date) {
                        preparedStatement.setDate(key, (Date)value);
                    } else if (value instanceof Double) {
                        preparedStatement.setDouble(key, (Double)value);
                    } else if (value instanceof Boolean) {
                        preparedStatement.setBoolean(key, (Boolean)value);
                    } else if (value instanceof Float) {
                        preparedStatement.setFloat(key, (Float)value);
                    }

                } catch (SQLException var44) {
                    throw new RuntimeException(var44);
                }
            });
            preparedStatement.execute();
            var4 = true;
            return var4;
        } catch (InterruptedException var9) {
            System.out.println(var9.getMessage());
            var4 = false;
        } catch (SQLException var10) {
            System.out.println(var10.getMessage());
            var4 = false;
            return var4;
        } finally {
            ConnectionPool.getInstance().returnConnection(connection);
        }

        return var4;
    }

    public static ResultSet runQueryFroResult(String sql, Map<Integer, Object> params) {
        Connection connection = null;

        try {
            connection = ConnectionPool.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            params.forEach((key, value) -> {
                try {
                    if (value instanceof Integer) {
                        preparedStatement.setInt(key, (Integer)value);
                    } else if (value instanceof String) {
                        preparedStatement.setString(key, String.valueOf(value));
                    } else if (value instanceof Date) {
                        preparedStatement.setDate(key, (Date)value);
                    } else if (value instanceof Double) {
                        preparedStatement.setDouble(key, (Double)value);
                    } else if (value instanceof Boolean) {
                        preparedStatement.setBoolean(key, (Boolean)value);
                    } else if (value instanceof Float) {
                        preparedStatement.setFloat(key, (Float)value);
                    } else if (value instanceof Long) {
                        preparedStatement.setLong(key, (Long)value);
                    }

                } catch (SQLException var4) {
                    throw new RuntimeException(var4);
                }
            });
            System.out.println(preparedStatement);
            return preparedStatement.executeQuery();
        } catch (InterruptedException | SQLException var4) {
            throw new RuntimeException(var4);
        }
    }
}
