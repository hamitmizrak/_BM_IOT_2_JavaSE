package com.hamitmizrak;

public class _10_4_SwitchCase {
    public static void main(String[] args) {
        // Conditional
        int number=555;

        switch (number){
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;
            case 5:
                System.out.println("sayı 5");
                break;
            default:
                System.out.println("1<=SAYI<=5 dışında bir değer girdiniz");
                break;
        }

    }
}
