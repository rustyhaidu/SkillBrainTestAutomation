package org.example.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Pisica");
        map.put(9, "Dog");
        map.put(9, "Cangur");

        System.out.println(map.get(9));

        Set<String> set = new HashSet<>();

        set.add("Hamster");
        set.add("Bird");
        set.add("Hamster");

        for(String crt : set){
            System.out.println(crt);
        }

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

            System.out.println();
        }
    }
}
