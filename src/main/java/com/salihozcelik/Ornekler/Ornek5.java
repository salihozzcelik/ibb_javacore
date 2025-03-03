package com.salihozcelik.Ornekler;


import com.salihozcelik.utils.SpecialColor;

import java.util.Scanner;

/*
Kullanıcıdan Girilen Sayının Faktoriyelini Bulma
Soru: Kullanıcıdan bir tam sayı alarak faktöriyelini hesaplayan iterative ve recursive metota göre programı yazınız.

 */
public class Ornek5 {
    public static void main(String[] args) {

        // variables değişken
        long number, result = 1;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz: ");
        number = scanner.nextLong();

        if (number < 0) {
            System.out.println(SpecialColor.RED + "Sıfırdan küçük bir satı giriniz: " + SpecialColor.RESET);
            number = Math.abs(number);

        } else if (number == 0) {
            System.out.println(number + SpecialColor.BLUE + " sayısının faktöriyeli 1");
            result = 1;


        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;

            }
            System.out.println(number + SpecialColor.YELLOW + " sayısının " + number + " !=" + result + SpecialColor.RESET);
        }
    }
}
