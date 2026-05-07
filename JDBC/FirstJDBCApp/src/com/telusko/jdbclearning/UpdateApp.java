package com.telusko.jdbclearning;
import java.sql.*;
import java.sql.Connection;

public class UpdateApp {

    public static void main(String[] args) {
        Connection connect = null;
        Statement statement = null;
        
        try {
            connect = JDBCUtil.getConnection();
            statement = connect.createStatement();

            String sql = "UPDATE studentinfo " + 
                         "SET sage = 5 " + 
                         "WHERE id = 4";
            int rowsAffected = statement.executeUpdate(sql);

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
