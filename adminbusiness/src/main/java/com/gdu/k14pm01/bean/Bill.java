package com.gdu.k14pm01.bean;

public class Bill {
    private int billid;
    private int user_id;
    private int total;
    public Bill(int billid, int user_id, int total) {
        this.billid = billid;
        this.user_id = user_id;
        this.total = total;
    }
    public Bill() {
    }
    public void setBillid(int billid) {
        this.billid = billid;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getBillid() {
        return billid;
    }
    public int getUser_id() {
        return user_id;
    }
    public int getTotal() {
        return total;
    }
    
}
