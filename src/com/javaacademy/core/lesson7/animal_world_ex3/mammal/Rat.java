package com.javaacademy.core.lesson7.animal_world_ex3.mammal;

public class Rat extends Mammal {
    private int tailLength;

    public Rat(int tailLength) {
        this.tailLength = tailLength;
    }

    public void eatCheese() {
        System.out.println("Мышь ест сыр");
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }
}
