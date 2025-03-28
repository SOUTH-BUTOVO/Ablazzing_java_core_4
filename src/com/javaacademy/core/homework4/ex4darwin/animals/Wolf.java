package com.javaacademy.core.homework4.ex4darwin.animals;

public class Wolf extends Predator {
    public Wolf(double weight) {
        super(weight);
        this.name = "Волк";
    }

    @Override
    public void attack(Live live) {
        try {
            super.attack(live);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
