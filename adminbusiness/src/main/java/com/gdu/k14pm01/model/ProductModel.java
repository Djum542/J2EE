package com.gdu.k14pm01.model;

import java.util.ArrayList;
import java.util.List;

import com.gdu.k14pm01.bean.Product;

public class ProductModel {
    private static final List<Product> list = new ArrayList<Product>();  
    public static final List<Product> queryProduct(){
        return list;
    }
    public static void initdata(){
        Product sp = new Product();
    }
}
