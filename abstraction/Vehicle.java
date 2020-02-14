package com.xebia.training.abstraction;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

abstract class Vehicle{

    public abstract void Trye();



}

class Maruti extends Vehicle{

    private int size;

    public Maruti(int size)
    {
        this.size=size;
    }
    @Override
    public void Trye() {
        System.out.println("SIze of Toyota tyre is "+size);
    }


}

 class BMW extends Vehicle{
     private int size;
      public BMW(int size)
     {
         this.size=size;
     }


     @Override
     public void Trye() {
         System.out.println("SIze of Toyota tyre is"+size);
     }


}

class Toyota extends Vehicle{
    private int size;
    public Toyota(int size)
    {
        this.size=size;
    }

    @Override
    public void Trye() {
        System.out.println("SIze of Toyota tyre is"+size);
    }
}

class test{


    public static void main(String[] args) {

        BMW a1=new BMW(10);
        Maruti a2=new Maruti(20);
        Toyota a3=new Toyota(30);



        a1.Trye();
        a2.Trye();
        a3.Trye();

    }
}



