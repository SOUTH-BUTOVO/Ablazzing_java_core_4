package com.javaacademy.core.lesson9.ex4;

public class Runner {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer();
        swimmer.train1();
        swimmer.train3();
        System.out.println("----------------");

        SportHuman soccerMan = new SportHuman() {
            @Override
            public void train1() {
                System.out.println("Футболист бьёт по мячу!");
            }
            @Override
            public void train2() {
                System.out.println("Футболист ударил выше ворот.");
            }
//            @Override
//            public void train3() {
//                System.out.println("Футболист грустит в раздевалке.");
//            }
        };
        soccerMan.train1();
        soccerMan.train2();
        soccerMan.train3();
    }
}
