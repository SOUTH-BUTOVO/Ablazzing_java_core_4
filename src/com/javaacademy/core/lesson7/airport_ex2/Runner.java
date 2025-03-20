package com.javaacademy.core.lesson7.airport_ex2;

public class Runner {
    public static void main(String[] args) {
//        Airplane airplane = new Airplane(100);
        Duck duck = new Duck(true);
//
//        Flyable[] flyables = {airplane, duck};
//        for (Flyable flyable : flyables) {
//            flyable.fly();
//            flyable.landing();
//        }

        Helicopter mi8Helicopter = new Mi8Helicopter();
        mi8Helicopter.flyVertical();
        mi8Helicopter.fly();

        Flyable flyable = new Mi8Helicopter();
        flyable.landing();

        duck.landing();
    }
}
