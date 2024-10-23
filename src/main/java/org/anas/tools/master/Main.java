package org.anas.tools.master;

import org.anas.tools.master.interfaces.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();

        // Normal
        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();

        // Polymorphism
        animalDog.sound();
        animalDog.eat();
        animalCat.sound();
        animalCat.eat();


    }
}