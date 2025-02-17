package com.salihozcelik.Ornekler;

import java.util.Scanner;

// Kullanıcının Verdiği bir sayının pozitif mi? Negatif mi ? olduğunu hesaplayan Algoritma ?

public class Ornek3 {
    public static void main(String[] args) {
        Scanner kullanicisayi= new Scanner(System.in);
        System.out.println("Sayı Girin: ");
        double sayi= kullanicisayi.nextDouble();

        if (sayi>0){
            System.out.println("Sayı pozitif");
        } else if (sayi<0) {
            System.out.println("Sayı Negatif");
            
        }else {
            System.out.println("Girilen sayı sıfır");
        }
        kullanicisayi.close();
    }
}
