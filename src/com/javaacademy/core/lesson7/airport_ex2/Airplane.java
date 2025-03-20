package com.javaacademy.core.lesson7.airport_ex2;

public class Airplane implements Flyable {
    private int enginePower;

    public Airplane(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void fly() {
        if (enginePower > 0) {
            System.out.println("Самолёт летит");
        }
    }

    @Override
    public void landing() {
        System.out.println("Самолёт приземлился");
    }
}
