package com.hamitmizrak;

import java.util.Random;

public class _5_3_Cast {


    // Cast: Dönüşüm
    public static void main(String[] args) {
        // Tam sayı => Kelimeler
        // Kelimeler => Tam sayı

        int number1=44;
        int random= new Random().nextInt(20)+1;
        System.out.println(random+16);
        System.out.println(number1+16);

        // String => Integer
        String vocabulary1="44";
        // 1.YOL (Wrapper Type)
        int stringToInteger1=Integer.valueOf(vocabulary1);
        // 2.YOL (Primitive Type)
        int stringToInteger2=Integer.parseInt(vocabulary1);
        System.out.println(vocabulary1+16);
        System.out.println(stringToInteger1+16);
        System.out.println(stringToInteger2+16);
        System.out.println("////////////////////////////////////////");

        //  Integer =>  String
        int number3=20;
        // 1.YOL (Wrapper Type)
        String integerToString1=String.valueOf(number3);
        System.out.println(integerToString1+10);
        // 2.YOL (Wrapper Type)
        String integerToString2=Integer.toString(number3);
        System.out.println(number3+10);
        System.out.println(integerToString2+10);


    }
}
