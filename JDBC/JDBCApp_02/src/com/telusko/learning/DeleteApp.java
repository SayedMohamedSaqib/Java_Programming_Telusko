package com.telusko.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteApp {
    public static void main(String[] args) {
        Connection connect = null;
        PreparedStatement statement = null;

        try {

            connect = JDBCUtil.getConnection();


            String sql = "DELETE FROM dynamicstudentinfo WHERE id = ?";
            statement = connect.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the ID to be deleted:");
            Integer id = sc.nextInt();

            statement.setInt(1, id);
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
