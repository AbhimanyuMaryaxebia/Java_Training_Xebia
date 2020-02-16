package com.xebia.training.Day_03;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

class Information {

    static String college="UPES";
    String Name;
    private long ID;
    static{System.out.println("static block is invoked");}

    Information(String Name,long ID)
    {

        this.Name=Name;
        this.ID=ID;
    }
    public void showData()
    {
        System.out.println("Name is :"+Name +"\n"+"ID IS: "+ID+ "\n"+"Affiliated to : "+college);
    }

}

public class Prac3 {
public static void main(String[]args){


    List<Information> info=new ArrayList<>();
    Information obj1=new Information("Abhimanyu",500054205);
    Information obj2=new Information("Utkarsh",500054321);
    info.add(obj1);
    info.add(obj2);

    for(Information inf :info)
    {
        inf.showData();
    }

        }
        }
