package com.hamitmizrak;

import java.util.Scanner;

/*
Girilen ifade
sayı mı ?
Harf mi ?
yoksa özel ifade mi
*/
public class    _10_6_Examples3 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        while (true) {
            System.out.println("\nLütfen bir sayı veya harf veya özel simge giriniz");
            char data = klavye.nextLine().charAt(0);//
            if (Character.isDigit(data)) {
                System.out.println("Bu bir sayıdır");
            } else if (Character.isLetter(data)) {
                System.out.println("bu bir harf'tir");
            } else {
                System.out.println("bu bir özel karakterdir");
            }
        } //end while
    }
}
