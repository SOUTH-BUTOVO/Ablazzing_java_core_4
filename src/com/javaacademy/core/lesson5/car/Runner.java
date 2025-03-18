package com.javaacademy.core.lesson5.car;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car(1_200, "Легковая");
        Car car2 = new Car("Грузовая");
        car1.turnButton();
//        car.runEngine();

//        System.out.println("Вес машины: " + car1.getWeight());

        System.out.println("---------------------");
        car1.infoCar();

        System.out.println("\n---------------------");
        System.out.println(car1);
    }
}
