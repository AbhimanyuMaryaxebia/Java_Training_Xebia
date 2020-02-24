package com.xebia.training.Day_04;

import com.xebia.training.encapsulation.HumanBeing;
import com.xebia.training.Day_04.MyOwnClass;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_add {

    public static void main(String[] args) {


        HashSet<MyOwnClass> hs = new HashSet<>(5);
        //System.out.println("----"+hs.size());
        //hs.add("One");
        //hs.add("rr");
        //hs.add(2);
        //hs.add(3);
        //hs.add(2);
//        System.out.println("----"+hs.size());
        //hs.add(4);
        //hs.add(6);
        //hs.add(8);
        //hs.add(12);
        //hs.add(31);

//        System.out.println("----"+   hs.add(25));
//        System.out.println("----"+   hs.add(25));


//        System.out.println(hs);
        //boolean b=hs.add(3);
//        System.out.println(b);  //DUPLICATED NOT ALLOWED
        MyOwnClass ownClass = new MyOwnClass();
        MyOwnClass ownClass2 = new MyOwnClass();
        hs.add(MyOwnClass.obj1);
        hs.add(ownClass2);
        System.out.println(hs.getClass().getName());
//        hs.add("Ankit");

        hs.forEach(i -> System.out.println(i));


    }
        



    }

