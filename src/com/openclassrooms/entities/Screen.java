package com.openclassrooms.entities;

import com.openclassrooms.entities.enums.Brand;

public class Screen {

    public Brand brand;
    public double price;
    public String resolution;

    public Screen(Brand a, double b, String c) {
        this.brand = a;
        this.price = b;
        this.resolution = c;
    }

}
