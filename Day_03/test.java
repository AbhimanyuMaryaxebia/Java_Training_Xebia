package com.xebia.training.Day_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        List<Todos> todoList = new ArrayList();
        Todos a1=new Todos("Ankit");
        Todos a2=new Todos("Verma");

        /*
        Scanner myObj = new Scanner(System.in);
        int i=1;
        int k=1;
        while(k)
        {
            System.out.println("Enter task");
            String name=myObj.nextLine();
            System.out.println("Press True for Done, False for not Done");
            Boolean a2=myObj.nextBoolean();
            a1.SetStatus(name,a2);
            a1.GetStatus();
            System.out.println("Enter 1 to Continue, 0 to exit");
            int k=myObj.nextInt();
        }
        */

        todoList.add(a1);
        todoList.add(a2);
        //a1.getStatus();
        a1.updateStatus(true);
        //a1.getStatus();

//        System.out.println(todoList); # Byte code
//
//        for(Todos todos : todoList) {
//            todos.getStatus();
//        }

//        System.out.println(Car.var);

        Car car = Carfactory.getInstance("1");
        System.out.println(car.getnumberTryres());
        Car car2 = Carfactory.getInstance("2");
        System.out.println(car2.getnumberTryres());


    }

}
