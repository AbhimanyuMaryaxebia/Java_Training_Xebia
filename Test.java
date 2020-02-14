package com.xebia.training;
//Main method without static so create object of this ain in another class
import com.xebia.training.encapsulation.HumanBeing;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        HumanBeing a1=new HumanBeing("abhimanyu",25);
        a1.printAttribute();

//        System.out.println("kkkk");
//
//        List<String> mylist =new ArrayList();
//        mylist.add("Abhimanyu");
//        mylist.add(null);
//
//
//       for(String val : mylist)
//       {
////           System.out.println(val.toString());
//           run(val);
//       }

    }
//    public static void run(String value)
//    {
//        System.out.println(value.toString());
//    }

}
