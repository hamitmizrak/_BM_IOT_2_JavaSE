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
        for (int i = 0; i < 8 ; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt(4)+1;
            System.out.print(randomNum+" ");
            sum=sum+randomNum;
        }
        System.out.println("\nIterarive Toplam:" +sum);
    }

    // Dizide Sum
    public static void arrayRandomSum(){
        int sum=0;
        int[] array=new int[8];

        // Loop
        for (int i = 0; i < 8 ; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt(4)+1;
            array[i]=randomNum;
            sum=sum+array[i];
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("\nİlk Eleman :" +array[0]);
        System.out.println("Son Eleman :" +array[7]);
        System.out.println("Son Eleman :" +array[array.length-1]);
        System.out.println("Array Toplam:" +sum);
    }


        public static void main(String[] args) {
            //iterativeRandomSum();
            arrayRandomSum();
    }
}
