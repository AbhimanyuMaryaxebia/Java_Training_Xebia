package com.xebia.training.Day_06;

import java.util.LinkedList;

public class Linked_HasSet {

    public static void main(String[] args) {

        LinkedList list =new LinkedList();
        list.add("hh");
        list.add("hhhhj");
        list.add("67");
//        System.out.println("List Size is :- "+lst.size());
        LinkedList clonedLinkedList;
        clonedLinkedList    = (LinkedList) list.clone();
        System.out.println(clonedLinkedList);
    }


}
