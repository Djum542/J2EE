package com.gdu.k14pm;

import java.util.ArrayList;
import java.util.List;

public class Beerexpert {
    public List getbrand(String color){
            List brand = new ArrayList<>();
            if (color.equals("light")) {
                brand.add("Jack light");
                brand.add("Red Mouse");
            } else {
                brand.add("Jail pale");
                brand.add("Gout trout");
            }
            return brand;
    }
}
