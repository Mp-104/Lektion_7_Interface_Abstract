package com.Maksim.InterfaceAbstract.models;


// Abstract  - Inheritance (arv)
// As a standard, methods are "PUBLIC"
// Uses keyword: implements

public interface Animal {

    // TODO - Super Viktigt: private/vis
    //


    //Abstract Method , behöver implementeras
    void name ();
    void move();
    void eat();
    void sleep();
    void makeSound();

    // Default behöver inte implementeras
     default void typeOfAnimal(String typeOfAnimal) {
         System.out.println(typeOfAnimal);

     }

}
