package org.anas.tools.master;

import org.anas.tools.master.interfaces.Animal;

public class Cat implements Animal {

    @Override
    public void sound(){
        System.out.println("sound cat");

    }
    @Override
    public void eat(){
        System.out.println("cat eating");
    }
}
