package com.xebia.training.Day_06;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

    public static void main(String[] args) {
        Map<Integer,String> testmap= new HashMap<>();

        testmap.put(1,"Abhimanyu");
        testmap.put(2,"Marya");

        testmap.forEach((a,b)-> System.out.println("Key is: "+ a+ " Value is :"+ b));
        System.out.println(testmap.get(1));
    // EXTRACT ALL KEYS OF MAP

        for(Integer map_key : testmap.keySet())
        {
            System.out.println("Key is :"+map_key);
        }



    }
}
