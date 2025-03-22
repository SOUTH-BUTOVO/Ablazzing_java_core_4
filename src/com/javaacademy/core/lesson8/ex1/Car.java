package com.javaacademy.core.lesson8.ex1;

public class Car {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public void go() throws CarHasNoFuelException {
        if (fuel <= 0) {
//            System.out.println("Ошибка, машина никуда не едет");
            throw new CarHasNoFuelException("У машины нет бензина");
        }
//            System.out.println("Ура машина едет!");
    }
}
