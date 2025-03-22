package com.javaacademy.core.homework4.ex4darwin.animals;

public abstract class Predator extends Live {
    public Predator(double weight) {
        super(weight);
    }

    public void attack(Live live) {
        if (this.isAlive()) {
            if (live.getWeight() > this.weight) {
                System.out.printf("%s погиб при нападении на %s\n", this.name, live.getName());
                this.notAlive();
            } else {
                System.out.printf("%s съедает %s\n", this.name, live.name);
                this.setWeight(this.weight + (live.getWeight() * 0.3));
                live.notAlive();
            }
        } else {
            throw new RuntimeException(this.name + " не может нападать");
        }
    }
}
