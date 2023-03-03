package com.gdu.k14pm01.bean;

public class CartItem {
    private String partNumber;
    private String modelDescription;
    private double dbUnitCost;
    private int iQuantity;
    private double totalCost;
    public void setDbUnitCost(double dbUnitCost) {
        this.dbUnitCost = dbUnitCost;
    }
    public double getDbUnitCost() {
        return dbUnitCost;
    }
    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }
    public String getModelDescription() {
        return modelDescription;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setiQuantity(int iQuantity) {
        this.iQuantity = iQuantity;
    }
    public int getiQuantity() {
        return iQuantity;
    }
}
