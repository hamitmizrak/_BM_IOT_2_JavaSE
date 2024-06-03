package com.collections;

import java.util.*;

// H L T
// HashSet : Tekrarsız, elemanları eklediğimiz sırada getirmeyebilir
// LinkedHashSet: Tekrarsız, elemanları eklediğimiz sırada getirir.
// TreeSet : Tekrarsız ve küçükten büyüğe doğru sıralama
public class SetData {

    // arrayListData
    public static void hashSetData() {
        //List<Integer> list = new ArrayList<Integer>();
        Set<Integer> hashSetData = new HashSet<>();
        hashSetData.add(5);
        hashSetData.add(4);
        hashSetData.add(1);
        hashSetData.add(7);
        hashSetData.add(3);
        hashSetData.add(6);
        hashSetData.add(2);
        hashSetData.add(9);
        hashSetData.add(6);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: " + hashSetData.size());
        System.out.println("hashCode: " + hashSetData.hashCode());
        System.out.println("Boş mu: " + hashSetData.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        System.out.println("6 içeriyor mu ? " + hashSetData.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? " + hashSetData.equals(hashSetData));

        System.out.println("String'e Çevir: " + hashSetData.toString());
        System.out.println("String'e Çevir: " + hashSetData.toString().substring(0, 3));

        System.out.println("Listeyi Diziye çevir: " + hashSetData.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: " + hashSetData.toArray().length); // 0<=DATA<=3-1

        // Ençok kullanılan
        System.out.println("*** hashSetData ForEach Names Loop");
        for (Integer temp: hashSetData) {
            System.out.print(temp+" ");
        }
        System.out.println("\n");

    }

    // linkedListData
    public static void linkedHashSetData() {
        //List<Integer> list = new ArrayList<Integer>();
        Set<Integer> linkedData = new LinkedHashSet<>();
        linkedData.add(5);
        linkedData.add(4);
        linkedData.add(1);
        linkedData.add(7);
        linkedData.add(3);
        linkedData.add(6);
        linkedData.add(2);
        linkedData.add(9);
        linkedData.add(6);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: " + linkedData.size());
        System.out.println("hashCode: " + linkedData.hashCode());
        System.out.println("Boş mu: " + linkedData.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        System.out.println("6 içeriyor mu ? " + linkedData.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? " + linkedData.equals(linkedData));

        System.out.println("String'e Çevir: " + linkedData.toString());
        System.out.println("String'e Çevir: " + linkedData.toString().substring(0, 3));

        System.out.println("Listeyi Diziye çevir: " + linkedData.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: " + linkedData.toArray().length); // 0<=DATA<=3-1

        // Ençok kullanılan
        System.out.println("*** linkedData ForEach Names Loop");
        for (Integer temp: linkedData) {
            System.out.print(temp+" ");
        }
        System.out.println("\n");
    }

    // vectorListData
    public static void treeSetData() {
        // Defaultta 10 elemana sahiptir ancak eleman sayısı 9 olursa
        // kendisi otomatik olarak eleman sayısı 20 yapar.
        Set<Integer> treeSetData = new TreeSet<>();
        treeSetData.add(5);
        treeSetData.add(4);
        treeSetData.add(1);
        treeSetData.add(7);
        treeSetData.add(3);
        treeSetData.add(6);
        treeSetData.add(2);
        treeSetData.add(9);
        treeSetData.add(6);
        // 5 1 7 3 6 2 9 6
        System.out.println("Eleman Sayısı: " + treeSetData.size());
        System.out.println("hashCode: " + treeSetData.hashCode());
        System.out.println("Boş mu: " + treeSetData.isEmpty());
        //System.out.println("İçeriği Listeden sil "+list.remove(0));
        //System.out.println("İlk Eleman: "+list.get(0));
        // list.clear();
        // System.out.println("İlk Eleman: "+list.get(0));

        System.out.println("6 içeriyor mu ? " + treeSetData.contains(6));
        System.out.println("bu iki liste birbirine eşit mi ? " + treeSetData.equals(treeSetData));

        System.out.println("String'e Çevir: " + treeSetData.toString());
        System.out.println("String'e Çevir: " + treeSetData.toString().substring(0, 3));

        System.out.println("Listeyi Diziye çevir: " + treeSetData.toArray()); // 0<=DATA<=3-1
        System.out.println("Listeyi Diziye çevir Dizi eleman sayısı: " + treeSetData.toArray().length); // 0<=DATA<=3-1

        // Ençok kullanılan
        System.out.println("*** treeSetData ForEach Names Loop");
        for (Integer temp: treeSetData) {
            System.out.print(temp+" ");
        }
        System.out.println("\n");

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
        System.out.println("**********HashSet**********");
        hashSetData();
        System.out.println("**********LinkedHashSet**********");
        linkedHashSetData();
        System.out.println("**********TreeSet**********");
        treeSetData();

        //System.out.println(loopMethod().size());
        //loopMethod();
    }
}
