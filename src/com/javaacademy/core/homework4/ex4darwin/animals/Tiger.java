package com.javaacademy.core.homework4.ex4darwin.animals;

public class Tiger extends Predator {
    public Tiger(double weight) {
        super(weight * 2);
        this.name = "Тигр";
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
