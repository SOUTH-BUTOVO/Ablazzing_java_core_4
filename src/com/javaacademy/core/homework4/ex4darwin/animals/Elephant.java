package com.javaacademy.core.homework4.ex4darwin.animals;

public class Elephant extends Herbivore {
    public Elephant(double weight) {
        super(weight);
        this.name = "Слон";
    }

    @Override
    public void run() {
        System.out.println(name + " медленно бежит");
    }
}
