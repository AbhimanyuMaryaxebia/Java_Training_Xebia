package com.xebia.training.Day_03;


interface testInterface
{
    abstract void show();
}

interface testInterface1 extends testInterface
{
    abstract void show1();
}

class Prac4 implements testInterface1 {


public void show()
{

}
public void show1()
{

}

    public static void main(String[] args) {
        Prac4 a1=new Prac4();
        a1.show();
        a1.show1();
    }


}
