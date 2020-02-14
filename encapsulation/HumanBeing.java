package com.xebia.training.encapsulation;

import javafx.scene.input.ScrollEvent;

public class HumanBeing {
    private String name;
    private int age;

    public HumanBeing(String name,int age)
    {this.name=name;
        this.age=age;}

    public void printAttribute()
    {
        System.out.println("My name is :"+ name+ " age is: "+age);
    }

    public static void main(String[] args) {
        HumanBeing obj1=new HumanBeing("abhimanyu",27);

        obj1.printAttribute();
    }



}
