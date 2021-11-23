package com.upgrad.practice.StreamAPI;


import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        Products p1 = new Products(1, "Mobile", 35000f);
        Products p2 = new Products(2, "Camera", 65000f);
        Products p3 = new Products(3, "Tablet", 20000f);
        Products p4 = new Products(4, "Headphones", 10000f);
        Products p5 = new Products(5, "Smart Watch", 15000f);

        List<Products> productsList = new ArrayList<>();

        productsList.add(p1);
        productsList.add(p2);
        productsList.add(p3);
        productsList.add(p4);
        productsList.add(p5);
        System.out.println("List of products first 4 products");
        /* Filter operation without Stream API
        for(Products p : productsList){
            if(p.productPrice <= 50000f){
                System.out.println(p.productID + ":" + p.productName);
            }
        }*/
        //Filter operation with Stream API
        /*List<Products> productsStream = productsList.stream().filter(products -> products.productPrice <= 60000f).collect(Collectors.toList());
        productsStream.forEach(products -> {
            System.out.println(products.productID + " : " + products.productPrice);
        });
        */
        //reduce operation to calculate the cart Total
        List<Products> products = productsList.stream().filter(item -> item.productID <= 4).collect(Collectors.toList());
        products.forEach(prod -> {
            System.out.println(prod.productID + " : " + prod.productPrice);
        });



    }
}

class Products{

    int productID;
    String productName;
    float productPrice;

    public Products(int productID, String productName, float productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
