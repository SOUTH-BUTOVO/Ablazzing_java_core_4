package com.javaacademy.core.lesson6.ex2;

public class Runner {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        Cat cat = new Cat(10);
        Dog dog = new Dog(20);

        cat.makeSound();
        dog.makeSound();
        System.out.println("---");

        animals[0] = cat;
        animals[1] = dog;

        for (Animal animal : animals) {
            animal.makeSound();
            animal.breath();
        }
        System.out.println("---");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println("---");
    }
}
