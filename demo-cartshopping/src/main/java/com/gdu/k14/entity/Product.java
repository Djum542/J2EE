package com.gdu.k14.entity;

public class Product {
    private String id;
    private String model;
    private String description;
    private int quantity;
    private double price;
    private String image;
    public Product(String id, String model, String description, int quantity, double price, String image) {
        this.id = id;
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
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
