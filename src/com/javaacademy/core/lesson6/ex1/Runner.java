package com.javaacademy.core.lesson6.ex1;

import com.javaacademy.core.lesson6.ex1.car.LightCar;
import com.javaacademy.core.lesson6.ex1.car.Truck;

public class Runner {
    public static void main(String[] args) {
        LightCar lightCar = new LightCar(120, 120,"Black");
        System.out.println(lightCar);
        lightCar.prtInfo();

        Truck truck = new Truck(10_000, 80, "Blue");
        System.out.println(truck);
        truck.truckInfo();
    }
}
