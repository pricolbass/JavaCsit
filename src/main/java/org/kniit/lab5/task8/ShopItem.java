package org.kniit.lab5.task8;

import java.util.Objects;

public class ShopItem {
    private String name;
    private int price;
    private int quantity;

    public ShopItem(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ShopItem(String name) {
        this.name = name;
        this.price = 0;
        this.quantity = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShopItem shopItem = (ShopItem) obj;
        return price == shopItem.price &&
                quantity == shopItem.quantity &&
                Objects.equals(name, shopItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }
}