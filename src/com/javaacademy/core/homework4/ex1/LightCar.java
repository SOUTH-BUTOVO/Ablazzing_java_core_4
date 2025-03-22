package com.javaacademy.core.homework4.ex1;

public class LightCar extends Car {
    private boolean hasCruiseControl; // Наличие круиз контроля

    public LightCar(boolean isClean, double length, double width, double height, boolean hasCruiseControl) {
        super(isClean, length, width, height);
        this.hasCruiseControl = hasCruiseControl;
    }

    public boolean isHasCruiseControl() {
        return hasCruiseControl;
    }

}
