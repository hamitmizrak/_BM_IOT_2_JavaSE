package com.collections;

import java.util.*;

public class ListData {

    // arrayListData
    public static void arrayListData() {
        //List<Integer> list = new ArrayList<Integer>();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(3);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: " + arrayList.size());
        System.out.println("İlk Eleman: " + arrayList.get(0));
        System.out.println("Son Eleman: " + arrayList.get(4));
        System.out.println("Son Eleman: " + arrayList.get(arrayList.size() - 1));
        System.out.println("hashCode: " + arrayList.hashCode());
        System.out.println("Boş mu: " + arrayList.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        // Arama (SOLDAN)
        if (arrayList.indexOf(6) > 0) {
            System.out.println("6 vardır ve soldan indis numarası " + arrayList.indexOf(6));
        } else {
            System.out.println("Yoktur");
        }

        // Arama (SAĞDAN)
        if (arrayList.lastIndexOf(6) > 0) {
            System.out.println("6 vardır ve sağdan indis numarası " + arrayList.lastIndexOf(6));
        } else {
            System.out.println("Yoktur");
        }

        System.out.println("6 içeriyor mu ? " + arrayList.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? " + arrayList.equals(arrayList));

        System.out.println("String'e Çevir: " + arrayList.toString());
        System.out.println("String'e Çevir: " + arrayList.toString().substring(0, 3));

        System.out.println("Listeden sadece istediğim indisi getirsin: " + arrayList.subList(0, 3)); // 0<=DATA<=3-1

        System.out.println("Listeyi Diziye çevir: " + arrayList.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: " + arrayList.toArray().length); // 0<=DATA<=3-1

    }

    // linkedListData
    public static void linkedListData() {
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
        System.out.println("Eleman Sayısı: " + linkedList.size());
        System.out.println("İlk Eleman: " + linkedList.get(0));
        System.out.println("Son Eleman: " + linkedList.get(4));
        System.out.println("Son Eleman: " + linkedList.get(linkedList.size() - 1));
        System.out.println("hashCode: " + linkedList.hashCode());
        System.out.println("Boş mu: " + linkedList.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        // Arama  (SOLDAN)
        if (linkedList.indexOf(6) > 0) {
            System.out.println("6 vardır ve soldan indis numarası " + linkedList.indexOf(6));
        } else {
            System.out.println("Yoktur");
        }

        // Arama  (SAĞDAN)
        if (linkedList.lastIndexOf(6) > 0) {
            System.out.println("6 vardır ve sağdan indis numarası " + linkedList.lastIndexOf(6));
        } else {
            System.out.println("Yoktur");
        }

        System.out.println("6 içeriyor mu ? " + linkedList.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? " + linkedList.equals(linkedList));

        System.out.println("String'e Çevir: " + linkedList.toString());
        System.out.println("String'e Çevir: " + linkedList.toString().substring(0, 3));

        System.out.println("Listeden sadece istediğim indisi getirsin: " + linkedList.subList(0, 3)); // 0<=DATA<=3-1

        System.out.println("Listeyi Diziye çevir: " + linkedList.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: " + linkedList.toArray().length); // 0<=DATA<=3-1

    }

    // vectorListData
    public static void vectorListData() {
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
        System.out.println("Eleman Sayısı: " + vectorList.size());
        System.out.println("İlk Eleman: " + vectorList.get(0));
        System.out.println("Son Eleman: " + vectorList.get(4));
        System.out.println("Son Eleman: " + vectorList.get(vectorList.size() - 1));
        System.out.println("hashCode: " + vectorList.hashCode());
        System.out.println("Boş mu: " + vectorList.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        // Arama  (SOLDAN)
        if (vectorList.indexOf(6) > 0) {
            System.out.println("6 vardır ve soldan indis numarası " + vectorList.indexOf(6));
        } else {
            System.out.println("Yoktur");
        }

        // Arama  (SAĞDAN)
        if (vectorList.lastIndexOf(6) > 0) {
            System.out.println("6 vardır ve sağdan indis numarası " + vectorList.lastIndexOf(6));
        } else {
            System.out.println("Yoktur");
        }

        System.out.println("6 içeriyor mu ? " + vectorList.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? " + vectorList.equals(vectorList));

        System.out.println("String'e Çevir: " + vectorList.toString());
        System.out.println("String'e Çevir: " + vectorList.toString().substring(0, 3));

        System.out.println("Listeden sadece istediğim indisi getirsin: " + vectorList.subList(0, 3)); // 0<=DATA<=3-1

        System.out.println("Listeyi Diziye çevir: " + vectorList.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: " + vectorList.toArray().length); // 0<=DATA<=3-1

    }


    // Random List
    public static List<Integer> loopMethod() {
        List<Integer> listData = new ArrayList<>();
        Random random = new Random();
        // 8 tane Random sayısı üretip List'e ekle
        // 0 1 2 3 4 5 6
        for (int i = 0; i < 7; i++) {
            int randomData = random.nextInt(9) + 1;
            listData.add(randomData);
        }
        System.out.println("*** Iterative Loop");
        for (int i = 0; i <listData.size(); i++) {
            System.out.print(listData.get(i)+" ");
        }

        // Ençok kullanılan
        System.out.println("\n\n*** ForEach Names Loop");
        for (Integer temp: listData) {
            System.out.print(temp+" ");
        }

        System.out.println("\n\n*** Iterator Names Loop");
        Iterator<Integer> iterator= listData.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        System.out.println("\n\n*** Stream ForEach Loop");
         listData.stream().forEach((temp)->{
             System.out.print(temp+" ");
         });

        System.out.println("\n\n*** Kısalt Stream ForEach Loop");
        listData.forEach((temp)->{
            System.out.print(temp+" ");
        });

        System.out.println("\n\n*** Kısalt Stream ForEach Loop (Method Referances)");
        listData.forEach(System.out::print);

        return listData;
    }

    // PSVM
    public static void main(String[] args) {
        //System.out.println("**********ArrayList**********");
        //arrayListData();
        //System.out.println("**********LinkedList**********");
        //linkedListData();
        //System.out.println("**********VectorList**********");
        //vectorListData();

        //System.out.println(loopMethod().size());
        loopMethod();
    }
}
