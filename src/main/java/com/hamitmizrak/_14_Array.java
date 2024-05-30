package com.hamitmizrak;

import java.util.Arrays;

// Array
/*
Array sıfırdan başlar saymaya
Array eleman sayısını başlangıçta göstermeliyiz.
*/
public class _14_Array {

    // Metot
    public static void arrayMethod(){
        // 10 elemanlı bir dizi
       /* int[] array=new int[9];
        //Integer[] array=new Integer[9];
        array[0]=9;
        array[1]=1;
        array[2]=4;
        array[3]=3;
        array[4]=5;
        array[5]=6;
        array[6]=7;
        //array[7]=8;
        array[8]=9;*/

        // Array Dizi tanımlamak
        int[] array={9,1,4,2,5,6,7,8,1};

        System.out.println("Eleman sayısı: "+array.length);
        System.out.println("HashCode : "+array.hashCode());

        // Iterative For Loop
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n****************");

        Arrays.sort(array);

        // ForEach Loop
        for(int temp:array){
            System.out.print(temp+" ");
        }
    }

    public static void main(String[] args) {
        // 1.YOL (metoda static yazmamak)
       /* _14_Array data=new _14_Array(); //instance
        data.arrayMethod();*/

        // 2.YOL
        arrayMethod();
    }
}
