package com.java.polimorfisme;

public class Marketplace {

    //Variable global
    double grandTotal;

    //Method Order
    public void createOrder(){
        System.out.println("Buat Order");
    }

    //Method Payment
    public void payOrder(int jumlahProduk, double harga){
        grandTotal = jumlahProduk*harga;
        System.out.println(grandTotal);
    }

    //Method payment tokopedia overloading
    public void payOrder(int jumlahProduk, double harga, double ongkir){
        grandTotal = (jumlahProduk*harga) + ongkir;
        System.out.println(grandTotal);
    }

    //Method payment shopee overloading
    public void payOrder(int jumlahProduk, double harga, double ongkir, double diskon){
        grandTotal = (jumlahProduk*harga) + ongkir - diskon;
        System.out.println(grandTotal);
    }
}
