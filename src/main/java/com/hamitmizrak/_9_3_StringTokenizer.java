package com.hamitmizrak;

import java.util.StringTokenizer;

public class _9_3_StringTokenizer {
    public static void main(String[] args) {
        String name="adınız ";
        String surname="soyadınız ";
        String version="v1";

        // 1- Birleştirme (StringBuilder)
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(name).append(surname).append(version);
        String dataToString2=stringBuilder.toString();
        System.out.println(dataToString2);
        System.out.println("**********************************************");

        // Parçalama
        StringTokenizer stringTokenizer=new StringTokenizer(dataToString2);
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken().toUpperCase());
        }

    }
}
