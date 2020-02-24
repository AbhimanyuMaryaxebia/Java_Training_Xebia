package com.xebia.training.Day_04;

import java.util.Hashtable;
import java.util.Vector;

public class Prac1 {
    public static void main(String[] args) {

        Vector<Integer> v =new Vector<>();
        Hashtable<Integer,String> h =new Hashtable<>();
        v.addElement(1);
        h.put(2,"hello");

        System.out.println(v.elementAt(0));
        System.out.println(h.get(2));
    }
}
