package com.xebia.training.Day_05;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class Prac_find_duplicates {

    public static void main(String[] args) {

        List<Integer> obj=new ArrayList<Integer>();

        obj.add(1);
        obj.add(2);
        obj.add(1);
        obj.add(1);
        obj.add(2);
        obj.add(1);
        ListIterator<Integer> itr=obj.listIterator();

        while (itr.hasNext())
        {
            int value= itr.next();
          if(value==1)
          {
              itr.remove();
          }
          else
          {
              System.out.println(itr.next());
          }

        }

    }

}
