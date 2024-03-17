package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Motor {

    Motor()
    {
        System.out.println("Motor cons...");
    }

    @PostConstruct
    public void start(){
        System.out.println("Moter started....");
    }

    public void doWork()
    {
        System.out.println("Motor pulling water...");
    }

    @PreDestroy
    public void stop()
    {
        System.out.println("Motor stopped...");
    }
}

