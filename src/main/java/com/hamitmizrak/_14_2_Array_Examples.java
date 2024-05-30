package com.hamitmizrak;

import java.util.Random;

/*
1 ile 4 arasında rastgele 8 tane sayının toplamını yapan Java algoritması , uygulama yapınız ?
*/
public class _14_2_Array_Examples {

    // İterative Sum
    public static void iterativeRandomSum(){
        int sum=0;

        // Loop
        for (int i = 1; i <=8 ; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt(4)+1;
            System.out.print(randomNum+" ");
            sum=sum+randomNum;
        }
        System.out.println("\nToplam:" +sum);
    }


    // Dizide Sum

        public static void main(String[] args) {
            iterativeRandomSum();
    }
}
