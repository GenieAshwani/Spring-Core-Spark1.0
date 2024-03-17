package org.example;

public class PetrolEngine implements Engine{

    PetrolEngine()
    {
        System.out.println("Petrol Engine Cons......");
    }
    public int start() {
        System.out.println("Petrol Engine start....");
        return 1;
    }
}
