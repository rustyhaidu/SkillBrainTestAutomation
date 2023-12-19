package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Pisica");
        map.put(9, "Dog");

        System.out.println(map.get(9));
    }
}
