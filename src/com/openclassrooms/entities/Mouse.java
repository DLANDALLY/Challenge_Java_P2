package com.openclassrooms.entities;

import com.openclassrooms.entities.enums.Brand;
import com.openclassrooms.store.Inventory;

public class Mouse extends Inventory {
    private double price;

    public Mouse() {
    }

    public Mouse(Brand brand, double price) {
        super(brand);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("price=").append(price);
        sb.append(", brand=").append(this.getBrand());
        sb.append('}');
        return sb.toString();
    }
}
