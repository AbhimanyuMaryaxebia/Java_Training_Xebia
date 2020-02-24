package com.xebia.training.Day_05;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {

    public static void main(String[] args) {

        Set<String> ts=new TreeSet<>();
//        String[] vowels={"a","e","i","o","u"};
        ts.add("agggggggggg");
        ts.add("e");
        ts.add("i");
        ts.add("o");

        System.out.println("--"+ts);

        Set<String> ts1=new TreeSet<>();
        ts1.add("x");
        ts1.add("y");
        ts1.add("z");
        ts1.add("m");
        System.out.println("--"+ts1);

    }


}
