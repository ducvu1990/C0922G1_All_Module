package ss12_java_collection_framework.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vu",16);
        hashMap.put("Hau",15);
        hashMap.put("Hung",17);
        hashMap.put("Dat",14);
        System.out.println("hien thi cac muc trong hashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("hien thi cac muc nhap theo thu tu tang dan cua Key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f,true);
        linkedHashMap.put("vu", 17);
        linkedHashMap.put("hung", 15);
        linkedHashMap.put("Lewis", 16);
        linkedHashMap.put("hau", 18);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
