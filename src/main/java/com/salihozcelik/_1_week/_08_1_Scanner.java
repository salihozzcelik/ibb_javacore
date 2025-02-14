package com.salihozcelik._1_week;

import java.util.Scanner;

public class _08_1_Scanner {
    public static void main(String[] args) {

        //Field
        String name, surname;
        int language;
        // kulllanıcıdan veri almak istiyorsak
        Scanner klavye= new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz: ");
        name=klavye.next();
        klavye.nextLine();

        System.out.println("lütfen soyadınızı giriniz: ");
        surname=klavye.nextLine();

        System.out.println("bildiğiniz diller");
        language=klavye.nextInt();

        System.out.println("adınız:"+name+" soyadınız:"+surname+""+"\ndiller"+language);
        //kullanmadığım scanner nesnesini kapatalım
        klavye.close();

    }
}
