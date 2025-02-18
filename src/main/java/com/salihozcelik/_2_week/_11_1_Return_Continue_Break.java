package com.salihozcelik._2_week;

import java.util.Scanner;

// Kullanıcının Verdiği pozitif bir sayıya kadar toplamını hesaplayan algoritma
// Şartlar:
// 1. Kullanıcı eğer 100'den fazla bir sayı girerse, 100'e kadar toplasın (break).
// 2. Kullanıcının verdiği sayılar içinde 47 varsa, bunu toplamaya dahil etmesin (continue).
// 3. Kullanıcının Verdiği pozitif bir sayının Çift mi? Yoksa Tek mi? olduğunu hesaplayan algoritma.

public class _11_1_Return_Continue_Break {
    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);

        // Kullanıcıdan pozitif bir sayı alma
        System.out.print("Bir pozitif sayı giriniz: ");
        int sayi = Math.abs(kullanici.nextInt());

        int sum = 0;
        for (int i = 1; i <= sayi; i++) {
            //Eğer 47 varsa toplama
            if (i == 47) {
                System.out.println("verdiğiniz sayıda 47 olduğunu için bunu toplamaya dahil etmiyoruz");
                continue; // 47 toplama dahil etme

            }
            if (i > 100) {
                System.out.println("verdiğiniz sayı 100den büyük olduğu için sadece 1<=SAYI<100 KADAR toplama yapailir");
                break; // 100den sonra toplamı durdur

            }
            sum += i;
        }
        System.out.println("toplam " + sum);

        // Çıkan sonuç çift mi tek mi
        if (sum % 2 == 0)
            System.out.println(sum + " sayı çift");
        else
            System.out.println(sum + " sayı tek");

        kullanici.close();


        // Negatif veya sıfır kontrolü

    }
}

