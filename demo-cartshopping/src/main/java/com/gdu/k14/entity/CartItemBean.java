package com.gdu.k14.entity;

import java.time.Period;

public class CartItemBean {
    private String strPartNumb;
    private String strModelDecription;
    private double dblUnitCost;
    private int iQuantity;
    private double dblTotalCost;
    public CartItemBean(String strPartNumb, String strModelDecription, double dblUnitCost, int iQuantity,
            double dblTotalCost) {
        this.strPartNumb = strPartNumb;
        this.strModelDecription = strModelDecription;
        this.dblUnitCost = dblUnitCost;
        this.iQuantity = iQuantity;
        this.dblTotalCost = dblTotalCost;
    }
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
    public void setStrModelDecription(String strModelDecription) {
        this.strModelDecription = strModelDecription;
    }
    public String getStrModelDecription() {
        return strModelDecription;
    }
    public void setStrPartNumb(String strPartNumb) {
        this.strPartNumb = strPartNumb;
    }
    public String getStrPartNumb() {
        return strPartNumb;
    }
    public void setiQuantity(int iQuantity) {
        this.iQuantity = iQuantity;
    }
    public int getiQuantity() {
        return iQuantity;
    }
    
}
