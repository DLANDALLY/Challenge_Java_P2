package com.openclassrooms.store;

import com.openclassrooms.entities.enums.Brand;

public class Mouse {

    public Brand brand;
    public double price;

    public Mouse(Brand a, double b) {
        this.brand = a; // Updating brand field
        this.price = b; // Updating price field
    }

}
