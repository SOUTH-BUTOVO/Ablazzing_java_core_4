package com.javaacademy.core.lesson9.ex5;

public class Runner {
    public static void main(String[] args) {

        Movable movable1 = () -> System.out.println("Вертолёт летит в перёд!");
        Movable movable2 = () -> {
            System.out.println("Ящерица ползёт в перёд!");
        };
        Movable movable3 = new Movable() {
            @Override
            public void go() {
                System.out.println("Лодка плывёт в перёд!");
            }
        };

        for (Movable movable : new Movable[]{movable1, movable2, movable3}) {
            movable.go();
        }
    }
}
