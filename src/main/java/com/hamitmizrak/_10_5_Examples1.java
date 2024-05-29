package com.hamitmizrak;

import java.util.Scanner;

// Password -Repassword
// Kullanıcıdan şifre ve şifre tekrarı alalım.
// Bu iki değeri karşılaştıralım.
// Eğer aynı ise Şifreler doğrudur
// Eğer aynı değilse Şifreler farklıdır.
public class _10_5_Examples1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password,rePassword;

        //for(;;){   // Sonsuz Döngü
        while(true){ // Sonsuz Döngü
            System.out.println("\nLütfen şifre giriniz");
            password=scanner.nextLine();

            System.out.println("Lütfen şifrenizi tekrar giriniz");
            rePassword=scanner.nextLine();
            if(password.equals(rePassword)){
                System.out.println("Şifreler tutarlı");
            }else{
                System.out.println("Şifreler farklıdır. Tekrar giriniz");
            }
        }
    }
}
