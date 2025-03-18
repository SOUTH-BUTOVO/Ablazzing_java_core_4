package com.javaacademy.core.lesson5.animal;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Мухтар");
        Dog dog2 = new Dog("Перс");

        System.out.println(dog1);
        System.out.println(dog2);

        AnotherClass.createDogs();

        //System.out.println(Arrays.toString(Dog.dogs));

        System.out.println("------------------");
        Dog.infoDog();
    }
}
