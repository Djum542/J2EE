package com.gdu.k14pm01.model;

import java.util.ArrayList;

import com.gdu.k14pm01.bean.CartItem;

public class Cartbean {
    private ArrayList<CartItem> allcart = new ArrayList<CartItem>();
    private double odertotal;
    public int getlineTimecout(){
        return allcart.size();
    }
    public void deleteCartItem(String strItemIndex){
        int itemIndex = 0;
        try {
            itemIndex = Integer.parseInt(strItemIndex);
            allcart.remove(itemIndex - 1);
            caculaterOrderTotal();
        } catch (NumberFormatException e) {
            System.out.println("Eror while deleting cart item" + e.getMessage());
            e.printStackTrace();
        }
    }
    public void updateCartItem(String strItemIndex, String strQuantity){
        double dbTotalCost = 0;
        double dbUnitCost = 0;
        int iQuantity = 0;
        int iItemIndex= 0;
        CartItem carti = null;
        try {
            iItemIndex = Integer.parseInt(strItemIndex);
            iQuantity = Integer.parseInt(strQuantity);
            if (iQuantity >0) {
                carti = (CartItem) allcart.get(iItemIndex- 1);
                // dbUnitCost = carti.getDbUnitCost();
                // dbTotalCost = dbUnitCost * iQuantity;
                // carti.setiQuantity(iQuantity);   
                // carti.setTotalCost(dbTotalCost);
                caculaterOrderTotal();
            } else {
                System.out.println("Khong co chuyen gi xay ra ca");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error while updating" + e.getMessage());
            e.printStackTrace();    
        }
        
    }
    public CartItem getCartItem(int iItemIndex){
        CartItem cartit = null;
        if (allcart.size() >iItemIndex) {
            cartit = (CartItem) allcart.get(iItemIndex);
        } else {
            System.out.println("");
        }
        return cartit;
    }
    public ArrayList<CartItem> getAllcart() {
        return allcart;
    }
    public void setOdertotal(double odertotal) {
        this.odertotal = odertotal;
    }
    public double getOdertotal() {
        return odertotal;
    }
    public void setAllcart(ArrayList<CartItem> allcart) {
        this.allcart = allcart;
    }
    protected void caculaterOrderTotal(){
        double dbTotal = 0;
        for(int couter = 0; couter<allcart.size(); couter++){
            CartItem cartItem = (CartItem) allcart.get(couter);
        }
        setOdertotal(dbTotal);
    }
    public void addCarting(String strModelno, String strDescrip, String strUnitcost, String strQuannity) {
        double dbTotalCost = 0;
        double dbUnitCost = 0;
        int iQuantity = 0;
        CartItem cartItem = new CartItem();
        try {
            dbUnitCost = Double.parseDouble(strUnitcost);
            iQuantity = Integer.parseInt(strQuannity);
            if (iQuantity>0) {
                dbTotalCost = dbUnitCost * iQuantity;
                // cartItem.setPartNumber(strModelno);
                // cartItem.setModelDescription(strDescrip);
                // cartItem.setDbUnitCost(dbUnitCost);
                // cartItem.setiQuantity(iQuantity);
                // cartItem.setDbUnitCost(dbUnitCost);
                // cartItem.setTotalCost(dbTotalCost);
                // allcart.add(cartItem);
                caculaterOrderTotal();
            } else {
                System.out.println("Khong co gi de hien");
            }
        } catch (NumberFormatException e) {
           System.out.println("Eror while parsing from String toprice" + e.getMessage());
           e.printStackTrace();
        }
        
        }
        public void addCarting(CartItem cartItems) {
            allcart.add(cartItems);
    }
}
