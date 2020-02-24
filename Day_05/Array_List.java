package com.xebia.training.Day_05;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List {

    public static void main(String[] args) {

        ArrayList al = new ArrayList(3);
        al.add("R");
        al.add("U");
        al.add("R1");
        al.add("U1");
        al.add(new String("Hello"));
        al.add(4,new Integer(10));
//        System.out.println("Initially :"+ al);
//        System.out.println("Size is: "+al.size());

        ListIterator li =al.listIterator();
        while (li.hasNext())
        {
            System.out.println("List elem: "+li.next());
        }




    }



}
