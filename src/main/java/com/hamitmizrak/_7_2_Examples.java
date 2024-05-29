package com.hamitmizrak;


import java.util.Scanner;

public class _7_2_Examples {

    public static void main(String[] args) {

        // Kullanıcı bir tuşa basmaya kadar program devam etmesin
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen devam etmek için her hangi bir bir tuşa basınız ... ");
        //scanner.nextLine(); // String dönderiyor. Scanner nesnesinde bekleme için ve alt satıra geçmesi için
        scanner.hasNextLine(); // booelan dönderiyor. Scanner nesnesinde bekleme için ve alt satıra geçmesi için
        System.out.println("devam edildi.");

    }
}
