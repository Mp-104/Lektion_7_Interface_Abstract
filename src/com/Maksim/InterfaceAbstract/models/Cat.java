package com.Maksim.InterfaceAbstract.models;

public class Cat implements Animal {
    @Override
    public void name() {
        System.out.println("Kasper");
    }

    @Override
    public void move() {
        System.out.println("Moves graciously");
    }

    @Override
    public void eat() {
        System.out.println("omnom nom nom");

    }

    @Override
    public void sleep() {
        System.out.println("sleeps 80% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");

    }
}
