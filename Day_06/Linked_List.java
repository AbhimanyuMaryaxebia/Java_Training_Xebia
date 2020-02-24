package com.xebia.training.Day_06;

import java.util.LinkedList;

public class Linked_List {

    public static void main(String[] args) {

        LinkedList lst=new LinkedList();
        lst.add(1);
        lst.add(2);
        lst.add(1);
        lst.addFirst(11);
        lst.addLast(13);
        System.out.println(lst);
    }

}
