package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListData {

    // ArrayListData
    public static void ArrayListData(){
        //List<Integer> list = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(6);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: "+list.size());
        System.out.println("İlk Eleman: "+list.get(0));
        System.out.println("Son Eleman: "+list.get(4));
        System.out.println("Son Eleman: "+list.get(list.size()-1));
        System.out.println("hashCode: "+list.hashCode());
        System.out.println("Boş mu: "+list.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        // Arama
        if(list.indexOf(6)>0){
            System.out.println("6 vardır ve soldan indis numarası "+list.indexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        // Arama
        if(list.lastIndexOf(6)>0){
            System.out.println("6 vardır ve sağdan indis numarası "+list.lastIndexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        System.out.println("6 içeriyor mu ? "+ list.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? "+ list.equals(list));

        System.out.println("String'e Çevir: "+ list.toString());
        System.out.println("String'e Çevir: "+ list.toString().substring(0,3));

        System.out.println("Listeden sadece istediğim indisi getirsin: "+ list.subList(0,3)); // 0<=DATA<=3-1

        System.out.println("Listeyi Diziye çevir: "+ list.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: "+ list.toArray().length); // 0<=DATA<=3-1

    }

    // ArrayListData
    public static void LinkedListData(){
        //List<Integer> list = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(6);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: "+list.size());
        System.out.println("İlk Eleman: "+list.get(0));
        System.out.println("Son Eleman: "+list.get(4));
        System.out.println("Son Eleman: "+list.get(list.size()-1));
        System.out.println("hashCode: "+list.hashCode());
        System.out.println("Boş mu: "+list.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        // Arama
        if(list.indexOf(6)>0){
            System.out.println("6 vardır ve soldan indis numarası "+list.indexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        // Arama
        if(list.lastIndexOf(6)>0){
            System.out.println("6 vardır ve sağdan indis numarası "+list.lastIndexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        System.out.println("6 içeriyor mu ? "+ list.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? "+ list.equals(list));

        System.out.println("String'e Çevir: "+ list.toString());
        System.out.println("String'e Çevir: "+ list.toString().substring(0,3));

        System.out.println("Listeden sadece istediğim indisi getirsin: "+ list.subList(0,3)); // 0<=DATA<=3-1

        System.out.println("Listeyi Diziye çevir: "+ list.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: "+ list.toArray().length); // 0<=DATA<=3-1

    }


    public static void main(String[] args) {
        System.out.println("**********ArrayList**********");
        ArrayListData();
        System.out.println("**********LinkedList**********");
        LinkedListData();
    }
}
