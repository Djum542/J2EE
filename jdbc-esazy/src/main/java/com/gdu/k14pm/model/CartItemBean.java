package com.gdu.k14pm.model;

public class CartItemBean {
    private String strPartNumber;
    private String strMoudleDecription;
    private double dblUnitCost;
    private int iQuantity;
    private double dblTotalCost;
    public void setDblTotalCost(double dblTotalCost) {
        this.dblTotalCost = dblTotalCost;
    }
    public double getDblTotalCost() {
        return dblTotalCost;
    }
    public void setDblUnitCost(double dblUnitCost) {
        this.dblUnitCost = dblUnitCost;
    }
    public double getDblUnitCost() {
        return dblUnitCost;
    }
    public void setStrMoudleDecription(String strMoudleDecription) {
        this.strMoudleDecription = strMoudleDecription;
    }
    public String getStrMoudleDecription() {
        return strMoudleDecription;
    }
    public void setStrPartNumber(String strPartNumber) {
        this.strPartNumber = strPartNumber;
    }
    public String getStrPartNumber() {
        return strPartNumber;
    }
    public void setiQuantity(int iQuantity) {
        this.iQuantity = iQuantity;
    }
    public int getiQuantity() {
        return iQuantity;
    }
}
