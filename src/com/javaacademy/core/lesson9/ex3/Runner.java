package com.javaacademy.core.lesson9.ex3;

public class Runner {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(100);
        Truck truck = new Truck();
        System.out.println(Car.Engine.getPower());
    }
}
