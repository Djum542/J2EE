package com.gdu.k14pm01.bean;

public class Productclothes {
    private int id;
    private String name;
    private String image;
    private String price;
    private String descripsion;
    
    public Productclothes() {
    }

    public Productclothes(int id, String name, String price, String descripsion) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descripsion = descripsion;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getDescripsion() {
        return descripsion;
    }
    public void setDescripsion(String descripsion) {
        this.descripsion = descripsion;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
public void setImage(String image) {
    this.image = image;
}
public String getImage() {
    return image;
}
}
