package com.ug3.soal1;
import java.util.Scanner;

import java.io.Console;
class UG3soal1{
    public static void main(String[] args) {
        String namaMakanan, tglKaldaluarsa;
        int jumlah, berat;

        Scanner Product = new Scanner(System.in);


        System.out.println("============ DATA PRODUCT =============");
        System.out.println("Masukan Data Product Makanan Anda");

        System.out.print("Nama Makanan: ");
        namaMakanan = Product.nextLine();

        System.out.print("Tanggal Kaldaluarsa : ");
        tglKaldaluarsa = Product.nextLine();

        System.out.print("Jumlah (quantity) : ");
        jumlah = Product.nextInt();

        System.out.print("Berat (gram) : ");
        berat = Product.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("============ DATA PRODUCT =============");
        System.out.println("Nama Makanan : " + namaMakanan);
        System.out.println("Tanggal Kaldaluarsa :" + tglKaldaluarsa);
        System.out.println("Jumlah (quantity) : " + jumlah);
        System.out.println("Berat : " + berat + "gram");
        System.out.println("========================================");
    }

}


