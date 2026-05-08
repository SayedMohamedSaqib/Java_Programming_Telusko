package com.telusko.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectApp {
    public static void main(String[] args) {

        Connection connect = null;
        PreparedStatement statement = null;
        ResultSet resulSet = null; 
                   
        try {

            connect = JDBCUtil.getConnection();


            String sql = "SELECT id, sname, sage, scity from dynamicstudentinfo where id =?";
            statement = connect.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your id to retrive your data");
            Integer id = sc.nextInt();

            statement.setInt(1, id);

            resulSet = statement.executeQuery();

            System.out.println("id\tname\tage\tcity");

            while (resulSet.next()) {
                int idx = resulSet.getInt("id");
                String name = resulSet.getString("sname");
                int age = resulSet.getInt("sage");
                String city = resulSet.getString("scity");

                System.out.println(
                    idx + "\t" + 
                    name + "\t" + 
                    age + "\t" + 
                    city
                );
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {
                if(resulSet!= null) resulSet.close();

                JDBCUtil.closeResources(connect, statement);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
