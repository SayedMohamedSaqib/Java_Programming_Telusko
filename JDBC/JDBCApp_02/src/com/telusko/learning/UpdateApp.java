package com.telusko.learning;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

public class UpdateApp {

    public static void main(String[] args) {
        Connection connect = null;
        PreparedStatement statement = null;
        
        try {
            connect = JDBCUtil.getConnection();

            String query = "UPDATE dynamicstudentInfo " + 
                         "SET sage =?" + 
                         " WHERE id =?";
            statement = connect.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Information that needs to be updated");
            System.out.println("Kindly enter your ID: ");
            Integer id = sc.nextInt();
            System.out.println("Enter age to be updated");
            Integer age = sc.nextInt();

            statement.setInt(1, age);
            statement.setInt(2, id);
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
