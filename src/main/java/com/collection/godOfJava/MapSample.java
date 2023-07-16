package com.collection.godOfJava;

import java.util.HashMap;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMap();
        
    }

    private void checkHashMap() {
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("A", "a");
    }
}
