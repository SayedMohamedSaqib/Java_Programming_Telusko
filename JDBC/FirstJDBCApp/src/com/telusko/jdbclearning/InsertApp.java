package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.Statement;

public class InsertApp {
    public static void main(String[] args) {
        Connection connect = null;
        Statement statement = null;

        try {
            
            connect = JDBCUtil.getConnection();
            statement = connect.createStatement();

            String sql = "INSERT INTO studentinfo(id, sname, sage, scity)" + 
            "VALUES(4, 'Aditya', 22, 'Delhi')";

            int rowsAffected = statement.executeUpdate(sql);

            if(rowsAffected > 0) {
                System.out.println("Data Inserted Successfully");
            }

            else {
                System.out.println("Insertion Failed");
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
