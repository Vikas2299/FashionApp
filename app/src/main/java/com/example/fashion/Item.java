package com.example.fashion;

public class Item {
    private String name;
    private String picture;
    private double cost;

    public Item(String name, String picture, double cost) {
        this.name = name;
        this.picture = picture;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

