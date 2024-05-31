package com.oop;

public class MainObject {
    public static void main(String[] args) {
        // parametresiz Student Instance
        Student student1= new Student();
        student1.setName("Hamit");
        student1.setSurname("Mızrak");
        student1.fullName();
        System.out.println(student1);

        System.out.println("*********************");
        // parametreli Student Instance
        Student student2= new Student("name1","surname1");
        student2.fullName();
        System.out.println(student2);

        System.out.println("*********************");
        // parametreli Student Instance
        Student student3= new Student("name2","surname2","address2");
        student3.fullName();
        System.out.println(student3);
    }
}
