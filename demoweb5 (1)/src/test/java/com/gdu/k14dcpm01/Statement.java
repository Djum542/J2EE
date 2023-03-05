package com.gdu.k14dcpm01;

import org.junit.Test;

import com.gdu.k14pm01.entity.SqlseverConected;

public class Statement {

    @Test
    public void testCon() {
        try {
			System.out.println(new SqlseverConected().getSQLServerConnection_SQLJDBC());
		} catch (Exception e) {
			// TODO: handle exception
            e.printStackTrace();
		}
    }

}
