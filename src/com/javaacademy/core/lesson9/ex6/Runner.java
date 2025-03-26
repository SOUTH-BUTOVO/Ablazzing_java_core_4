package com.javaacademy.core.lesson9.ex6;

public class Runner {
    public static void main(String[] args) {
        Actionable tiger = new Actionable("Тигр") {
            @Override
            public void run(Actionable actionable) {
                System.out.printf("Тигр бежит за %s\n", this);
            }

            @Override
            public void voice() {
                System.out.println("Тигр рычит");
            }

            @Override
            public void sleeps() {
                System.out.println("Тигр спит");
            }

            @Override
            public String toString() {
                return "Зайцем";
            }
        };

        Actionable dog = new Actionable("Собака") {
            @Override
            public void run(Actionable actionable) {
                System.out.printf("Собака бежит за %s\n", actionable.getName());
            }

            @Override
            public void voice() {
                System.out.println("Собака рычит");
            }

            @Override
            public void sleeps() {
                System.out.println("Собака спит");
            }

            @Override
            public String toString() {
                return "Кошкой";
            }
        };

        dog.run(tiger);
        tiger.run(dog);
        dog.voice();
        dog.sleeps();
    }
}
