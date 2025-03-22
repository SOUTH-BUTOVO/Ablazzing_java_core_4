package com.javaacademy.core.homework4.ex4darwin.animals;

public class Rabbit extends Herbivore {
    public Rabbit(double weight) {
        super(weight);
        this.name = "Кролик";
    }

    @Override
    public void run() {
        try {
            super.run();
            System.out.println(name + " быстро бежит");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
