package com.java.polimorfisme;

public class Shopee extends Marketplace{
    //Override
    @Override
    public void createOrder(){
        System.out.println("Order Shopee berhasil dibuat");
    }
}
