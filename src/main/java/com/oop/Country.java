package com.oop;

/*
Inner Class: Class içinde class demektir.
javada 1 tane public vardır (inner class hariç)
javada static class yazamazsınız (inner class hariç)
 */

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Country {
    private String countryName;

    // İç Class
    @Getter @Setter
    public static class City{
        private String cityName;
    }
}

// Main
class MainInnerClass{
    public static void main(String[] args) {
        Country country=new Country();
        country.setCountryName("Türkiye");

        Country.City city=new Country.City();
        city.setCityName("İstanbul");

        System.out.println("Ülke: "+country.getCountryName()+" Şehir: "+city.getCityName());
    }
}
