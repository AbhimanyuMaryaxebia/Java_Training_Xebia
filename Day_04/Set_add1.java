package com.xebia.training.Day_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_add1 {

    public static void main(String[] args) {

        String names[]={ new String("Abhimanyu"), new String("Marya"),new String("Marya")};
//        String myownnames[]= {new String("A"),new String("B"),new String("A"),new String("B")}
        Set dups=new HashSet();
        Set uniques = new HashSet();

      for(int i=0;i< names.length;i++)
        {
            if(!uniques.add(names[i]))
            {
                dups.add(names[i]);
            }

        }
//        System.out.println("Set is :"+ dups);
//        System.out.println("Set is :"+ uniques);
        System.out.println(dups.getClass().getName());

//        ss.forEach(i-> System.out.print(i +" "));

    }
}
