package com.xebia.training.Day_03.FactoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryMathodOS obj2=new FactoryMathodOS();
        OS obj=obj2.getInstance("CLosed");
        obj.specification();

    }

}
