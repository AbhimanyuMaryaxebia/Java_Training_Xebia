package com.xebia.training.Day_03;

public class Todos {

    private String name;

    private boolean status;

    public Todos(String name) {
        this.name = name;
    }

    public void updateStatus(boolean status)
    {
        this.status = status;
    }

    public void getStatus()
    {
        System.out.println("Your task: "+name);
        System.out.println("Your Status: "+status);
    }
}
