package com.gdu.k14pm.model;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gdu.k14pm.conn.SQLserverconn;

public class Connections {
    /**
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() 
			  throws ClassNotFoundException, SQLException {

		// Here I using Oracle Database.
		// (You can change to use another database.)
		return (Connection) SQLserverconn.getSQLServerConnection_JTDS();
		
		// return OracleConnUtils.getOracleConnection();
		// return MySQLConnUtils.getMySQLConnection();
		// return SQLServerConnUtils_JTDS.getSQLServerConnection_JTDS();
		// return SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
		// return PostGresConnUtils.getPostGresConnection();
	}
	
	public static void closeQuietly(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}

	public static void rollbackQuietly(Connection conn) {
		try {
			conn.rollback();
		} catch (Exception e) {
		}
	}

    public PreparedStatement prepareStatement(String sql) {
        return null;
    }
}
