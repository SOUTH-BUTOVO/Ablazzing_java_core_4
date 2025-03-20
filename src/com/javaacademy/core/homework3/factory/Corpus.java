package com.javaacademy.core.homework3.factory;

public class Corpus {
    private int length;
    private int width;
    private int thickness;

    public Corpus(int length, int width, int thickness) {
        this.length = length;
        this.width = width;
        this.thickness = thickness;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return "Corpus{" + "длина=" + length + ", ширина=" + width + ", толщина=" + thickness + '}';
    }
}
