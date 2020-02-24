package com.xebia.training.Day_04;

public class MyOwnClass {

    public static MyOwnClass obj1;

    public static void main(String[] args) {

        obj1=new MyOwnClass();
        System.out.println(obj1.getClass().getName());
    }
}
