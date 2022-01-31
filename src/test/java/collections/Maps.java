package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer>hashMap=new HashMap<>();
        hashMap.put("Tr",123);
        hashMap.put("Al",456);
        hashMap.put("Ar",789);
        hashMap.put("Sr",789);
        hashMap.put(null,135);
        hashMap.put("ad",null);
        hashMap.put("we",null);

        System.out.println(hashMap);
        System.out.println();

        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(100, "Ali Can");
        hMap.put(101, "Veli Han");
        hMap.put(102, "Ayse Tan");
        hMap.put(103, "Emine Ran");

        System.out.println(hMap);

        System.out.println(hMap.remove(100));
        System.out.println(hMap);

        System.out.println(hMap.keySet());
        System.out.println(hMap.values());
        System.out.println(hMap.size());
        System.out.println(hMap.isEmpty());
        System.out.println(hMap.getClass());
        hMap.clear();
        System.out.println(hMap);

        Map<Integer,Object>sampleMap=new HashMap<Integer,Object>();
        sampleMap.put(1, null);
        sampleMap.put(5, null);
        sampleMap.put(3, null);
        sampleMap.put(null, 7);
        sampleMap.put(null, null);

        System.out.println(sampleMap);

        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("A",1);
        hm.put("B",2);
        hm.put("C",3);
        hm.put("D",4);
        System.out.println(hm);

        for (int w:hm.values()) {
            System.out.println(w+ " ");
        }




    }
}
