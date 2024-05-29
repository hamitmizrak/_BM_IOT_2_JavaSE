package com.hamitmizrak;

import java.util.Scanner;

/*
1 ile kullanıcının verdiği sayıya kadar toplama işlemi yapan Java algoritması , uygulama yapınız ?
bu sayılardan eğer 5 varsa toplamaya dahil edilmesin.
Toplama işlemi en üst limit 8 olacak şekilde kodlama yapınız.
Bu sayılardan çift olanların toplamı buluyorsunuz ?
Bu sayılardan tek olanların toplamı buluyorsunuz ?
1-2-3-4-6-7-8 = 31
*/
public class _11_2_For {
    public static void main(String[] args) {
        int sum = 0; // Toplamada etkisiz eleman: 0
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        int number = Math.abs(sc.nextInt());
        for (int i = 1; i <= number; i++) {
            if(i==5){
                System.out.println("sayılarda 5 sayısı var toplamaya dahil etme ");
                continue;
            }
            if(i>8)
                break;
            sum=sum+i;
        }
        System.out.println("Toplam Değer: "+sum);
        System.out.println("Çift Toplam Değer: ");
        System.out.println("Tek Toplam Değer: ");
    }
}
