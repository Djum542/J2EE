package com.gdu.k14pm01.bean;

public class Cart {
    private int cart_id;
    private int product_id;
    private String product_name;
    private String product_image;
    private int product_price;
    private String product_description;
    private int total;
    private int quantity;
    public Cart(int cart_id, int product_id, String product_name, String product_image, int product_price,
            String product_description, int total, int quantity) {
        this.cart_id = cart_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_image = product_image;
        this.product_price = product_price;
        this.product_description = product_description;
        this.total = total;
        this.quantity = quantity;
    }
    public Cart() {
    }
    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }
    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getCart_id() {
        return cart_id;
    }
    public int getProduct_id() {
        return product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public String getProduct_image() {
        return product_image;
    }
    public int getProduct_price() {
        return product_price;
    }
    public String getProduct_description() {
        return product_description;
    }
    public int getTotal() {
        return total;
    }
    public int getQuantity() {
        return quantity;
    }
    
}
