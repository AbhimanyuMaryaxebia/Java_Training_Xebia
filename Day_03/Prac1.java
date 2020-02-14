package com.xebia.training.Day_03;
import java.util.Date;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Date;

public class Prac1 {
    private String name;
    boolean status;
    Date date;

    public Prac1(String name, Date date)
    {
        this.name=name;
        this.date=date;

    }

    public void updateStatus(boolean status)
    {
        this.status=status;
    }


    public void getStatus()
    {
        System.out.println("Task is : "+name);
        System.out.println("Status is : "+ status);
        System.out.println("Default Date is:"+ date);
    }



}
