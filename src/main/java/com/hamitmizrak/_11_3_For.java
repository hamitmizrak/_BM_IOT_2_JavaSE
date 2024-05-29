package com.hamitmizrak;

import java.util.Random;

/*
1 ile 9 arasında rastgele 8 tane sayının toplamını yapan Java algoritması , uygulama yapınız ?
*/
public class _11_3_For {
    public static void main(String[] args) {
        int sum=0;

        // Loop
        for (int i = 1; i <=8 ; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt(9)+1;
            System.out.print(randomNum+" ");
            sum=sum+randomNum;
        }
        //System.out.println("\nToplam:" +sum);

        System.out.println("\n*******************");
        // Formatter
        String str="Java öğreniyorum";
        int number=44;
        float floatingPoint=23.45f;
        System.out.printf("%s %d %f",str,number,floatingPoint);
        System.out.println("\n");
        System.out.printf("%30s %d %f",str,number,floatingPoint);
        System.out.println("\n");
        System.out.printf("%30s %30d %f",str,number,floatingPoint);
        System.out.println("\n");
        System.out.printf("%30s %30d %2.3f",str,number,floatingPoint);
        System.out.println("\n");
        System.out.printf("%-10s %-10d %2.3f",str,number,floatingPoint);
    }
}

// Enumda: Herkes için tek bir anlama gelecek
// Type safe
// Haftada :7 gün
// Yıl: 12 ay
// small, medium, large

enum Days{
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}

class EnumClassData{
    public static void main(String[] args) {
        Days days=Days.PERSEMBE;
        System.out.println(days);

        // String
        System.out.println(days.toString().toLowerCase());
        String data=days.toString().toLowerCase();
        System.out.println(data);


        System.out.println("Sıra No:"+days.PAZARTESI.ordinal());
        System.out.println("Value No:"+days.PAZARTESI.values()[0]);
        System.out.println("İlk değer:"+days.values()[0]);

    }
}





