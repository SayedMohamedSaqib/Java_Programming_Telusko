package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteApp {
    public static void main(String[] args) {
        Connection connect = null;
        Statement statement = null;

        try {

            connect = JDBCUtil.getConnection();

            statement = connect.createStatement();

            String sql = "DELETE FROM studentinfo WHERE id = 4";

            int rowsAffected = statement.executeUpdate(sql);

            if(rowsAffected > 0) {
                System.out.println("Data Deleted Successfully");
            }

            else {
                System.out.println("Failed to Delete Data");
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
