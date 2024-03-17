package org.example;

public class Car {

    Engine engine; //p,d

    Car()
    {
        System.out.println("Car cons....");
    }
    public Car(Engine engine) {
        System.out.println("Car | 1 arg cons....");
        this.engine = engine;
    }
    public void setEngine(Engine engine) {
        System.out.println("Car Setter method...");
        this.engine = engine;
    }

    public void drive()
    {
        int res=engine.start();
        if(res>=1)
        {
            System.out.println("Car started....");
        }
        else {
            System.out.println("Engine not started....");
        }
    }



}
