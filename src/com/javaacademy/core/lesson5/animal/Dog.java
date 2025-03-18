package com.javaacademy.core.lesson5.animal;

import java.util.Arrays;

public class Dog {
    private String name;
    private static Dog[] dogs = new Dog[10];
    static int count;

    public Dog(String name) {
        this.name = name;
        dogs[count++] = this;
    }

    public static void infoDog() {
        for (Dog dog : dogs) {
            if (dog != null) {
                System.out.println(dog);
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + '}';
    }
}
