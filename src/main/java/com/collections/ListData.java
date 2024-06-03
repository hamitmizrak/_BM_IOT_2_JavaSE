package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListData {

    // arrayListData
    public static void arrayListData(){
        //List<Integer> list = new ArrayList<Integer>();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(3);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: "+arrayList.size());
        System.out.println("İlk Eleman: "+arrayList.get(0));
        System.out.println("Son Eleman: "+arrayList.get(4));
        System.out.println("Son Eleman: "+arrayList.get(arrayList.size()-1));
        System.out.println("hashCode: "+arrayList.hashCode());
        System.out.println("Boş mu: "+arrayList.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        // Arama
        if(arrayList.indexOf(6)>0){
            System.out.println("6 vardır ve soldan indis numarası "+arrayList.indexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        // Arama
        if(arrayList.lastIndexOf(6)>0){
            System.out.println("6 vardır ve sağdan indis numarası "+arrayList.lastIndexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        System.out.println("6 içeriyor mu ? "+ arrayList.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? "+ arrayList.equals(arrayList));

        System.out.println("String'e Çevir: "+ arrayList.toString());
        System.out.println("String'e Çevir: "+ arrayList.toString().substring(0,3));

        System.out.println("Listeden sadece istediğim indisi getirsin: "+ arrayList.subList(0,3)); // 0<=DATA<=3-1

        System.out.println("Listeyi Diziye çevir: "+ arrayList.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: "+ arrayList.toArray().length); // 0<=DATA<=3-1

    }

    // linkedListData
    public static void linkedListData(){
        //List<Integer> list = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.add(6);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: "+linkedList.size());
        System.out.println("İlk Eleman: "+linkedList.get(0));
        System.out.println("Son Eleman: "+linkedList.get(4));
        System.out.println("Son Eleman: "+linkedList.get(linkedList.size()-1));
        System.out.println("hashCode: "+linkedList.hashCode());
        System.out.println("Boş mu: "+linkedList.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        // Arama
        if(linkedList.indexOf(6)>0){
            System.out.println("6 vardır ve soldan indis numarası "+linkedList.indexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        // Arama
        if(linkedList.lastIndexOf(6)>0){
            System.out.println("6 vardır ve sağdan indis numarası "+linkedList.lastIndexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        System.out.println("6 içeriyor mu ? "+ linkedList.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? "+ linkedList.equals(linkedList));

        System.out.println("String'e Çevir: "+ linkedList.toString());
        System.out.println("String'e Çevir: "+ linkedList.toString().substring(0,3));

        System.out.println("Listeden sadece istediğim indisi getirsin: "+ linkedList.subList(0,3)); // 0<=DATA<=3-1

        System.out.println("Listeyi Diziye çevir: "+ linkedList.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: "+ linkedList.toArray().length); // 0<=DATA<=3-1

    }

    // vectorListData
    public static void vectorListData(){
        // Defaultta 10 elemana sahiptir ancak eleman sayısı 9 olursa
        // kendisi otomatik olarak eleman sayısı 20 yapar.
        Vector<Integer> vectorList = new Vector<>();
        vectorList.add(5);
        vectorList.add(1);
        vectorList.add(7);
        vectorList.add(3);
        vectorList.add(6);
        vectorList.add(2);
        vectorList.add(9);
        vectorList.add(6);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: "+vectorList.size());
        System.out.println("İlk Eleman: "+vectorList.get(0));
        System.out.println("Son Eleman: "+vectorList.get(4));
        System.out.println("Son Eleman: "+vectorList.get(vectorList.size()-1));
        System.out.println("hashCode: "+vectorList.hashCode());
        System.out.println("Boş mu: "+vectorList.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        // Arama
        if(vectorList.indexOf(6)>0){
            System.out.println("6 vardır ve soldan indis numarası "+vectorList.indexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        // Arama
        if(vectorList.lastIndexOf(6)>0){
            System.out.println("6 vardır ve sağdan indis numarası "+vectorList.lastIndexOf(6));
        }else{
            System.out.println("Yoktur");
        }

        System.out.println("6 içeriyor mu ? "+ vectorList.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? "+ vectorList.equals(vectorList));

        System.out.println("String'e Çevir: "+ vectorList.toString());
        System.out.println("String'e Çevir: "+ vectorList.toString().substring(0,3));

        System.out.println("Listeden sadece istediğim indisi getirsin: "+ vectorList.subList(0,3)); // 0<=DATA<=3-1

        System.out.println("Listeyi Diziye çevir: "+ vectorList.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: "+ vectorList.toArray().length); // 0<=DATA<=3-1

    }


    // PSVM
    public static void main(String[] args) {
        System.out.println("**********ArrayList**********");
        arrayListData();
        System.out.println("**********LinkedList**********");
        linkedListData();
        System.out.println("**********VectorList**********");
        vectorListData();
    }
}
