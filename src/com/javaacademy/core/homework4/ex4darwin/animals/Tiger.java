package com.javaacademy.core.homework4.ex4darwin.animals;

public class Tiger extends Predator {
    private static final int AGILE_MODIFICATION_ATTACK = 2;
    public Tiger(double weight) {
        super(weight * AGILE_MODIFICATION_ATTACK);
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
