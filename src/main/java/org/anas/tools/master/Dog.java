package org.anas.tools.master;

import org.anas.tools.master.interfaces.Animal;

public class Dog implements Animal {


    @Override
    public void sound() {
        System.out.println("my name is ");
    }

    @Override
    public void eat() {
        System.out.println("dog eating");
    }


}
