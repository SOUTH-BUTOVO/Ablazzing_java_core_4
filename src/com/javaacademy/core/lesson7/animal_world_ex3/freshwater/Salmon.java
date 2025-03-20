package com.javaacademy.core.lesson7.animal_world_ex3.freshwater;

public class Salmon extends Fish {

    public Salmon(int maxCountCaviar) {
        super(maxCountCaviar);
    }

    @Override
    public void swim() {
        System.out.println("Лосось плывёт против течения");
    }
}
