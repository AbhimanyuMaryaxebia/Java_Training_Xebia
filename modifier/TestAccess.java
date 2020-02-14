package com.xebia.training.modifier;


abstract class shape{
String color;
    abstract double area();
    abstract void display();

    public shape(String color)
    {
        this.color=color;
    }

}

class square extends shape
{
    double len;
    double bred;
    double area;
    public square(String color,double len,double bred)
    {
        super(color);
        this.len=len;
        this.bred=bred;
    }

    double area()
    {
return (len*bred);
    }
    public void display()
    {
        System.out.println("Color is:"+ super.color + " Area is: "+ area());
    }

}

public class TestAccess{
    public static void main(String[] args) {

        shape a1=new square("Red",4,5);
        a1.display();

    }

}