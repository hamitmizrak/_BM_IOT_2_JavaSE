package com.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher  implements Serializable {

    // Serileştirme
    public final static Long serialVersionUID = 1L;

    // Variable
    private String name;
    private String surname;
    private String address;

    // Metotlar
    public void fullName() {
        System.out.println("adınız: " + this.name + " Soyadınız: " + this.surname);
    }
}
