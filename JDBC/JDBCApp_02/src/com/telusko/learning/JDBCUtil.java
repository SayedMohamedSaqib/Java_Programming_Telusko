package com.telusko.learning;
import java.sql.*;
public class JDBCUtil {

    private static final String url = "jdbc:mysql://localhost:3306/jdbclearning";
    private static final String user = "root";
    private static final String password = "Juniperisatstake@7118";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void closeResources(Connection connect, PreparedStatement statement) throws SQLException {
        if(statement != null) {
            statement.close();
        }

        if(connect != null) {
            connect.close();
        }
    }

}
