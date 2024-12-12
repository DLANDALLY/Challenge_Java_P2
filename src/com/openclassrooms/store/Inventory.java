package com.openclassrooms.store;

import com.openclassrooms.entities.Mouse;
import com.openclassrooms.entities.Screen;
import com.openclassrooms.entities.enums.Brand;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Brand brand;

    private Map<Object, Integer> inventory = new HashMap<>();

    public Inventory() {
    }

    public Inventory(Brand brand) {
        this.brand = brand;
    }

    /**
     * Add inventory
     * @param o Object
     * @param i Integer
     */
    public void addItem(Object o, int i) {
        this.inventory.put(o, i);
    }

    /**
     * Remove inventory
     * @param o Object
     * @param i Integer
     */
    public void removeItem(Object o, int i) {
        int value = this.inventory.get(o) - i;

        if(value <= 0) this.inventory.remove(o);
        else addItem(o, value);

    }

    /**
     * Display the inventory on console
     */
    public void displayInventoryOnConsole() {
        this.inventory.forEach((k, v)-> System.out.println(k +": " + v));
    }

    public void displayItemsOnConsole() {
        //this.inventory.forEach((k, v)-> System.out.println(k +": " + v));
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
