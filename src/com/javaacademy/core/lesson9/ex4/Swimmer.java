package com.javaacademy.core.lesson9.ex4;

public class Swimmer extends SportHuman {

    @Override
    public void train1() {
        System.out.println("Пловец готовится к соревнованию.");
    }

    @Override
    public void train2() {
        System.out.println("Пловец готов к соревнованию.");
    }
}
