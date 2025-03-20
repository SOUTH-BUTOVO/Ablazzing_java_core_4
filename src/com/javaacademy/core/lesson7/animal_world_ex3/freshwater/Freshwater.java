package com.javaacademy.core.lesson7.animal_world_ex3.freshwater;

import com.javaacademy.core.lesson7.animal_world_ex3.Breathe;

public abstract class Freshwater implements Breathe {

    public abstract void swim();

    @Override
    public void breathe() {
        System.out.println("Дышит жабрами");
    }
}
