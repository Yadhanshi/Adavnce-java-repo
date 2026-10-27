//Program 4.1

import java.sql.*;
public class Main
{
    static final String URL = "jdbc:mysql://localhost";
    static final String USER = "root";
    static final String PASS = "";
    public static void main(String[] args)
    {
        try
        {
            Connection conn = DriverManager.getConnection(URL,USER,PASS);
            Statement stmt = conn.createStatement();
            String sql = "Create Database Student1";
            stmt.executeUpdate(sql);
            System.out.println("Database Created Successfully");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}