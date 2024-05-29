package com.hamitmizrak;

public class _12_1_Method {

    // 1-) voidliParametresiz
    public void voidliParametresiz(){
        System.out.println("voidli Parametresiz");
    }

    // 2-) voidliParametreli
    public void voidliParametreli(String name){
        System.out.println("voidli Parametreli "+name);
    }

    // 3-) returnluParametresiz
    public String returnluParametresiz(){
        return "returnlu Parametresiz";
    }

    // 4-) returnluParametreli
    public String returnluParametreli(String name,String surname){
        return "returnlu Parametreli "+name+" "+surname;
    }

    // Overloading
    public String returnluParametreli(String name){
        return "returnlu Parametreli "+name;
    }


    public static void main(String[] args) {
        // instance
        _12_1_Method obj = new _12_1_Method();
        obj.voidliParametresiz();
        obj.voidliParametreli(" ismim");

        String data1= obj.returnluParametresiz();
        System.out.println(data1);

        String data2= obj.returnluParametreli("isim","soyisim");
        System.out.println(data2);

        String data3= obj.returnluParametreli("isim");
        System.out.println(data3);

        // static
        // final
    }
}
