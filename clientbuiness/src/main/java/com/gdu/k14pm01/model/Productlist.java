package com.gdu.k14pm01.model;

import java.util.ArrayList;
import java.util.List;
import com.gdu.k14pm01.bean.*;
public class Productlist {
    private static final List<Productclothes> ds = new ArrayList<Productclothes>();
    static{
        initData();
    }
    public static List<Productclothes> queryProductclothes (){
        return ds;
    }
    private static void initData(){
        Productclothes sp = new Productclothes();
        sp.setId(0);
        sp.setDescripsion("");
        sp.setName("OPPO RENO 5");
        sp.setImage("https://www.google.com.vn/imgres?imgurl=https%3A%2F%2Fcdn.tgdd.vn%2FProducts%2FImages%2F42%2F230772%2Foppo-reno5-pro-600x600-1-600x600.jpg&imgrefurl=https%3A%2F%2Fwww.thegioididong.com%2Fdtdd%2Foppo-reno5-pro&tbnid=LS93wrJLEmn7zM&vet=12ahUKEwiQx73IhcD9AhV3iVYBHbvjAzgQMygBegUIARC8AQ..i&docid=r6E0OmVvjwhw_M&w=600&h=600&q=hinh%20oppo%20reno%205&ved=2ahUKEwiQx73IhcD9AhV3iVYBHbvjAzgQMygBegUIARC8AQ/");
        sp.setPrice("3200000");
    }
}
