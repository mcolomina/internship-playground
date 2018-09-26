package com.mghelas.internship_playground.oop.polymorphism;

public class Computer {
    public void run(){
        System.out.println("pressing button");
        System.out.println("running...");
    }

    //overloading
    public void run(Boolean safemode){
        System.out.println("pressing button");
        if(safemode){
            System.out.println("running in safe mode");
        }
        System.out.println("running...");
    }
}
