package com.javaacademy.core.lesson7.airport_ex2;

public class Mi8Helicopter extends Helicopter {
    @Override
    public void fly() {
        System.out.println("Вертолёт Ми-8 летит!");
    }

    public void catapultPilot() {
        System.out.println("Пилот катапультировался");
    }
}
