package com.xebia.training.Day_03;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prac2 {

    public static void main(String[] args) {
        List<Prac1> todoList=new ArrayList<>();
        Date date = new Date();
        Prac1 obj1= new Prac1("Complete Quiz", date);
        Prac1 obj2= new Prac1("Complete Assignment", date);
        obj1.updateStatus(true);
        todoList.add(obj1);

        todoList.add(obj2);

        for(Prac1 todo : todoList )
        {
            todo.getStatus();
        }





    }

}
