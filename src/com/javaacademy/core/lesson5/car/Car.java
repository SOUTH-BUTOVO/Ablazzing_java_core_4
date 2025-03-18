package com.javaacademy.core.lesson5.car;

public class Car {
    public static final String START_ENGINE = "Двигатель запущен";
    private int weight = 1_000;
    private final String carType;

    public Car(String carType) {
        this.carType = carType;
    }

    public Car(int weight, String carType) {
        this.weight = weight;
        this.carType = carType;
    }

    /**
     * Запуск машины
     */
    public void turnButton() {
        runEngine();
        turnLights();
    }

    /**
     * Запуск двигателя
     */
    private void runEngine() {
        System.out.println(START_ENGINE);
    }

    /**
     * Включение фар
     */
    public void turnLights() {
        System.out.println("Фары включены");
    }

    public void infoCar() {
        System.out.printf("Тип машины: %s\nВес машины: %s", carType, weight);
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Car{" + "weight=" + weight + ", carType='" + carType + '\'' + '}';
    }
}
