package com.telusko.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertApp {

    public static void main(String[] args) {
        
        Connection connect = null;
        PreparedStatement statement = null;

        try {

            connect = JDBCUtil.getConnection();
            String query = "INSERT into dynamicstudentInfo(id, sname, sage, scity)" +
                            " VALUES(?,?,?,?)";
            statement = connect.prepareStatement(query);
            System.out.println("Enter the Following details into the DB");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter ID");
            Integer id = sc.nextInt();

            System.out.println("Enter your name");
            String name = sc.next();

            System.out.println("Enter your age");
            Integer age = sc.nextInt();

            System.out.println("Enter your city");
            String city = sc.next();

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, age);
            statement.setString(4, city);

            int rowsAffected = statement.executeUpdate();

            if(rowsAffected > 0) {
                System.out.println("Data Inserted Successfully");
            }

            else  {

                System.out.println("Failed to Insert Data");
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        catch (Exception e) {
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
