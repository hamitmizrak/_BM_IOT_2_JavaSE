package com.hamitmizrak;

public class _9_2_StringBuilder {
    public static void main(String[] args) {
        String name="adınız ";
        String surname="soyadınız ";
        String version="v1";

        // 1- Birleştirme (+)
        String plusOperant=name+surname+version;
        System.out.println(plusOperant);

        // 2- Birleştirme (Concat)
        String concatOperant=name.concat(surname).concat(version);
        System.out.println(concatOperant);

        // 3- Birleştirme (StringBuffer)
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(name).append(surname).append(version);
        String dataToString1=stringBuffer.toString();
        System.out.println(dataToString1);

        // 4- Birleştirme (StringBuilder)
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(name).append(surname).append(version);
        String dataToString2=stringBuilder.toString();
        System.out.println(dataToString2);

    }
}
