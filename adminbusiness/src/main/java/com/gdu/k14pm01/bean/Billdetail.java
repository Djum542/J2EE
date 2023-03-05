package com.gdu.k14pm01.bean;

public class Billdetail {
    private int billdetailid;
    private int billid;
    private int product_id;
    private int price;
    private int quantity;
    public Billdetail(int billdetailid, int billid, int product_id, int price, int quantity) {
        this.billdetailid = billdetailid;
        this.billid = billid;
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
    }
    public Billdetail() {
    }
    public int getBilldetailid() {
        return billdetailid;
    }
    public void setBilldetailid(int billdetailid) {
        this.billdetailid = billdetailid;
    }
    public int getBillid() {
        return billid;
    }
    public void setBillid(int billid) {
        this.billid = billid;
    }
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
     
}
