package com.javaacademy.core.homework4.ex4darwin;

import com.javaacademy.core.homework4.ex4darwin.animals.Elephant;
import com.javaacademy.core.homework4.ex4darwin.animals.Rabbit;
import com.javaacademy.core.homework4.ex4darwin.animals.Tiger;
import com.javaacademy.core.homework4.ex4darwin.animals.Wolf;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2_000);

        rabbit.run();
        wolf.attack(rabbit);
        tiger.attack(wolf);
        tiger.attack(elephant);
        elephant.run();
        rabbit.run();
        wolf.attack(rabbit);
        tiger.attack(wolf);
    }
}
