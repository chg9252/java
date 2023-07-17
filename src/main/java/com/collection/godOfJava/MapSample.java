package com.collection.godOfJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMap();
        
    }

    private void checkHashMap() {
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
    }

    public void checkkeyset() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("c", "c");
        map.put("D", "d");
        Set<String> keySet = map.keySet();
        for (String tempKey : keySet) {

            System.out.println(tempKey + "=" + map.get(tempKey));
        }
    }

    public void checkValues() {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");

        Collection<String> values=map.values();
        for(String tempValue:values) {
            System.out.println(tempValue);
        }
    }

}

