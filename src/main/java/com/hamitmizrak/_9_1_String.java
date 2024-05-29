package com.hamitmizrak;

public class _9_1_String {
    public static void main(String[] args) {

        // primitive type
        // Tam sayılar ==>  byte < short <int< long
        // Virgüllü sayılar => float< double
        // booelan
        // char => 'Q'

        // sayılarda iki değeri karşılaştırma yaparken == kullanırız.
        // kelimeler iki değeri karşılaştırma yaparken equals kullanırız.

        // String: Kelimeler
        String value="java ÖĞReniyorum java ";
        System.out.println(value);
        System.out.println(value.length());
        System.out.println(value.trim().length());

        // Karakter büyük veya küçük
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());

        // indexOf(Seach): Sayı Sıfırdan saymaya başlar(0)
        System.out.println(value.indexOf("java"));
        System.out.println(value.lastIndexOf("java"));

        System.out.println(value.concat("-INC"));

        // charAt():  Sıfırdan saymaya başlar(0)
        System.out.println(value.charAt(0));

        // Parçalama
        System.out.println(value.substring(1));
        System.out.println(value.substring(1,3)); // 1<=KELIME<3-1

        System.out.println("Kelime içinde geçiyor mu? "+value.contains("ÖĞReniyorum"));
        System.out.println(value.replace(value,"-değiştirdim"));

        // başlangıç-bitiş
        System.out.println("ile başlıyor mu ? "+value.startsWith("java"));
        System.out.println("ile bitti mu ? "+value.endsWith(" "));

        System.out.println("String benzet ? "+value.toString());

        // sayılarda iki değeri karşılaştırma yaparken == kullanırız.
        // kelimeler iki değeri karşılaştırma yaparken equals kullanırız.

        String name="docker";
        System.out.println("Eşit mi ? "+value.equals(name));
        System.out.println("Eşit değil mi ? "+( !value.equals(name) ));
        System.out.println("Değer boş mu ? "+value.isEmpty());
    }
}
