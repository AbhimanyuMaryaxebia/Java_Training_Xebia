package com.xebia.training.Day_06;

import java.util.*;

public class HashMap_Prac1 {

    public static void main(String[] args) {


//
//        String[] suit = new String[] {"spades", "hearts", "diamonds", "clubs"};
//        String[] rank = new String[]{"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
//        List deck = new ArrayList();
//        List deck1=new ArrayList();
//        Set ss =new HashSet();
//        for (int i=0; i<suit.length; i++)
//            for (int j=0; j<rank.length; j++)
//                deck.add(rank[j] +" of "+suit[i]);
//
//        Collections.shuffle(deck);

        LinkedList list = new LinkedList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(1));
        String str=new String("Abhimanyu");
        list.add(str);
        LinkedList clonedLinkedList = (LinkedList) list.clone();
        clonedLinkedList.add(0,"CLonedLinked LIst");
        System.out.println(clonedLinkedList);



    }
}
