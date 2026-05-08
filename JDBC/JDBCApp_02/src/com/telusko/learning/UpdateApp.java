package com.telusko.learning;
import java.sql.*;
import java.sql.Connection;

public class UpdateApp {

    public static void main(String[] args) {
        Connection connect = null;
        PreparedStatement statement = null;
        
        try {
            connect = JDBCUtil.getConnection();

            String query = "UPDATE dynamicstudentInfo " + 
                         "SET sage = 5 " + 
                         "WHERE id = 4";
            statement = connect.prepareStatement(query);
            int rowsAffected = statement.executeUpdate();

            if(rowsAffected > 0) {

                System.out.println("Data Updated Successfully");

            }

            else {
                System.out.println("Failed to Update Data");
            }
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
