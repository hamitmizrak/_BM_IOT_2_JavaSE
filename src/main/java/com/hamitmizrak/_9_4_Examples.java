package com.hamitmizrak;

// Kullanıcıdan aldığınız isim ve soyisimi birleştirsin ?
// Kullanıcıdan aldığınız ismin ilk karakterini Büyük harf ve soyismin hepsi büyük karakter olsun  ?

import java.util.Scanner;

public class _9_4_Examples {
    public static void main(String[] args) {
        String name,surname,plus;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen adınız Giriniz");
        name=scanner.nextLine();
        //name=name.charAt(0)

        System.out.println("Lütfen soyadınız Giriniz");
        surname=scanner.nextLine().toUpperCase();
        //surname=surname.toUpperCase();

        plus=name+surname;
        //plus=name.concat(surname);
        System.out.println(plus);

    }
}
