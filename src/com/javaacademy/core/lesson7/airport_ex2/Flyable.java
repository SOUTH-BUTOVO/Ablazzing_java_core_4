package com.javaacademy.core.lesson7.airport_ex2;

public interface Flyable {
    public static final String NAME = " ";

    void fly();

    default void landing() {
        System.out.println("летящий объект приземлился");
    }
}
