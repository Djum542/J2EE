package com.gdu.k14pm01.bean;

public class Product {
    private int product_id;
    private int categori_id;
    private String product_name;
    private String product_image;
    private String product_price;
    private String product_description;
    public Product(int product_id, int categori_id, String product_name, String product_image, String product_price,
            String product_description) {
        this.product_id = product_id;
        this.categori_id = categori_id;
        this.product_name = product_name;
        this.product_image = product_image;
        this.product_price = product_price;
        this.product_description = product_description;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public void setCategori_id(int categori_id) {
        this.categori_id = categori_id;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }
    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public Product() {
    }
    public int getProduct_id() {
        return product_id;
    }
    public int getCategori_id() {
        return categori_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public String getProduct_image() {
        return product_image;
    }
    public String getProduct_price() {
        return product_price;
    }
    public String getProduct_description() {
        return product_description;
    }

    
}
