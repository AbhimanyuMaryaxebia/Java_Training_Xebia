package com.xebia.training.Day_05;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Set_Test {
    public static void main(String[] args) {

        // Set up test data
        String numbers[] = {
                new String("2"),
                new String("3"),
                new String("8"),
                new String("1"),
                new String("2")
        };

        Set s = new HashSet();
        MyOwnUtilityClass.checkDuplicate(s, numbers);

        s = new TreeSet();
        MyOwnUtilityClass.checkDuplicate(s, numbers);

        s = new LinkedHashSet();
        MyOwnUtilityClass.checkDuplicate(s, numbers);
    }
}