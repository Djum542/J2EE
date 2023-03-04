package com.gdu.k14pm01.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlseverConected {// Connect to SQL Server.
	// (Using JDBC Driver: SQLJDBC)
	public static Connection getSQLServerConnection_SQLJDBC() //
			throws ClassNotFoundException, SQLException {

		// Note: Change the connection parameters accordingly.
		String hostName = "localhost";
		String sqlInstanceName = "DESKTOP-5U7V004\\SINGSERVER";
		String database = "Cellphone";
		String userName = "sa";
		String password = "15142";

		return getSQLServerConnection_SQLJDBC(hostName, sqlInstanceName, database, userName, password);
	}

	// Connect to SQLServer, using SQLJDBC Library.
	private static Connection getSQLServerConnection_SQLJDBC(String hostName, //
			String sqlInstanceName, String database, String userName, String password)//
			throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// Example:
		// jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" //
				+ ";instance=" + sqlInstanceName + ";databaseName=" + database;

		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
}




