package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectApp {
    public static void main(String[] args) {

        Connection connect = null;
        Statement statement = null;
        ResultSet resulSet = null; 
                   
        try {

            connect = JDBCUtil.getConnection();

            statement = connect.createStatement();

            String sql = "SELECT * from studentinfo";

            resulSet = statement.executeQuery(sql);

            System.out.println("id\tname\tage\tcity");

            while (resulSet.next()) {
                int id = resulSet.getInt("id");
                String name = resulSet.getString("sname");
                int age = resulSet.getInt("sage");
                String city = resulSet.getString("scity");

                System.out.println(
                    id + "\t" + 
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
