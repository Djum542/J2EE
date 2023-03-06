package com.gdu.k14pm01.bean;

public class CartItem {
    private String cart_id;
    private String product_id;
    private double product_name;
    private String product_image;
    private double product_price;
    private double total;
    private double quantity;
    public CartItem() {
	}
	public CartItem(String string, String string2, double double1, String string3, double double2, double double3,
            double double4) {
    }
    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }
    public String getCart_id() {
        return cart_id;
    }
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }
    public String getProduct_id() {
        return product_id;
    }
    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }
    public String getProduct_image() {
        return product_image;
    }
    public void setProduct_name(double product_name) {
        this.product_name = product_name;
    }
    public double getProduct_name() {
        return product_name;
    }
    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }
    public double getProduct_price() {
        return product_price;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getTotal() {
        return total;
    }
}
