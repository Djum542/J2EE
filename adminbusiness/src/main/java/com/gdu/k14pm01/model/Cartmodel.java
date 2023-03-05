package com.gdu.k14pm01.model;

import java.util.ArrayList;
import java.util.Set;

import com.gdu.k14pm01.bean.Cart;

public class Cartmodel {
    private ArrayList<Cart> allcart = new ArrayList<Cart>();
    private double odertotal;
    public int getLineItemCount(){
        return allcart.size();
    }
    public void deleteCartItem(String sstrItemIndex){
        int itemindex = 0;
        try {
            itemindex = Integer.parseInt(sstrItemIndex);
        } catch (NumberFormatException e) {// numberformatException chir xu ly cho ep kieu thoi
            // TODO: handle exception
            System.out.println("Error while deleteing" + e.getMessage());
            e.printStackTrace();
        }
    }
    public void updateCartItem(String strItemIndex, String strQuantity){
        double dbTotalCost = 0;
        double dbUnitCost = 0;
        int iQuantity = 0;
        int itemindex =0 ;
        Cart car = null;
        try {
            // ep kieu du lieu
            itemindex = Integer.parseInt(strQuantity);
            iQuantity = Integer.parseInt(strQuantity);
            if (iQuantity>0) {
                car = (Cart) allcart.get(itemindex - 1);
                dbUnitCost = car.getProduct_price();
                dbTotalCost = dbUnitCost * iQuantity;
                car.setQuantity(iQuantity);
                car.setTotal(itemindex);
                caculateOderTotal();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error while update cart" + e.getMessage());
            e.printStackTrace();
        }
    }
    public Cart getCartItem(int itemindex){
        Cart car = null;
        if (allcart.size()>itemindex) {
            car = (Cart) allcart.get(itemindex);

        }
        return car;
    }
    public void setAllcart(ArrayList<Cart> allcart) {
        this.allcart = allcart;
    }
    public ArrayList<Cart> getAllcart() {
        return allcart;
    }
    public double getOdertotal() {
        return odertotal;
    }
    public void setOdertotal(double odertotal) {
        this.odertotal = odertotal;
    }
    protected void caculateOderTotal(){
        double  dbTotal = 0;
        for (int count = 0; count < allcart.size(); count++) {
            Cart car = (Cart) allcart.get(count);
            dbTotal += car.getTotal();
        }
        setOdertotal(dbTotal);
    }
    public void addCartItem(int id, int pid,String strModel,int price,int quantity,int total, String strDescription, String strUnitcost, String strQuantity){
        double dbTotalCost = 0;
        double dbUnitCost = 0;
        int iQuantity = 0;
        Cart car = new Cart();
        try {
            // set kieu du lieu tu String thanh double
            dbUnitCost = Double.parseDouble(strQuantity);
            iQuantity = Integer.parseInt(strQuantity);
            if (iQuantity>0) {
                dbUnitCost = dbTotalCost * iQuantity;
                car.setCart_id(id);
                car.setProduct_id(pid);
                car.setProduct_name(strModel);
                car.setProduct_image(strQuantity);
                car.setProduct_price(price);
                car.setProduct_description(strDescription);
                car.setQuantity(iQuantity);
                car.setTotal(total);
                allcart.add(car);
                caculateOderTotal();
            }
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Error while add" + e.getMessage());
            e.printStackTrace();
        }
    }
    public void addCartItem(Cart car){
        allcart.add(car);
    }
}
