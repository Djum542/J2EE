package com.gdu.k14pm.model;

public class Product {
    private String id;
    private String model;
    private String descripsion;
    private int quantity;
    private double price;
    private String image;
    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }
    public String getDescripsion() {
        return descripsion;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
}
