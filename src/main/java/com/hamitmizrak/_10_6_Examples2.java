package com.hamitmizrak;

/*
Radar Uygulaması
Hız 80-89 Km/S 1200 TL para cezası
Hız 90-99 Km/S 2500 TL para cezası
Hız 100-119 Km/S 3500 TL para cezası
Hız>=120 Km/S 8000 TL para cezası + Ehliyete el konulsun
*/
public class _10_6_Examples2 {
    public static void main(String[] args) {
        int speed =Math.abs(79);
        if (80 <= speed && speed <= 89) { // 80-89
            System.out.println("Hızınız: " + speed + " Para Cezası 1200 TL");
        } else if (90 <= speed && speed <= 99) { //90-99
            System.out.println("Hızınız: " + speed + " Para Cezası 2500 TL");
        } else if (100 <= speed && speed <= 119) { //100-119
            System.out.println("Hızınız: " + speed + " Para Cezası 3500 TL");
        } else if (speed >= 120) { //Hız>=120
            System.out.println("Hızınız: " + speed + " Para Cezası 8000 TL Ehliyete el konuldu");
        }else{
            System.out.println("Para cezası verilmedi");
        }
    }
}
