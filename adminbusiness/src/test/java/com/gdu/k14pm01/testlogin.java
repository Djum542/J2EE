package com.gdu.k14pm01;
/**
 * testlogin
 */

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.gdu.k14pm01.entity.SqlseverConected;

public class testlogin {
/**
 * 
 */
@Test
public void testconn() {
    SqlseverConected st = new SqlseverConected();
    try (Connection conn = DriverManager.getConnection(@"DESKTOP-5U7V004\SINGSERVER", "sa", 15142)) {
        if (conn.isValid(3)) {
            System.out.println("Database connection established");
            st.doGet();
        } else {
            System.out.println("Error connecting to Database");
        }
    } catch (SQLException e) {
        System.out.println("Error connecting to Database " + e);
    }
    
}
    
}
















