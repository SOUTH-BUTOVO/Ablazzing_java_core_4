package com.javaacademy.core.lesson7.animal_world_ex3;

import com.javaacademy.core.lesson7.animal_world_ex3.freshwater.Carp;
import com.javaacademy.core.lesson7.animal_world_ex3.freshwater.Freshwater;
import com.javaacademy.core.lesson7.animal_world_ex3.freshwater.Salmon;
import com.javaacademy.core.lesson7.animal_world_ex3.mammal.Dog;
import com.javaacademy.core.lesson7.animal_world_ex3.mammal.Mammal;
import com.javaacademy.core.lesson7.animal_world_ex3.mammal.Rat;

public class Runner {
    public static void main(String[] args) {
        Rat rat = new Rat(20);
        Dog dog = new Dog("Oleg");
        Carp carp = new Carp("Gold", 100);
        Salmon salmon = new Salmon(3_000);
        Breathe[] animals = {rat, dog, carp, salmon};
        for (Breathe animal : animals) {
            animal.breathe();
        }
        System.out.println("--------------");

        Mammal[] mammals = {rat, dog};
        for (Mammal mammal : mammals) {
            mammal.feedMilk();
        }
        System.out.println("--------------");

        Freshwater[] freshwaters = {carp, salmon};
        for (Freshwater freshwater : freshwaters) {
            freshwater.swim();
        }
        System.out.println("--------------");
    }
}
