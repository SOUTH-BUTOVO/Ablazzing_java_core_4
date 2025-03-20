package com.javaacademy.core.homework3.factory;

public class Camera {
    private int numberMegaPixel;

    public Camera(int numberMegaPixel) {
        this.numberMegaPixel = numberMegaPixel;
    }

    public int getNumberMegaPixel() {
        return numberMegaPixel;
    }

    @Override
    public String toString() {
        return "" + numberMegaPixel;
    }
}
