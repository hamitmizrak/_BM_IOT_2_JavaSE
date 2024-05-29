package com.hamitmizrak;

public class _9_5_Formatter {
    public static void main(String[] args) {
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
        // -10s:SOLA
        // +10s:SAĞA
    }
}
