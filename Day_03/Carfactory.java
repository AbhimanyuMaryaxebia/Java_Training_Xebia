package com.xebia.training.Day_03;

public class Carfactory {
    public static Car getInstance(String carType)
    {
        if(carType.equals("1"))
        {
            return new CarImpl();
        }
        else
        {
            return  new CarImpl2();
        }
    }

}

/*
In test.java

        Car car = Carfactory.getInstance("1");
        System.out.println(car.getnumberTryres());
        Car car2 = Carfactory.getInstance("2");
        System.out.println(car2.getnumberTryres());

 */