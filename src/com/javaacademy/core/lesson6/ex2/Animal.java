package com.javaacademy.core.lesson6.ex2;

public abstract class Animal {
    protected int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public void breath() {
        System.out.println("Животное дышит");
    }

    public abstract void makeSound();
}
