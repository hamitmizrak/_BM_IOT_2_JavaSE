package com.hamitmizrak;

public enum _13_1_Enum {
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}


// Enumda: Herkes için tek bir anlama gelecek
// Type safe
// Haftada :7 gün
// Yıl: 12 ay
// small, medium, large



class EnumClassData{
    public static void main(String[] args) {
        _13_1_Enum days=_13_1_Enum.PERSEMBE;
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


