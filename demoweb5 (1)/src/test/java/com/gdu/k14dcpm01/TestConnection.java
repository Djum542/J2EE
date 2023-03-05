package com.gdu.k14dcpm01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.*;

import org.junit.Test;
public class TestConnection {

    @Test
    public void testcon(){
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Cellphone;user=sa;password=15142";

        try {
            Connection conn = DriverManager.getConnection(connectionUrl);

            String query = "SELECT * FROM Profilecell";

            java.sql.Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String address = rs.getString("Address");
                String position = rs.getString("Position");

                System.out.println(name + ", " + age + ", " + address + ", " + position);
            }

            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.getMessage());
        }
    }


    
    @Test
    
    public void TestConnection(){
        String hostName = "localhost";
		String sqlInstanceName = "DESKTOP-5U7V004\\SINGSERVER";
		String database = "Cellphone";
		String userName = "sa";
		String password = "15142";

        try (Connection conn = DriverManager.getConnection("")) {
            if (conn.isValid(100)) { // kiểm tra kết nối trong vòng 10 giây
                System.out.println("Kết nối thành công đến CSDL!");
            } else {
                System.out.println("Kết nối thất bại đến CSDL!");
            }
        } catch (SQLException ex) {
            System.err.println("Lỗi: " + ex.getMessage());
        }
    }
    
}
