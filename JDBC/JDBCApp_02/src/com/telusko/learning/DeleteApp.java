package com.telusko.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteApp {
    public static void main(String[] args) {
        Connection connect = null;
        PreparedStatement statement = null;

        try {

            connect = JDBCUtil.getConnection();


            String sql = "DELETE FROM dynamicstudentinfo WHERE id = 4";
            statement = connect.prepareStatement(sql);

            int rowsAffected = statement.executeUpdate();

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
