package com.collections;

import java.util.HashMap;
import java.util.Map;

// HashTable
// HashMap
// LinkedHashMap
// TreeMap
public class MapData {



    // map Data
    public static void mapData(){
     Map<String,String> map = new HashMap<>();
     map.put("1","pc-1");
     map.put("2","laptop");
     map.put("3","pc-2");
     map.put("4","laptop-2");
     map.put("5","laptop-3");
     System.out.println(map.get("1"));
     System.out.println("Eleman sayısı: "+ map.size());
     System.out.println("HashCode: "+ map.hashCode());
     System.out.println("toString: "+ map.toString());
        System.out.println();
     for( String key: map.keySet()){
         System.out.println(key+" => "+map.get(key));
     }
    }

    public static void main(String[] args) {
        mapData();
    }
}
