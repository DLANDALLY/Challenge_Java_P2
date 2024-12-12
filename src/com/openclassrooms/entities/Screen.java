package com.openclassrooms.entities;

import com.openclassrooms.entities.enums.Brand;
import com.openclassrooms.store.Inventory;

public class Screen extends Inventory {
    private double price;
    private String resolution;

    public Screen() {
    }

    public Screen(Brand brand, double price, String resolution) {
        super(brand);
        this.price = price;
        this.resolution = resolution;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Screen{");
        sb.append("price=").append(price);
        sb.append(", resolution='").append(resolution).append('\'');
        sb.append(", brand=").append(this.getBrand());
        sb.append('}');
        return sb.toString();
    }

}
