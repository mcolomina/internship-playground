package com.mghelas.internship_playground.oop.polymorphism;

public class Laptop extends Computer{
    @Override
    public void run() {
        System.out.println("opening lid");
        super.run();
    }
}
