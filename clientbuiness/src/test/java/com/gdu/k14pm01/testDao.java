package com.gdu.k14pm01;

import java.util.List;

import org.junit.Test;

import com.gdu.k14pm01.bean.Productclothes;
import com.gdu.k14pm01.entity.Dao;

public class testDao {

    @Test
    public void testDao() {
        Dao da = new Dao();
        List<Productclothes> test = da.getAllProduct();
        for (Productclothes productclothes : test) {
            System.out.println(productclothes);
        } 
    }
    
}
