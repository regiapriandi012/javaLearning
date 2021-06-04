package com.latihan;

public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        Store cookieShop = new Store("cookies", 12, 3.75);
        System.out.println("Product Type = " + cookieShop.productType);
        System.out.println("Count of Product = " + cookieShop.inventoryCount);
        System.out.println("Price of Product = " + cookieShop.inventoryPrice);
        System.out.println(cookieShop);
    }

    public String toString() {
        return "this is " + productType + " and the count is " + inventoryCount + " for price Rp." + inventoryPrice;
    }
}