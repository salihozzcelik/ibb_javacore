package com.salihozcelik.Ornekler;

import java.util.Scanner; // Kullanıcıdan giriş almak için Scanner ekledik

public class Ornek2 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in); // Scanner nesnesi oluştur

        System.out.print("Lütfen Santigrat (°C) sıcaklık giriniz: ");
        double celsius = klavye.nextDouble(); // Kullanıcıdan Celsius değeri al

        // Fahrenheit hesaplama formülü: F = (C * 9/5) + 32
        double fahrenheit = (celsius * 9/5) + 32;

        // Sonucu ekrana yazdır
        System.out.println("Girilen sıcaklık: " + celsius + "°C");
        System.out.println("Fahrenheit karşılığı: " + fahrenheit + "°F");

        klavye.close(); // Scanner'ı kapat
    }
}
