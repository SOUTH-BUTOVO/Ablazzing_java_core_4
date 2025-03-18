package com.javaacademy.core.lesson6.ex2;

public class Dog extends Animal {
    public Dog(int weight) {
        super(weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return "Это собака с весом " + weight;
    }
}
