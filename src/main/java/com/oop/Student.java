package com.oop;

/*3
Access Modifier(Erişim Belirleyici)
public, private, protected, -

public:  Bonkör
private: Cimri

Encapsulation: private
*/

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

// POJO: Plain Old Java Object: variable+Getter_and_setter
// BEAN: POJO+Constructor
// @Override
public class Student implements Serializable {

    // Serileştirme
    public final static Long serialVersionUID = 1L;

    // Variable
    private String name;
    private String surname;
    private String address;

    //Constructor
    /*
    Kurucu metottur.
    Class ismiyle aynı yazılır.
    return yapamazsınız.
    overloading yapabilirsiniz
    private Student(){} => bunda instance oluşturamazsınız.
    * */
    // Parametresiz (Constructor) => Kurucu Metotlar
    // this: Global Variable erişmek içindir.
    public Student() {
        this.name = "adınızı girmediniz";
        surname = "soyadınız girmediniz";
        this.address = "adresinizi girmediniz.";
    }

    // Parametreli (Constructor) => Kurucu Metotlar
    // Overloading
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // equals- HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address);
    }

    // Metotlar
    public void fullName() {
        System.out.println("adınız: " + this.name + " Soyadınız: " + this.surname);
    }

    // GETTER AND SETTER
    // Alt+Ins
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
} //end class
