package com.java.polimorfisme;

public class Main {

    public static void main(String[] args) {
	//Inisialisasi variable
        Marketplace mp1 = new Tokopedia();
        Marketplace mp2 = new Shopee();

        //Object tokopedia
        mp1.createOrder();
        mp1.payOrder(2, 100000, 10000);

        //Object Shopee
        mp2.createOrder();
        mp2.payOrder(3, 50000, 7000, 20000);
    }
}
