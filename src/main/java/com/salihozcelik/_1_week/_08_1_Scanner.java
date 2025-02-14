package com.salihozcelik._1_week;

import java.util.Scanner;

public class _08_1_Scanner {
    public static void main(String[] args) {

        //Field
        String name, surname;
        // kulllanıcıdan veri almak istiyorsak
        Scanner klavye= new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz: ");
        name=klavye.nextLine();

        System.out.println("lütfen soyadınızı giriniz: ");
        surname=klavye.nextLine();

        System.out.println("adınız:"+name+" soyadınız:"+surname);
        //kullanmadığım scanner nesnesini kapatalım
        klavye.close();

    }
}
