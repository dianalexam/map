package com.fasttrackit;

import java.util.HashMap;
import java.util.Set;

public class MapExercise {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Diana", "Muresan");
        map.put("George", "Muresan");

        System.out.println(map);

        System.out.println(map.get("Diana"));

        map.remove("George");
        System.out.println(map);

        map.put("Mihai","Eminescu");

        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println(map.values());



    }
}
