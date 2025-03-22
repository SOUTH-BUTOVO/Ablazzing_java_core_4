package com.javaacademy.core.homework4.ex1;

public class Bus extends Car {
    private int maxNumPassengers; // Наличие круиз контроля

    public Bus(boolean isClean, double length, double width, double height, int maxNumPassengers) {
        super(isClean, length, width, height);
        this.maxNumPassengers = maxNumPassengers;
    }

    public int getMaxNumPassengers() {
        return maxNumPassengers;
    }
}
