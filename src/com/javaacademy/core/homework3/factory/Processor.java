package com.javaacademy.core.homework3.factory;

public class Processor {
    private int power;

    public Processor(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Processor{" + "power=" + power + '}';
    }
}
