package com.hamitmizrak;

public class _12_1_Method {
    public static void main(String[] args) {

        System.out.println("*** For ********************");
        for (int i = 1; i <= 10; i++) {// i++  i=i+1  i+=1
            System.out.print(i + " ");
        }

        System.out.println("\n*** While ********************");
        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }

        System.out.println("\n*** do-while ********************");
        int x = 1;
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 10);

    }
}
