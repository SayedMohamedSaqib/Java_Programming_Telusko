package com.telusko.learning;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

public class BatchUpdate {

    public static void main(String[] args) {
        Connection connect = null;
        PreparedStatement statement = null;
        
        try {
            connect = JDBCUtil.getConnection();

            String query = "UPDATE dynamicstudentInfo " + 
                         "SET sage =?" + 
                         " WHERE id =?";
            statement = connect.prepareStatement(query);

            statement.setInt(1, 3);
            statement.setInt(2, 1);
            statement.addBatch();

            statement.setInt(1, 5);
            statement.setInt(2, 2);
            statement.addBatch();

            statement.setInt(1, 23);
            statement.setInt(2, 3);
            statement.addBatch();

            statement.executeBatch();

            System.out.println("Check DB for updated results");
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {

            try {

                JDBCUtil.closeResources(connect, statement);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
