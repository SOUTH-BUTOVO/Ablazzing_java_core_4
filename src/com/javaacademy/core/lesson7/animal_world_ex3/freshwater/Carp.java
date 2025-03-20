package com.javaacademy.core.lesson7.animal_world_ex3.freshwater;

public class Carp extends Fish {
    private String color;

    public Carp(String color, int maxCountCaviar) {
        super(maxCountCaviar);
        this.color = color;
    }

    @Override
    public void swim() {
        System.out.println("Карп плывёт вальяжно");
    }
}
