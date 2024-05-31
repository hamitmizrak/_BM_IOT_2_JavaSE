package com.collections;

import lombok.Getter;
import lombok.Setter;

// Type Safe
// List,Set,Map buralarda aktif kullanıyoruz.

public class GenericsTutorials<T> {

    @Getter @Setter
    //private String data;
    private T data;

    // parametresiz Constructor (Generics)
    public GenericsTutorials() {

    }

    // parametreli Constructor (Generics)
    public GenericsTutorials(T data) {
        this.data = data;
    }

    // Generics Method
    public <K> void deneme(String data1, K data2){
        System.out.println("generics method "+data1+" "+data2);
    }

    public static void main(String[] args) {
        GenericsTutorials tutorials=new GenericsTutorials();
        tutorials.setData("Hello World");
        System.out.println(tutorials.getData());
        tutorials.setData(44);
        System.out.println(tutorials.getData());
        tutorials.setData(44.23f);
        System.out.println(tutorials.getData());

        tutorials.deneme("Hello World", "Hello World");
        tutorials.deneme("Hello World", 44);
        tutorials.deneme("Hello World", 44.23f);
    }
}
