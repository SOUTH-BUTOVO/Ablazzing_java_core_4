package com.javaacademy.core.lesson8.ex1;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(10);
        try {
            car.go();
            System.out.println("Машина в порядке, поэтому едем на море");
        } catch (Exception e) {
            System.out.printf("С машиной что то не так %s, едем на море на поезде. ", e.getMessage());
        }
    }
}
