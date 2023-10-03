package com.Maksim.InterfaceAbstract.models;


// Abstract Class - marked by keyword: abstract
// TODO  Test visibility mod

public abstract class AAnimal {

    public abstract void eat (); // Includes abstract, excludes body

    // Ordinary method - excludes abstract, includes body {}
    public void makeSound () {
        System.out.println("Some random animal noise");

    }

}
