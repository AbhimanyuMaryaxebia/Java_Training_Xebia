package com.xebia.training.Day_03.FactoryMethod;

public class FactoryMathodOS {

    public OS getInstance(String str)
    {
        if(str.equals("open"))
        {
            return new Android();
        }
        else
        {
            return new iOS();
        }
    }

}
