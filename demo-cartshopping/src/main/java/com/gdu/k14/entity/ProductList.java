package com.gdu.k14.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private static final List<Product> ds = new ArrayList<Product>();
    static{
        initData();
    }
    public static List<Product> query(){
        return ds;
    } 
    private static void initData(){
        Product sp = new Product(null, null, null, 0, 0, null);
        sp.setId("PR001");
        sp.setDescription("");
        sp.setPrice(0);
        sp.setModel("Nokia Lumia");
        sp.setImage("/image/dt01.jpg");
        sp.setQuantity(10);
        ds.add(sp);
        sp = new Product(null, null, null, 0, 0, null);
        sp.setId("PR02");
        sp.setDescription("");
        sp.setPrice(0);
        sp.setModel("BlackBerry Passport");
        sp.setQuantity(20);
        sp.setImage("/image/dt02.jpg");
        ds.add(sp);
    }
}
