package com.javaacademy.core.lesson7.animal_world_ex3.mammal;

import com.javaacademy.core.lesson7.animal_world_ex3.Breathe;

public abstract class Mammal implements Breathe {

    public void feedMilk() {
        System.out.println("Кормит молоком");
    }

    @Override
    public void breathe() {
        System.out.println("Животное дышит атмосферой");
    }
}
