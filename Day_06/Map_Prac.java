package com.xebia.training.Day_06;

import java.util.HashMap;
import java.util.Map;

public class Map_Prac {
    private static final Integer ONE = new Integer(1);
    public static void main(String[] args) {

        String []name=new String[]{"Marya","Hello","abhimanyu","Hello","Marya"};
        Map m =new HashMap<>();
        for(int i=0;i<name.length;i++)
        {
            System.out.print(m.get(name[i])+" ");
            Integer freq= (Integer) m.get(name[i]);
            System.out.print(freq.intValue()+"-");
//            System.out.println((freq==null ? 1 : new Integer(freq.intValue() + 1)));
//            System.out.print(freq+"-");
//
//            m.put(name[i], (freq==null ? 1 : new Integer(freq.intValue() + 1)));

        }
        System.out.println("Display of the HashMap object = " + m);


    }
}
