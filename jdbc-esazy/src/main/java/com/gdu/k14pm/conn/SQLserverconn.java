package com.gdu.k14pm.conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.gdu.k14pm.model.Connections;

public class SQLserverconn {
    public static Connections getSQLServerConnection_JTDS() //
			throws SQLException, ClassNotFoundException {

		// Note: Change the connection parameters accordingly.
		String hostName = "localhost";
		String sqlInstanceName = "SQLEXPRESS";
		String database = "SimpleProduct";
		String userName = "sa";
		String password = "15142";

		return getSQLServerConnection_JTDS(hostName, sqlInstanceName, database, userName, password);
	}

	// Connect to SQLServer, using JTDS library
	private static Connections getSQLServerConnection_JTDS(String hostName, //
			String sqlInstanceName, String database, String userName, String password)
			throws ClassNotFoundException, SQLException {

		Class.forName("net.sourceforge.jtds.jdbc.Driver");

		// Example:
		// jdbc:jtds:sqlserver://localhost:1433/simplehr;instance=SQLEXPRESS
		String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/" //
				+ database + ";instance=" + sqlInstanceName;

		Connections conn = (Connections) DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
}
