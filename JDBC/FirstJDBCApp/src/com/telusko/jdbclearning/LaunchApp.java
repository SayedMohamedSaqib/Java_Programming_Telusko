package com.telusko.jdbclearning;
import java.sql.*;

public class LaunchApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Load and Register the Driver
        // Class.forName("com.mysql.cj.jdbc.Driver"); //Not needed for modern jdbc

        //Establish connection to database
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String passwsord = "Juniperisatstake@7118";
        Connection connect = DriverManager.getConnection(url, user, passwsord);

        //Statement 
        Statement statement = connect.createStatement();

        //Execute query
        String sql = "INSERT INTO studentinfo(id, sname, sage, scity) VALUES(3, 'Saqib', 23, 'Mumbai')";
        int rowAffected = statement.executeUpdate(sql); //Nonselect operation

        //Process result
        if(rowAffected == 0) {
            System.out.println("Unable to Insert data");

        }
        else{

            System.out.println("Data inserted Successfully");
        }
        //Close Connection
        statement.close();
        connect.close();
    }


}
