package com.Maksim.InterfaceAbstract;

import com.Maksim.InterfaceAbstract.models.Cat;
import com.Maksim.InterfaceAbstract.models.Dog;
import com.Maksim.InterfaceAbstract.models.Squirrel;

public class Main {
    public static void main(String[] args) {

        // Instantiate Objects
        Cat kasper = new Cat();
        Dog fido = new Dog();
        Squirrel benny = new Squirrel();

        benny.eat();       // Abstract Method -Implementation
        benny.makeSound(); // Ordinary Method

        kasper.name();
        kasper.eat();
        kasper.move();
        kasper.sleep();
        kasper.makeSound();
        kasper.typeOfAnimal("cat"); // Default Method

        fido.name();
        fido.eat();
        fido.move();
        fido.sleep();
        fido.makeSound();
        fido.typeOfAnimal("dog"); // Default Method



    }


}
