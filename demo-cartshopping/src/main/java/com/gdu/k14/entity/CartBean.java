package com.gdu.k14.entity;

import java.util.ArrayList;

public class CartBean {
    private ArrayList<CartItemBean> alCart = new ArrayList<CartItemBean>();
    private double dblOderTotal;
    public CartBean(ArrayList<CartItemBean> alCart, double dblOderTotal) {
        this.alCart = alCart;
        this.dblOderTotal = dblOderTotal;
    }
    public int getLineItemCount() {
        return alCart.size();
        
    }
    public void deleteCartItem(String strItemIndex) {
        int iTemIndex = 0;
        try {
            iTemIndex = Integer.parseInt(strItemIndex);
            alCart.remove(iTemIndex - 1 );
            caculateOrderTotal();
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Error while deleting cart"+e.getMessage());
            e.printStackTrace();
        }
    }
    public void updateCartItem(String strItemIndex, String strQuantity) {
        double dblTotalCost =  0.0;
        double dblUnitCost = 0.0;
        int iQuantity = 0;
        int itemindex = 0;
        CartItemBean cartItem = null;
        try {
            itemindex = Integer.parseInt(strItemIndex);
            iQuantity = Integer.parseInt(strQuantity);
            if (iQuantity > 0 ) {
                cartItem = (CartItemBean) alCart.get(itemindex - 1);
                dblUnitCost = cartItem.getDblUnitCost();
                dblTotalCost = dblUnitCost * iQuantity;
                cartItem.setiQuantity(iQuantity);
                cartItem.setDblTotalCost(dblTotalCost);
                caculateOrderTotal();
            }
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Error while updating"+e.getMessage());
            e.printStackTrace();
        }
    }
    public void addCartItem(String strModel, String strstrUnit, String strQuantity) {
        double dblTotalCost = 0.0;
        double dblUnitCost = 0.0;
        int iQuantity = 0;
        CartItemBean cartItem = new CartItemBean(strQuantity, strModel, dblUnitCost, getLineItemCount(), dblTotalCost);
        try {
            dblUnitCost = Double.parseDouble(strQuantity);
            iQuantity = Integer.parseInt(strQuantity, getLineItemCount(), getLineItemCount(), getLineItemCount());
            if(iQuantity > 0){
                dblTotalCost = dblUnitCost * iQuantity;
                cartItem.setStrPartNumb(strQuantity);
                cartItem.setDblUnitCost(dblUnitCost);
                cartItem.setStrModelDecription(strModel);
                cartItem.setiQuantity(iQuantity);
                cartItem.setDblTotalCost(dblTotalCost);
                alCart.add(cartItem);
                caculateOrderTotal();
            }
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Error while parsing "+e.getMessage());
            e.printStackTrace();
        }
    }
    public void addCartItem(CartItemBean cartitem) {
        alCart.add(cartitem);
    }
    public CartItemBean getCartItem(int itemindex) {
        CartItemBean cartitem = null;
        if (alCart.size() > itemindex) {
            cartitem = (CartItemBean) alCart.get(itemindex);

        }
        return cartitem; 
        
    }
    public ArrayList<CartItemBean> getCartItem() {

        return alCart;

    }
    public void setCartItem(ArrayList<CartItemBean> alCartItem) {
        
    }
    public double getOrderItem() {
        return dblOderTotal;
        
    }
    public void setOrderTotal(double dtOrderTotal) {
        
    }
    protected void caculateOrderTotal() {
        double dblTotal = 0;
        for (int i = 0; i < alCart.size(); i++) {
            CartItemBean cartItem = (CartItemBean) alCart.get(i);
            dblTotal += cartItem.getDblTotalCost();
        }
        setOrderTotal(dblTotal);
    }
}
