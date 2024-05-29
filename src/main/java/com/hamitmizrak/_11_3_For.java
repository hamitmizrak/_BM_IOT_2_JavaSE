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
        System.out.println("\nToplam:" +sum);
    }
}
