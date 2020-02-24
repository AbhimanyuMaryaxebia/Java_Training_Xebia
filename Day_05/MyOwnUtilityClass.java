package com.xebia.training.Day_05;
import java.util.HashSet;
import java.util.Set;

public class MyOwnUtilityClass {

        public static void checkDuplicate(Set s, String[] numbers){
            Set duplicates = new HashSet();
            for (int i=0; i<numbers.length; i++)
                if (!s.add(numbers[i]))
                    System.out.println("Set type = " + s.getClass().getName() + " " + s);

    }
}