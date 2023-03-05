package com.gdu.k14pm01.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gdu.k14pm01.bean.Productclothes;

public class Dao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<Productclothes> getAllProduct(){
        List<Productclothes> list = new ArrayList<>();
        String query = "SELECT * FROM PRODUCT";
        try {
            conn = new SqlseverConected().getSQLServerConnection_SQLJDBC();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Productclothes(rs.getInt(1),
                                            rs.getString(1),
                                            rs.getString(2), 
                                            rs.getString(3), 
                                            rs.getString(4)));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error while here"+e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
}
