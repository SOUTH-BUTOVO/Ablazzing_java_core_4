package com.javaacademy.core.homework4.ex1;

public abstract class Car {
    private boolean isClean; // Чистая
    private double length; // Длинна
    private double width; // Ширина
    private double height; // Высота

    public Car(boolean isClean, double length, double width, double height) {
        this.isClean = isClean;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void clean() {
        isClean = true;
    }

    public boolean isClean() {
        return isClean;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
