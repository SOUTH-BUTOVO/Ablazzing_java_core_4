package com.javaacademy.core.lesson6.ex1.car;

public class LightCar extends Car {

    public LightCar(int weight, int maxSpeed, String color) {
        super(weight, maxSpeed, color);
    }

    public void prtInfo() {
        System.out.println("Вес машины: " + this.weight);
    }
}
