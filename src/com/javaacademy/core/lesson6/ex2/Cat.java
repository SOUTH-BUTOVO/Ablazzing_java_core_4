package com.javaacademy.core.lesson6.ex2;

public class Cat extends Animal {
    public Cat(int weight) {
        super(weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public void breath() {
        System.out.println("Кошка дышит");
    }

}
