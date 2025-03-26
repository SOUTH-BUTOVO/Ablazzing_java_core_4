package com.javaacademy.core.lesson9.ex3;

public class Car {

    public static class Engine {
        private static int power;

        public Engine(int power) {
            this.power = power;
        }

        public static int getPower() {
            return power;
        }
    }
}

class Moto {

}
