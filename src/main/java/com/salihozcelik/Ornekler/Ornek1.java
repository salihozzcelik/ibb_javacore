package com.salihozcelik.Ornekler;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        // Değişkenleri double olarak tanımlayalım
        double a, b, x;

        // Scanner nesnesi oluştur
        Scanner giris = new Scanner(System.in);

        // Kullanıcıdan a ve b değerlerini al
        System.out.print("A değerini giriniz: ");
        a = giris.nextDouble(); // Kullanıcıdan double değer al

        System.out.print("B değerini giriniz: ");
        b = giris.nextDouble(); // Kullanıcıdan double değer al

        // Denklem: ax + b = 0 olduğuna göre x'i hesapla
        if (a == 0) {
            System.out.println("Denklem geçersiz! a değeri 0 olamaz.");
        } else {
            x = -b / a; // x = -b / a formülü
            System.out.println("Denklemin çözümü: x = " + x);
        }

        // Scanner nesnesini kapat
        giris.close();
    }
}
