package org.example;

public class DieselEngine implements Engine{

    DieselEngine()
    {
        System.out.println("DieselEngine Cons......");
    }
    public int start() {
        System.out.println("Diesel Engine start....");
        return 1;
    }
}
