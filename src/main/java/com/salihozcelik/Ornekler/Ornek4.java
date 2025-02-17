package com.salihozcelik.Ornekler;

import java.util.Scanner;

// Kullanıcının Verdiği pozitif bir sayının Çift sayı mi? Yoksa Tek Sayı mi ? olduğunu hesaplayan Algoritma ?
public class Ornek4 {
    public static void main(String[] args) {
        Scanner kullanicisayi=new Scanner(System.in);
        System.out.print("Pozitif bir sayı girin: ");
        int sayi = kullanicisayi.nextInt();
        // Sayının pozitif olup olmadığını kontrol et
        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin!");
        } else {
            // Çift mi tek mi kontrol et
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayı çifttir.");
            } else {
                System.out.println("Girilen sayı tektir.");
            }
        }

        // Scanner nesnesini kapat
        kullanicisayi.close();

    }
}
