package com.salihozcelik.Ornekler;

import java.util.Scanner;

// Kullanıcının Verdiği pozitif bir sayıya kadar toplamını yapan hesaplayan algoritma
// Şartlar:
// 1. Kullanıcı eğer 100'den fazla bir sayı girerse, 100'e kadar toplasın (break).
// 2. Kullanıcının verdiği sayılar içinde 47 varsa, bunu toplamaya dahil etmesin.

public class Ornek5 {
    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);

        // Kullanıcıdan pozitif bir sayı alma
        System.out.print("Bir pozitif sayı giriniz: ");
        int sayi = kullanici.nextInt();

        // Negatif veya sıfır kontrolü
        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz!");
        } else {
            int toplam = 0;

            // Eğer sayı 100'den büyükse, 100'e kadar olan sayıları topla
            if (sayi > 100) {
                sayi = 100; // Kullanıcı 100'den büyük girerse, 100'e kadar toplama yapacağız.
            }

            // 1'den girilen sayıya kadar olan toplamı hesapla
            for (int i = 1; i <= sayi; i++) {
                if (i == 47) {
                    continue; // 47 varsa toplamaya dahil etme
                }
                toplam += i; // Sayıyı toplama ekle
            }

            // Sonucu ekrana yazdır
            System.out.println("Girilen sayıya kadar olan toplam (47 hariç): " + toplam);
        }

        // Scanner nesnesini kapat
        kullanici.close();
    }
}
