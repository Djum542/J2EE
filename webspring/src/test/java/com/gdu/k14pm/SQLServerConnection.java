package com.gdu.k14pm;


import java.sql.*;

public class SQLServerConnection {
   public static void main(String[] args) {
      String connectionUrl = "jdbc:sqlserver://localhost\\instanceName;databaseName=busines;user=sa;password=15142;";

      try (Connection conn = DriverManager.getConnection(connectionUrl);
         Statement statement = conn.createStatement();
         ResultSet resultSet = statement.executeQuery("SELECT * from Product")) {

         while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
         }
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
   }
}


