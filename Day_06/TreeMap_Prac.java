package com.xebia.training.Day_06;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Prac {

    public static void main(String[] args) {

        String []name=new String[]{"Marya","Hello","abhimanyu","Hello","Marya"};
        Map m=new TreeMap<>();
        Map m1 =new HashMap<>();

        for(int i=0;i<name.length;i++)
        {
            Integer freq = (Integer) m.get(name[i]);
            Integer freq1 = (Integer) m1.get(name[i]);

            m.put(name[i],freq==null ? 1 : new Integer(freq.intValue() +1 ));
            m1.put(name[i],freq1==null ? 1 : new Integer(freq1.intValue() +1 ));

        }

        System.out.println(m);
        System.out.println(m1);

    }
}
