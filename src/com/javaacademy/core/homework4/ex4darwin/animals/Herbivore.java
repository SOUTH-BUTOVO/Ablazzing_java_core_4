package com.javaacademy.core.homework4.ex4darwin.animals;

public abstract class Herbivore extends Live {
    public Herbivore(double weight) {
        super(weight);
    }

    public void run() {
        if (!this.isAlive()){
            throw new RuntimeException(this.name + " не может бегать");
        }
    }
}
